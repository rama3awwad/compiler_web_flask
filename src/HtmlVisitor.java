
package visitor.html;

import antlr.JinjaParser;
import antlr.JinjaParserBaseVisitor;
import astHtml.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class HtmlVisitor extends JinjaParserBaseVisitor<AstNode> {

    @Override
    public AstNode visitFileRoot(JinjaParser.FileRootContext ctx) {
        FileNode fileNode = new FileNode(ctx.getStart().getLine());
        for (JinjaParser.ElementContext e : ctx.element()) {
            fileNode.addChild(visit(e));
        }
        return fileNode;
    }

    @Override
    public AstNode visitDoctypeElement(JinjaParser.DoctypeElementContext ctx) {
        return new DoctypeNode(ctx.getStart().getLine());
    }

    @Override
    public AstNode visitTextElement(JinjaParser.TextElementContext ctx) {
        return new TextNode(ctx.HTML_TEXT().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitHtmlElementStatment(JinjaParser.HtmlElementStatmentContext ctx) {
        return visit(ctx.htmlElement());
    }

    @Override
    public AstNode visitVoidHtmlElementStatment(JinjaParser.VoidHtmlElementStatmentContext ctx) {
        return visit(ctx.voidHtmlElement());
    }

    @Override
    public AstNode visitJinjaExpressionElement(JinjaParser.JinjaExpressionElementContext ctx) {
        return super.visitJinjaExpressionElement(ctx);
    }

    @Override
    public AstNode visitJinjaIfElement(JinjaParser.JinjaIfElementContext ctx) {
        return super.visitJinjaIfElement(ctx);
    }

    @Override
    public AstNode visitJinjaForElement(JinjaParser.JinjaForElementContext ctx) {
        return super.visitJinjaForElement(ctx);
    }

    @Override
    public AstNode visitNormalHtmlTag(JinjaParser.NormalHtmlTagContext ctx) {
        HtmlElementNode node = new HtmlElementNode(ctx.NORMALTAGENAME(0).getText(), ctx.getStart().getLine());

        for (JinjaParser.AttributeContext attr : ctx.attribute()) {
            node.addChild(visit(attr));
        }
        for (JinjaParser.ElementContext e : ctx.element()) {
            node.addChild(visit(e));
        }

        if (ctx.NORMALTAGENAME().size() > 1) {
            HtmlElementNode closingTag = new HtmlElementNode(ctx.NORMALTAGENAME(1).getText(), ctx.getStop().getLine());
            node.addChild(closingTag);
        }

        return node;
    }

    @Override
    public AstNode visitVoidHtmlSelfClose(JinjaParser.VoidHtmlSelfCloseContext ctx) {
        VoidHtmlElementNode node = new VoidHtmlElementNode(ctx.VOIDTAGENAME().getText(), ctx.getStart().getLine());
        for (JinjaParser.AttributeContext attr : ctx.attribute()) {
            node.addChild(visit(attr));
        }
        return node;
    }

    @Override
    public AstNode visitVoidHtmlOpenOnly(JinjaParser.VoidHtmlOpenOnlyContext ctx) {
        VoidHtmlElementNode node = new VoidHtmlElementNode(ctx.VOIDTAGENAME().getText(), ctx.getStart().getLine());
        for (JinjaParser.AttributeContext attr : ctx.attribute()) {
            node.addChild(visit(attr));
        }
        return node;
    }

    @Override
    public AstNode visitTagNameStatment(JinjaParser.TagNameStatmentContext ctx) {
        return super.visitTagNameStatment(ctx);
    }

    @Override
    public AstNode visitAttributeStatment(JinjaParser.AttributeStatmentContext ctx) {
        AttributeNode attr = new AttributeNode(ctx.TAG_NAME().getText(), ctx.getStart().getLine());
        attr.addChild(visit(ctx.attrValue()));
        return attr;
    }

    @Override
    public AstNode visitAttributeValue(JinjaParser.AttributeValueContext ctx) {
        AttributeValueNode value = new AttributeValueNode(ctx.getStart().getLine());
        for (JinjaParser.AttrPartContext part : ctx.attrPart()) {
            value.addChild(visit(part));
        }
        return value;
    }

    @Override
    public AstNode visitAttributeText(JinjaParser.AttributeTextContext ctx) {
        return new AttributeTextNode(ctx.ATTR_TEXT().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitAttributeJinja(JinjaParser.AttributeJinjaContext ctx) {
        return visit(ctx.jinjaExpression());
    }


    @Override
    public AstNode visitJinjaExpressionStatment(JinjaParser.JinjaExpressionStatmentContext ctx) {
        JinjaExpressionNode node = new JinjaExpressionNode(ctx.getStart().getLine());
        node.addChild(visit(ctx.expression()));
        return node;
    }

@Override
public AstNode visitJinjaIfBlockStatment(JinjaParser.JinjaIfBlockStatmentContext ctx) {
    JinjaIfNode node = new JinjaIfNode(ctx.getStart().getLine());

    node.addChild(visit(ctx.expression()));

    for (JinjaParser.ElementContext e : ctx.element()) {
        node.addChild(visit(e));
    }

    TextNode endNode = new TextNode("{% endif %}", ctx.J_STMT_OPEN(ctx.J_STMT_OPEN().size()-1).getSymbol().getLine());
    node.addChild(endNode);

    return node;
}


    @Override
    public AstNode visitJinjaForBlockStatment(JinjaParser.JinjaForBlockStatmentContext ctx) {
        JinjaForNode node = new JinjaForNode(ctx.ID().getText(), ctx.getStart().getLine());
        node.addChild(visit(ctx.expression())); // المتغير iterable
        for (JinjaParser.ElementContext e : ctx.element()) { // الجسم
            node.addChild(visit(e));
        }
        return node;
    }

    @Override
    public AstNode visitExpressionStatment(JinjaParser.ExpressionStatmentContext ctx) {
        return visit(ctx.orExpr());
    }

    @Override
    public AstNode visitOrExpression(JinjaParser.OrExpressionContext ctx) {
        AstNode left = visit(ctx.andExpr(0));
        for (int i = 1; i < ctx.andExpr().size(); i++) {
            BinaryExpressionNode node = new BinaryExpressionNode("or", ctx.getStart().getLine());
            node.addChild(left);
            node.addChild(visit(ctx.andExpr(i)));
            left = node;
        }
        return left;
    }

    @Override
    public AstNode visitAndExpression(JinjaParser.AndExpressionContext ctx) {
        AstNode left = visit(ctx.notExpr(0));
        for (int i = 1; i < ctx.notExpr().size(); i++) {
            BinaryExpressionNode node = new BinaryExpressionNode("and", ctx.getStart().getLine());
            node.addChild(left);
            node.addChild(visit(ctx.notExpr(i)));
            left = node;
        }
        return left;
    }

    @Override
    public AstNode visitNotExpression(JinjaParser.NotExpressionContext ctx) {
        if (ctx.NOT() != null) {
            UnaryExpressionNode node = new UnaryExpressionNode("not", ctx.getStart().getLine());
            node.addChild(visit(ctx.notExpr()));
            return node;
        }
        return visit(ctx.getChild(0));
    }

    @Override
    public AstNode visitCompareExpressionOnly(JinjaParser.CompareExpressionOnlyContext ctx) {
        return visit(ctx.compareExpr());
    }

    @Override
    public AstNode visitCompareExpression(JinjaParser.CompareExpressionContext ctx) {
        AstNode left = visit(ctx.addExpr(0));
        for (int i = 1; i < ctx.addExpr().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            BinaryExpressionNode node = new BinaryExpressionNode(op, ctx.getStart().getLine());
            node.addChild(left);
            node.addChild(visit(ctx.addExpr(i)));
            left = node;
        }
        return left;
    }

    @Override
    public AstNode visitAddExpression(JinjaParser.AddExpressionContext ctx) {
        AstNode left = visit(ctx.mulExpr(0));
        for (int i = 1; i < ctx.mulExpr().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            BinaryExpressionNode node = new BinaryExpressionNode(op, ctx.getStart().getLine());
            node.addChild(left);
            node.addChild(visit(ctx.mulExpr(i)));
            left = node;
        }
        return left;
    }

    @Override
    public AstNode visitMulExpression(JinjaParser.MulExpressionContext ctx) {
        AstNode left = visit(ctx.primary(0));
        for (int i = 1; i < ctx.primary().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            BinaryExpressionNode node = new BinaryExpressionNode(op, ctx.getStart().getLine());
            node.addChild(left);
            node.addChild(visit(ctx.primary(i)));
            left = node;
        }
        return left;
    }

    @Override
    public AstNode visitIdPrimary(JinjaParser.IdPrimaryContext ctx) {
        return new IdentifierNode(ctx.ID().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitNumberPrimary(JinjaParser.NumberPrimaryContext ctx) {
        return new NumberLiteralNode(ctx.NUMBER().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitStringPrimary(JinjaParser.StringPrimaryContext ctx) {
        return new StringLiteralNode(ctx.STRING().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitParenExpression(JinjaParser.ParenExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public AstNode visitPropertyAccess(JinjaParser.PropertyAccessContext ctx) {
        PropertyAccessNode node = new PropertyAccessNode(ctx.getStart().getLine());
        node.addChild(visit(ctx.primary()));
        node.addChild(new IdentifierNode(ctx.ID().getText(), ctx.getStart().getLine()));
        return node;
    }

    @Override
    public AstNode visitFunctionCall(JinjaParser.FunctionCallContext ctx) {
        FunctionCallNode node = new FunctionCallNode(ctx.ID().getText(), ctx.getStart().getLine());
        if (ctx.argList() != null) node.addChild(visit(ctx.argList()));
        return node;
    }

    @Override
    public AstNode visitArgumentList(JinjaParser.ArgumentListContext ctx) {
        ArgumentListNode list = new ArgumentListNode(ctx.getStart().getLine());
        for (JinjaParser.ArgumentContext arg : ctx.argument()) {
            list.addChild(visit(arg));
        }
        return list;
    }

    @Override
    public AstNode visitPositionalArgument(JinjaParser.PositionalArgumentContext ctx) {
        PositionalArgumentNode node = new PositionalArgumentNode(ctx.getStart().getLine());
        node.addChild(visit(ctx.expression()));
        return node;
    }

    @Override
    public AstNode visitNamedArgument(JinjaParser.NamedArgumentContext ctx) {
        NamedArgumentNode node = new NamedArgumentNode(ctx.ID().getText(), ctx.getStart().getLine());
        node.addChild(visit(ctx.expression()));
        return node;
    }
}

