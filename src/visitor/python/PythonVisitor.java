package visitor.python;

import antlr.PythonParser;
import antlr.PythonParserBaseVisitor;
//import astHtml.PositionalArgumentNode;
import astPython.*;

public class PythonVisitor extends PythonParserBaseVisitor<AstNode> {

    // program: statement* EOF
    @Override
    public AstNode visitProgramBlock(PythonParser.ProgramBlockContext ctx) {
        PythonFileNode fileNode = new PythonFileNode(ctx.getStart().getLine());
        for (PythonParser.StatementContext stmt : ctx.statement()) {
            AstNode child = visit(stmt);
            if (child != null) {
                fileNode.addChild(child);
            }
        }
        return fileNode;
    }

    // statement: simpleStatement (NEWLINE | EOF) | compoundStatement | decoratorStatement | NEWLINE
    @Override
    public AstNode visitSimpleStmtBlock(PythonParser.SimpleStmtBlockContext ctx) {
        return visit(ctx.simpleStatement());
    }

    @Override
    public AstNode visitCompoundStmt(PythonParser.CompoundStmtContext ctx) {
        return visit(ctx.compoundStatement());
    }

    @Override
    public AstNode visitDecoratorStmt(PythonParser.DecoratorStmtContext ctx) {
        return visit(ctx.decoratorStatement());
    }

    @Override
    public AstNode visitEmptyLine(PythonParser.EmptyLineContext ctx) {
        return null; // لا نضيف عقدة للسطر الفارغ
    }

    // compoundStatement: decoratorStatement* functionDef | ifMainStatement
    @Override
    public AstNode visitDecoratedFuncDef(PythonParser.DecoratedFuncDefContext ctx) {
        // أولاً نضيف الـ decorators كأبناء
        FunctionDefNode funcNode = (FunctionDefNode) visit(ctx.functionDef());
        for (PythonParser.DecoratorStatementContext dec : ctx.decoratorStatement()) {
            AstNode decorator = visit(dec);
            if (decorator != null) {
                funcNode.addChild(decorator);
            }
        }
        return funcNode;
    }

    @Override
    public AstNode visitIfMainStmt(PythonParser.IfMainStmtContext ctx) {
        return visit(ctx.ifMainStatement());
    }

    // simpleStatement: simpleStmt (COMMA simpleStmt)*
    @Override
    public AstNode visitMultiSimpleStmt(PythonParser.MultiSimpleStmtContext ctx) {
        // نعاملها كسطر واحد يحتوي على عدة تعليمات (نختار الأخيرة أو نضيف الكل كأبناء لعقدة وهمية إذا أردت)
        // لكن للبساطة والتوافق مع المشروع، نرجع فقط آخر تعليمة (شائع في AST بسيطة)
        PythonParser.SimpleStmtContext last = ctx.simpleStmt(ctx.simpleStmt().size() - 1);
        return visit(last);
    }

    // simpleStmt: importStatement | returnStatement | assignStatement | expression
    @Override
    public AstNode visitImportStmtStmt(PythonParser.ImportStmtStmtContext ctx) {
        return visit(ctx.importStatement());
    }

    @Override
    public AstNode visitReturnStmtStmt(PythonParser.ReturnStmtStmtContext ctx) {
        return visit(ctx.returnStatement());
    }

    @Override
    public AstNode visitAssignStmtStmt(PythonParser.AssignStmtStmtContext ctx) {
        return visit(ctx.assignStatement());
    }

    @Override
    public AstNode visitExprStmtStmt(PythonParser.ExprStmtStmtContext ctx) {
        return visit(ctx.expression());
    }

    // functionDef: DEF ID LPAREN paramList? RPAREN COLON suite
    @Override
    public AstNode visitFuncDef(PythonParser.FuncDefContext ctx) {
        String funcName = ctx.ID().getText();
        FunctionDefNode node = new FunctionDefNode(funcName, ctx.getStart().getLine());

        // إضافة body (suite)
        node.addChild(visit(ctx.suite()));

        return node;
    }

    // suite: simpleStatement NEWLINE | NEWLINE INDENT statement+ DEDENT | NEWLINE simpleStatement NEWLINE
    @Override
    public AstNode visitSingleLineSuite(PythonParser.SingleLineSuiteContext ctx) {
        return visit(ctx.simpleStatement());
    }

