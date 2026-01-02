// Generated from grammers/PythonParser.g4 by ANTLR 4.13.2
package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ProgramBlock}
	 * labeled alternative in {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramBlock(PythonParser.ProgramBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProgramBlock}
	 * labeled alternative in {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramBlock(PythonParser.ProgramBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleStmtBlock}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmtBlock(PythonParser.SimpleStmtBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleStmtBlock}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmtBlock(PythonParser.SimpleStmtBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmt(PythonParser.CompoundStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmt(PythonParser.CompoundStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorStmt(PythonParser.DecoratorStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorStmt(PythonParser.DecoratorStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyLine}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyLine(PythonParser.EmptyLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyLine}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyLine(PythonParser.EmptyLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratedFuncDef}
	 * labeled alternative in {@link PythonParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterDecoratedFuncDef(PythonParser.DecoratedFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratedFuncDef}
	 * labeled alternative in {@link PythonParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitDecoratedFuncDef(PythonParser.DecoratedFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfMainStmt}
	 * labeled alternative in {@link PythonParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfMainStmt(PythonParser.IfMainStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfMainStmt}
	 * labeled alternative in {@link PythonParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfMainStmt(PythonParser.IfMainStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiSimpleStmt}
	 * labeled alternative in {@link PythonParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultiSimpleStmt(PythonParser.MultiSimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiSimpleStmt}
	 * labeled alternative in {@link PythonParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultiSimpleStmt(PythonParser.MultiSimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStmtStmt}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmtStmt(PythonParser.ImportStmtStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStmtStmt}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmtStmt(PythonParser.ImportStmtStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmtStmt}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmtStmt(PythonParser.ReturnStmtStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmtStmt}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmtStmt(PythonParser.ReturnStmtStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmtStmt}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmtStmt(PythonParser.AssignStmtStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmtStmt}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmtStmt(PythonParser.AssignStmtStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmtStmt}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmtStmt(PythonParser.ExprStmtStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmtStmt}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmtStmt(PythonParser.ExprStmtStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link PythonParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(PythonParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link PythonParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(PythonParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalParams}
	 * labeled alternative in {@link PythonParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterNormalParams(PythonParser.NormalParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalParams}
	 * labeled alternative in {@link PythonParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitNormalParams(PythonParser.NormalParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RouteParam}
	 * labeled alternative in {@link PythonParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterRouteParam(PythonParser.RouteParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RouteParam}
	 * labeled alternative in {@link PythonParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitRouteParam(PythonParser.RouteParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleLineSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSingleLineSuite(PythonParser.SingleLineSuiteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleLineSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSingleLineSuite(PythonParser.SingleLineSuiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndentedSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterIndentedSuite(PythonParser.IndentedSuiteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndentedSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitIndentedSuite(PythonParser.IndentedSuiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleStmtSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSingleStmtSuite(PythonParser.SingleStmtSuiteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleStmtSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSingleStmtSuite(PythonParser.SingleStmtSuiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmtExpr}
	 * labeled alternative in {@link PythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmtExpr(PythonParser.ReturnStmtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmtExpr}
	 * labeled alternative in {@link PythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmtExpr(PythonParser.ReturnStmtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmtExpr}
	 * labeled alternative in {@link PythonParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmtExpr(PythonParser.AssignStmtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmtExpr}
	 * labeled alternative in {@link PythonParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmtExpr(PythonParser.AssignStmtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfMainBlock}
	 * labeled alternative in {@link PythonParser#ifMainStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfMainBlock(PythonParser.IfMainBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfMainBlock}
	 * labeled alternative in {@link PythonParser#ifMainStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfMainBlock(PythonParser.IfMainBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RouteDecorator}
	 * labeled alternative in {@link PythonParser#decoratorStatement}.
	 * @param ctx the parse tree
	 */
	void enterRouteDecorator(PythonParser.RouteDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RouteDecorator}
	 * labeled alternative in {@link PythonParser#decoratorStatement}.
	 * @param ctx the parse tree
	 */
	void exitRouteDecorator(PythonParser.RouteDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link PythonParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterFromImportStmt(PythonParser.FromImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link PythonParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitFromImportStmt(PythonParser.FromImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportListExpr}
	 * labeled alternative in {@link PythonParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportListExpr(PythonParser.ImportListExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportListExpr}
	 * labeled alternative in {@link PythonParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportListExpr(PythonParser.ImportListExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DottedNameExpr}
	 * labeled alternative in {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void enterDottedNameExpr(PythonParser.DottedNameExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DottedNameExpr}
	 * labeled alternative in {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void exitDottedNameExpr(PythonParser.DottedNameExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCallExprExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExprExpr(PythonParser.FuncCallExprExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCallExprExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExprExpr(PythonParser.FuncCallExprExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListExprExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListExprExpr(PythonParser.ListExprExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListExprExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListExprExpr(PythonParser.ListExprExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictExprExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDictExprExpr(PythonParser.DictExprExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictExprExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDictExprExpr(PythonParser.DictExprExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenExprExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGenExprExpr(PythonParser.GenExprExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenExprExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGenExprExpr(PythonParser.GenExprExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExprExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExprExpr(PythonParser.PrimaryExprExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExprExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExprExpr(PythonParser.PrimaryExprExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCallExprCall}
	 * labeled alternative in {@link PythonParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExprCall(PythonParser.FuncCallExprCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCallExprCall}
	 * labeled alternative in {@link PythonParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExprCall(PythonParser.FuncCallExprCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgListExpr}
	 * labeled alternative in {@link PythonParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgListExpr(PythonParser.ArgListExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgListExpr}
	 * labeled alternative in {@link PythonParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgListExpr(PythonParser.ArgListExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PositionalArgExpr}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArgExpr(PythonParser.PositionalArgExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PositionalArgExpr}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArgExpr(PythonParser.PositionalArgExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GeneratorArgExpr}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorArgExpr(PythonParser.GeneratorArgExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeneratorArgExpr}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorArgExpr(PythonParser.GeneratorArgExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeywordArgExpr}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterKeywordArgExpr(PythonParser.KeywordArgExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeywordArgExpr}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitKeywordArgExpr(PythonParser.KeywordArgExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GeneratorExprExpr}
	 * labeled alternative in {@link PythonParser#genExpr}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorExprExpr(PythonParser.GeneratorExprExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeneratorExprExpr}
	 * labeled alternative in {@link PythonParser#genExpr}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorExprExpr(PythonParser.GeneratorExprExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictAccessExprPrimary}
	 * labeled alternative in {@link PythonParser#dictAccess}.
	 * @param ctx the parse tree
	 */
	void enterDictAccessExprPrimary(PythonParser.DictAccessExprPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictAccessExprPrimary}
	 * labeled alternative in {@link PythonParser#dictAccess}.
	 * @param ctx the parse tree
	 */
	void exitDictAccessExprPrimary(PythonParser.DictAccessExprPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListLiteralExpr}
	 * labeled alternative in {@link PythonParser#listExpression}.
	 * @param ctx the parse tree
	 */
	void enterListLiteralExpr(PythonParser.ListLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListLiteralExpr}
	 * labeled alternative in {@link PythonParser#listExpression}.
	 * @param ctx the parse tree
	 */
	void exitListLiteralExpr(PythonParser.ListLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementListSequence}
	 * labeled alternative in {@link PythonParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementListSequence(PythonParser.ElementListSequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementListSequence}
	 * labeled alternative in {@link PythonParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementListSequence(PythonParser.ElementListSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictLiteralExpr}
	 * labeled alternative in {@link PythonParser#dictExpression}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteralExpr(PythonParser.DictLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictLiteralExpr}
	 * labeled alternative in {@link PythonParser#dictExpression}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteralExpr(PythonParser.DictLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeyValuePairListSeq}
	 * labeled alternative in {@link PythonParser#keyValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePairListSeq(PythonParser.KeyValuePairListSeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeyValuePairListSeq}
	 * labeled alternative in {@link PythonParser#keyValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePairListSeq(PythonParser.KeyValuePairListSeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeyValuePairEntry}
	 * labeled alternative in {@link PythonParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePairEntry(PythonParser.KeyValuePairEntryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeyValuePairEntry}
	 * labeled alternative in {@link PythonParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePairEntry(PythonParser.KeyValuePairEntryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierPrimary}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierPrimary(PythonParser.IdentifierPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierPrimary}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierPrimary(PythonParser.IdentifierPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteralPrimary}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteralPrimary(PythonParser.NumberLiteralPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteralPrimary}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteralPrimary(PythonParser.NumberLiteralPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteralPrimary}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralPrimary(PythonParser.StringLiteralPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteralPrimary}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralPrimary(PythonParser.StringLiteralPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExprPrimary}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterParenExprPrimary(PythonParser.ParenExprPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExprPrimary}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitParenExprPrimary(PythonParser.ParenExprPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictAccessPrimary}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterDictAccessPrimary(PythonParser.DictAccessPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictAccessPrimary}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitDictAccessPrimary(PythonParser.DictAccessPrimaryContext ctx);
}