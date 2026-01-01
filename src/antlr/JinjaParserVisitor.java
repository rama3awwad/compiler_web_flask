// Generated from C:/Users/acer/Desktop/compiler_web_flask/compiler_web_flask/grammers/JinjaParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JinjaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JinjaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code FileRoot}
	 * labeled alternative in {@link JinjaParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileRoot(JinjaParser.FileRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoctypeElement}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctypeElement(JinjaParser.DoctypeElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementStatment}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementStatment(JinjaParser.HtmlElementStatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidHtmlElementStatment}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidHtmlElementStatment(JinjaParser.VoidHtmlElementStatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaExpressionElement}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpressionElement(JinjaParser.JinjaExpressionElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIfElement}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfElement(JinjaParser.JinjaIfElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaForElement}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForElement(JinjaParser.JinjaForElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextElement}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextElement(JinjaParser.TextElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalHtmlTag}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalHtmlTag(JinjaParser.NormalHtmlTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidHtmlSelfClose}
	 * labeled alternative in {@link JinjaParser#voidHtmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidHtmlSelfClose(JinjaParser.VoidHtmlSelfCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidHtmlOpenOnly}
	 * labeled alternative in {@link JinjaParser#voidHtmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidHtmlOpenOnly(JinjaParser.VoidHtmlOpenOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagNameStatment}
	 * labeled alternative in {@link JinjaParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagNameStatment(JinjaParser.TagNameStatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeStatment}
	 * labeled alternative in {@link JinjaParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeStatment(JinjaParser.AttributeStatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeValue}
	 * labeled alternative in {@link JinjaParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(JinjaParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeText}
	 * labeled alternative in {@link JinjaParser#attrPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeText(JinjaParser.AttributeTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeJinja}
	 * labeled alternative in {@link JinjaParser#attrPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeJinja(JinjaParser.AttributeJinjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaExpressionStatment}
	 * labeled alternative in {@link JinjaParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpressionStatment(JinjaParser.JinjaExpressionStatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIfBlockStatment}
	 * labeled alternative in {@link JinjaParser#jinjaIfBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfBlockStatment(JinjaParser.JinjaIfBlockStatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaForBlockStatment}
	 * labeled alternative in {@link JinjaParser#jinjaForBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForBlockStatment(JinjaParser.JinjaForBlockStatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStatment}
	 * labeled alternative in {@link JinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatment(JinjaParser.ExpressionStatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link JinjaParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(JinjaParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link JinjaParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(JinjaParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link JinjaParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(JinjaParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareExpressionOnly}
	 * labeled alternative in {@link JinjaParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpressionOnly(JinjaParser.CompareExpressionOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareExpression}
	 * labeled alternative in {@link JinjaParser#compareExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(JinjaParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link JinjaParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(JinjaParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulExpression}
	 * labeled alternative in {@link JinjaParser#mulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(JinjaParser.MulExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringPrimary}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringPrimary(JinjaParser.StringPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdPrimary}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPrimary(JinjaParser.IdPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(JinjaParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(JinjaParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberPrimary}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberPrimary(JinjaParser.NumberPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyAccess}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccess(JinjaParser.PropertyAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PositionalArgument}
	 * labeled alternative in {@link JinjaParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArgument(JinjaParser.PositionalArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedArgument}
	 * labeled alternative in {@link JinjaParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(JinjaParser.NamedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link JinjaParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(JinjaParser.ArgumentListContext ctx);
}