    @Override
    public AstNode visitIndentedSuite(PythonParser.IndentedSuiteContext ctx) {
        // نعامل الـ block كحاوية وهمية (أو نرجع الأبناء مباشرة، لكن نضيف عقدة للتمييز)
        AstNode block = new AstNode("Block", ctx.getStart().getLine()) {
            @Override
            public String toString() {
                return "Block (line " + lineNumber + ")";
            }
        };
        for (PythonParser.StatementContext stmt : ctx.statement()) {
            AstNode child = visit(stmt);
            if (child != null) block.addChild(child);
        }
        return block;
    }

    @Override
    public AstNode visitSingleStmtSuite(PythonParser.SingleStmtSuiteContext ctx) {
        return visit(ctx.simpleStatement());
    }

    // returnStatement: RETURN expression
    @Override
    public AstNode visitReturnStmtExpr(PythonParser.ReturnStmtExprContext ctx) {
        ReturnNode node = new ReturnNode(ctx.getStart().getLine());
        node.addChild(visit(ctx.expression()));
        return node;
    }

    // assignStatement: ID ASSIGN expression
    @Override
    public AstNode visitAssignStmtExpr(PythonParser.AssignStmtExprContext ctx) {
        String target = ctx.ID().getText();
        AssignNode node = new AssignNode(target, ctx.getStart().getLine());
        node.addChild(visit(ctx.expression()));
        return node;
    }

    // ifMainStatement: IF ID EQ STRING COLON suite
    @Override
    public AstNode visitIfMainBlock(PythonParser.IfMainBlockContext ctx) {
        IfMainNode node = new IfMainNode(ctx.getStart().getLine());
        node.addChild(visit(ctx.suite()));
        return node;
    }

    // decoratorStatement: AT dottedName LPAREN STRING RPAREN NEWLINE?
    @Override
    public AstNode visitRouteDecorator(PythonParser.RouteDecoratorContext ctx) {
        String routePath = ctx.STRING().getText(); // مثل "/"
        RouteDecoratorNode node = new RouteDecoratorNode(routePath, ctx.getStart().getLine());
        // يمكن إضافة الـ dottedName كطفل إذا أردت (مثل app.route)
        node.addChild(visit(ctx.dottedName()));
        return node;
    }

    // importStatement: FROM dottedName IMPORT importList
    @Override
    public AstNode visitFromImportStmt(PythonParser.FromImportStmtContext ctx) {
        String module = ctx.dottedName().getText();
        ImportFromNode node = new ImportFromNode(module, ctx.getStart().getLine());
        node.addChild(visit(ctx.importList()));
        return node;
    }

    // dottedName: ID (DOT ID)*
    @Override
    public AstNode visitDottedNameExpr(PythonParser.DottedNameExprContext ctx) {
        // نرجع اسم كامل كـ NameNode (أو نصمم عقدة خاصة إذا أردت)
        String fullName = ctx.getText();
        return new NameNode(fullName, ctx.getStart().getLine());
    }

    // expression: callExpression | listExpression | dictExpression | genExpr | primary
    @Override
    public AstNode visitFuncCallExprExpr(PythonParser.FuncCallExprExprContext ctx) {
        return visit(ctx.callExpression());
    }

    @Override
    public AstNode visitListExprExpr(PythonParser.ListExprExprContext ctx) {
        return visit(ctx.listExpression());
    }

    @Override
    public AstNode visitDictExprExpr(PythonParser.DictExprExprContext ctx) {
        return visit(ctx.dictExpression());
    }

    @Override
    public AstNode visitGenExprExpr(PythonParser.GenExprExprContext ctx) {
        return visit(ctx.genExpr());
    }

    @Override
    public AstNode visitPrimaryExprExpr(PythonParser.PrimaryExprExprContext ctx) {
        return visit(ctx.primary());
    }

    // callExpression: dottedName LPAREN argList? RPAREN
    @Override
    public AstNode visitFuncCallExprCall(PythonParser.FuncCallExprCallContext ctx) {
        String funcName = ctx.dottedName().getText();
        CallNode node = new CallNode(funcName, ctx.getStart().getLine());
        if (ctx.argList() != null) {
            node.addChild(visit(ctx.argList()));
        }
        return node;
    }

    // argList: argument (COMMA argument)*
    @Override
    public AstNode visitArgListExpr(PythonParser.ArgListExprContext ctx) {
        ArgumentListNode list = new ArgumentListNode(ctx.getStart().getLine());
        for (PythonParser.ArgumentContext arg : ctx.argument()) {
            list.addChild(visit(arg));
        }
        return list;
    }

