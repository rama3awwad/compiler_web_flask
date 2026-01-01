// Generated from C:/Users/acer/Desktop/compiler_web_flask/compiler_web_flask/grammers/JinjaParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JinjaParser}.
 */
public interface JinjaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code FileRoot}
	 * labeled alternative in {@link JinjaParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFileRoot(JinjaParser.FileRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FileRoot}
	 * labeled alternative in {@link JinjaParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFileRoot(JinjaParser.FileRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoctypeElement}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterDoctypeElement(JinjaParser.DoctypeElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoctypeElement}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitDoctypeElement(JinjaParser.DoctypeElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElementStatment}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementStatment(JinjaParser.HtmlElementStatmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementStatment}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementStatment(JinjaParser.HtmlElementStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidHtmlElementStatment}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterVoidHtmlElementStatment(JinjaParser.VoidHtmlElementStatmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidHtmlElementStatment}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitVoidHtmlElementStatment(JinjaParser.VoidHtmlElementStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExpressionElement}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpressionElement(JinjaParser.JinjaExpressionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExpressionElement}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpressionElement(JinjaParser.JinjaExpressionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaIfElement}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfElement(JinjaParser.JinjaIfElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaIfElement}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfElement(JinjaParser.JinjaIfElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaForElement}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForElement(JinjaParser.JinjaForElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaForElement}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForElement(JinjaParser.JinjaForElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextElement}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterTextElement(JinjaParser.TextElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextElement}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitTextElement(JinjaParser.TextElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalHtmlTag}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalHtmlTag(JinjaParser.NormalHtmlTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalHtmlTag}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalHtmlTag(JinjaParser.NormalHtmlTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidHtmlSelfClose}
	 * labeled alternative in {@link JinjaParser#voidHtmlElement}.
	 * @param ctx the parse tree
	 */
	void enterVoidHtmlSelfClose(JinjaParser.VoidHtmlSelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidHtmlSelfClose}
	 * labeled alternative in {@link JinjaParser#voidHtmlElement}.
	 * @param ctx the parse tree
	 */
	void exitVoidHtmlSelfClose(JinjaParser.VoidHtmlSelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidHtmlOpenOnly}
	 * labeled alternative in {@link JinjaParser#voidHtmlElement}.
	 * @param ctx the parse tree
	 */
	void enterVoidHtmlOpenOnly(JinjaParser.VoidHtmlOpenOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidHtmlOpenOnly}
	 * labeled alternative in {@link JinjaParser#voidHtmlElement}.
	 * @param ctx the parse tree
	 */
	void exitVoidHtmlOpenOnly(JinjaParser.VoidHtmlOpenOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagNameStatment}
	 * labeled alternative in {@link JinjaParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagNameStatment(JinjaParser.TagNameStatmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagNameStatment}
	 * labeled alternative in {@link JinjaParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagNameStatment(JinjaParser.TagNameStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeStatment}
	 * labeled alternative in {@link JinjaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttributeStatment(JinjaParser.AttributeStatmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeStatment}
	 * labeled alternative in {@link JinjaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttributeStatment(JinjaParser.AttributeStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeValue}
	 * labeled alternative in {@link JinjaParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(JinjaParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeValue}
	 * labeled alternative in {@link JinjaParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(JinjaParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeText}
	 * labeled alternative in {@link JinjaParser#attrPart}.
	 * @param ctx the parse tree
	 */
	void enterAttributeText(JinjaParser.AttributeTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeText}
	 * labeled alternative in {@link JinjaParser#attrPart}.
	 * @param ctx the parse tree
	 */
	void exitAttributeText(JinjaParser.AttributeTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeJinja}
	 * labeled alternative in {@link JinjaParser#attrPart}.
	 * @param ctx the parse tree
	 */
	void enterAttributeJinja(JinjaParser.AttributeJinjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeJinja}
	 * labeled alternative in {@link JinjaParser#attrPart}.
	 * @param ctx the parse tree
	 */
	void exitAttributeJinja(JinjaParser.AttributeJinjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExpressionStatment}
	 * labeled alternative in {@link JinjaParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpressionStatment(JinjaParser.JinjaExpressionStatmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExpressionStatment}
	 * labeled alternative in {@link JinjaParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpressionStatment(JinjaParser.JinjaExpressionStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaIfBlockStatment}
	 * labeled alternative in {@link JinjaParser#jinjaIfBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfBlockStatment(JinjaParser.JinjaIfBlockStatmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaIfBlockStatment}
	 * labeled alternative in {@link JinjaParser#jinjaIfBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfBlockStatment(JinjaParser.JinjaIfBlockStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaForBlockStatment}
	 * labeled alternative in {@link JinjaParser#jinjaForBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForBlockStatment(JinjaParser.JinjaForBlockStatmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaForBlockStatment}
	 * labeled alternative in {@link JinjaParser#jinjaForBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForBlockStatment(JinjaParser.JinjaForBlockStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStatment}
	 * labeled alternative in {@link JinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatment(JinjaParser.ExpressionStatmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStatment}
	 * labeled alternative in {@link JinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatment(JinjaParser.ExpressionStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link JinjaParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(JinjaParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link JinjaParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(JinjaParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link JinjaParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(JinjaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link JinjaParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(JinjaParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link JinjaParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(JinjaParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link JinjaParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(JinjaParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpressionOnly}
	 * labeled alternative in {@link JinjaParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpressionOnly(JinjaParser.CompareExpressionOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpressionOnly}
	 * labeled alternative in {@link JinjaParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpressionOnly(JinjaParser.CompareExpressionOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpression}
	 * labeled alternative in {@link JinjaParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(JinjaParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpression}
	 * labeled alternative in {@link JinjaParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(JinjaParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link JinjaParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(JinjaParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link JinjaParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(JinjaParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulExpression}
	 * labeled alternative in {@link JinjaParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(JinjaParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulExpression}
	 * labeled alternative in {@link JinjaParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(JinjaParser.MulExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringPrimary}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterStringPrimary(JinjaParser.StringPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringPrimary}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitStringPrimary(JinjaParser.StringPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdPrimary}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdPrimary(JinjaParser.IdPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdPrimary}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdPrimary(JinjaParser.IdPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(JinjaParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(JinjaParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(JinjaParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(JinjaParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberPrimary}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterNumberPrimary(JinjaParser.NumberPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberPrimary}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitNumberPrimary(JinjaParser.NumberPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyAccess}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccess(JinjaParser.PropertyAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyAccess}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccess(JinjaParser.PropertyAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PositionalArgument}
	 * labeled alternative in {@link JinjaParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArgument(JinjaParser.PositionalArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PositionalArgument}
	 * labeled alternative in {@link JinjaParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArgument(JinjaParser.PositionalArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedArgument}
	 * labeled alternative in {@link JinjaParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgument(JinjaParser.NamedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedArgument}
	 * labeled alternative in {@link JinjaParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgument(JinjaParser.NamedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link JinjaParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JinjaParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link JinjaParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JinjaParser.ArgumentListContext ctx);
}