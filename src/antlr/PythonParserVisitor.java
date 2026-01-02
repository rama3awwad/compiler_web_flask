// Generated from grammers/PythonParser.g4 by ANTLR 4.13.2
package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ProgramBlock}
	 * labeled alternative in {@link PythonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramBlock(PythonParser.ProgramBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleStmtBlock}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmtBlock(PythonParser.SimpleStmtBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmt(PythonParser.CompoundStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorStmt(PythonParser.DecoratorStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyLine}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyLine(PythonParser.EmptyLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratedFuncDef}
	 * labeled alternative in {@link PythonParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratedFuncDef(PythonParser.DecoratedFuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfMainStmt}
	 * labeled alternative in {@link PythonParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfMainStmt(PythonParser.IfMainStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiSimpleStmt}
	 * labeled alternative in {@link PythonParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiSimpleStmt(PythonParser.MultiSimpleStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStmtStmt}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmtStmt(PythonParser.ImportStmtStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmtStmt}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmtStmt(PythonParser.ReturnStmtStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStmtStmt}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmtStmt(PythonParser.AssignStmtStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStmtStmt}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmtStmt(PythonParser.ExprStmtStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link PythonParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(PythonParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalParams}
	 * labeled alternative in {@link PythonParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalParams(PythonParser.NormalParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RouteParam}
	 * labeled alternative in {@link PythonParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteParam(PythonParser.RouteParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleLineSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleLineSuite(PythonParser.SingleLineSuiteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndentedSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndentedSuite(PythonParser.IndentedSuiteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleStmtSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStmtSuite(PythonParser.SingleStmtSuiteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmtExpr}
	 * labeled alternative in {@link PythonParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmtExpr(PythonParser.ReturnStmtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStmtExpr}
	 * labeled alternative in {@link PythonParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmtExpr(PythonParser.AssignStmtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfMainBlock}
	 * labeled alternative in {@link PythonParser#ifMainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfMainBlock(PythonParser.IfMainBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RouteDecorator}
	 * labeled alternative in {@link PythonParser#decoratorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteDecorator(PythonParser.RouteDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link PythonParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportStmt(PythonParser.FromImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportListExpr}
	 * labeled alternative in {@link PythonParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportListExpr(PythonParser.ImportListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DottedNameExpr}
	 * labeled alternative in {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedNameExpr(PythonParser.DottedNameExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCallExprExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExprExpr(PythonParser.FuncCallExprExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListExprExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExprExpr(PythonParser.ListExprExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictExprExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictExprExpr(PythonParser.DictExprExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenExprExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenExprExpr(PythonParser.GenExprExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExprExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExprExpr(PythonParser.PrimaryExprExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCallExprCall}
	 * labeled alternative in {@link PythonParser#callExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExprCall(PythonParser.FuncCallExprCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgListExpr}
	 * labeled alternative in {@link PythonParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgListExpr(PythonParser.ArgListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PositionalArgExpr}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArgExpr(PythonParser.PositionalArgExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GeneratorArgExpr}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratorArgExpr(PythonParser.GeneratorArgExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeywordArgExpr}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordArgExpr(PythonParser.KeywordArgExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GeneratorExprExpr}
	 * labeled alternative in {@link PythonParser#genExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratorExprExpr(PythonParser.GeneratorExprExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictAccessExprPrimary}
	 * labeled alternative in {@link PythonParser#dictAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictAccessExprPrimary(PythonParser.DictAccessExprPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListLiteralExpr}
	 * labeled alternative in {@link PythonParser#listExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteralExpr(PythonParser.ListLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementListSequence}
	 * labeled alternative in {@link PythonParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementListSequence(PythonParser.ElementListSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictLiteralExpr}
	 * labeled alternative in {@link PythonParser#dictExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictLiteralExpr(PythonParser.DictLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeyValuePairListSeq}
	 * labeled alternative in {@link PythonParser#keyValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValuePairListSeq(PythonParser.KeyValuePairListSeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeyValuePairEntry}
	 * labeled alternative in {@link PythonParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValuePairEntry(PythonParser.KeyValuePairEntryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierPrimary}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierPrimary(PythonParser.IdentifierPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteralPrimary}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteralPrimary(PythonParser.NumberLiteralPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralPrimary}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralPrimary(PythonParser.StringLiteralPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExprPrimary}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExprPrimary(PythonParser.ParenExprPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictAccessPrimary}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictAccessPrimary(PythonParser.DictAccessPrimaryContext ctx);
}