    // argument: expression | genExpr | ID ASSIGN expression
    @Override
    public AstNode visitPositionalArgExpr(PythonParser.PositionalArgExprContext ctx) {
        PositionalArgumentNode node = new PositionalArgumentNode(ctx.getStart().getLine());
        node.addChild(visit(ctx.expression()));
        return node;
    }

    @Override
    public AstNode visitGeneratorArgExpr(PythonParser.GeneratorArgExprContext ctx) {
        return visit(ctx.genExpr());
    }

    @Override
    public AstNode visitKeywordArgExpr(PythonParser.KeywordArgExprContext ctx) {
        String name = ctx.ID().getText();
        KeywordArgumentNode node = new KeywordArgumentNode(name, ctx.getStart().getLine());
        node.addChild(visit(ctx.expression()));
        return node;
    }

    // genExpr: LPAREN ID FOR ID IN dottedName IF dictAccess EQ ID RPAREN
    @Override
    public AstNode visitGeneratorExprExpr(PythonParser.GeneratorExprExprContext ctx) {
        GeneratorExprNode node = new GeneratorExprNode(ctx.getStart().getLine());
        // يمكن إضافة تفاصيل أكثر إذا أردت، لكن هذا كافي للطباعة
        node.addChild(new NameNode(ctx.ID(0).getText(), ctx.getStart().getLine())); // item
        node.addChild(new NameNode(ctx.ID(1).getText(), ctx.getStart().getLine())); // key في dict
        node.addChild(visit(ctx.dottedName()));
        return node;
    }

    // dictAccess: ID LBRACK STRING RBRACK
    @Override
    public AstNode visitDictAccessExprPrimary(PythonParser.DictAccessExprPrimaryContext ctx) {
        String key = ctx.STRING().getText();
        String var = ctx.ID().getText();
        DictAccessNode node = new DictAccessNode(key, ctx.getStart().getLine());
        node.addChild(new NameNode(var, ctx.getStart().getLine()));
        return node;
    }

    // listExpression: LBRACK NEWLINE* elementList? NEWLINE* RBRACK
    @Override
    public AstNode visitListLiteralExpr(PythonParser.ListLiteralExprContext ctx) {
        ListNode node = new ListNode(ctx.getStart().getLine());
        if (ctx.elementList() != null) {
            node.addChild(visit(ctx.elementList()));
        }
        return node;
    }

    // dictExpression: LBRACE NEWLINE* keyValuePairList? NEWLINE* RBRACE
    @Override
    public AstNode visitDictLiteralExpr(PythonParser.DictLiteralExprContext ctx) {
        DictNode node = new DictNode(ctx.getStart().getLine());
        if (ctx.keyValuePairList() != null) {
            node.addChild(visit(ctx.keyValuePairList()));
        }
        return node;
    }

    @Override
    public AstNode visitKeyValuePairListSeq(PythonParser.KeyValuePairListSeqContext ctx) {
        // نرجع حاوية وهمية أو نضيف مباشرة، لكن للتوافق نستخدم AstNode مخصص
        AstNode container = new AstNode("KeyValueList", ctx.getStart().getLine()) {
            @Override
            public String toString() {
                return "KeyValueList (line " + lineNumber + ")";
            }
        };
        for (PythonParser.KeyValuePairContext kv : ctx.keyValuePair()) {
            container.addChild(visit(kv));
        }
        return container;
    }

    @Override
    public AstNode visitKeyValuePairEntry(PythonParser.KeyValuePairEntryContext ctx) {
        String key = ctx.STRING().getText();
        KeyValuePairNode node = new KeyValuePairNode(key, ctx.getStart().getLine());
        node.addChild(visit(ctx.expression()));
        return node;
    }

    // primary: ID | NUMBER | STRING | LPAREN expression RPAREN | dictAccess
    @Override
    public AstNode visitIdentifierPrimary(PythonParser.IdentifierPrimaryContext ctx) {
        return new NameNode(ctx.ID().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitNumberLiteralPrimary(PythonParser.NumberLiteralPrimaryContext ctx) {
        return new NumberLiteralNode(ctx.NUMBER().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitStringLiteralPrimary(PythonParser.StringLiteralPrimaryContext ctx) {
        return new StringLiteralNode(ctx.STRING().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitParenExprPrimary(PythonParser.ParenExprPrimaryContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public AstNode visitDictAccessPrimary(PythonParser.DictAccessPrimaryContext ctx) {
        return visit(ctx.dictAccess());
    }
}