// Generated from C:/Users/admin/Desktop/mythreejsapp/compiler_web_flask/grammers/CssParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CssParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CssParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code StylesheetStatment}
	 * labeled alternative in {@link CssParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheetStatment(CssParser.StylesheetStatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RuleStatment}
	 * labeled alternative in {@link CssParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleStatment(CssParser.RuleStatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorList}
	 * labeled alternative in {@link CssParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorList(CssParser.SelectorListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexSelectors}
	 * labeled alternative in {@link CssParser#complexSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexSelectors(CssParser.ComplexSelectorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChildCombinator}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildCombinator(CssParser.ChildCombinatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DescendantCombinator}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescendantCombinator(CssParser.DescendantCombinatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundSelectors}
	 * labeled alternative in {@link CssParser#compoundSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundSelectors(CssParser.CompoundSelectorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UniversalSelector}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversalSelector(CssParser.UniversalSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeSelectorSimple}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSelectorSimple(CssParser.TypeSelectorSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassSelectorSimple}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelectorSimple(CssParser.ClassSelectorSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PseudoSelectorSimple}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoSelectorSimple(CssParser.PseudoSelectorSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeSelectors}
	 * labeled alternative in {@link CssParser#typeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSelectors(CssParser.TypeSelectorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassSelectors}
	 * labeled alternative in {@link CssParser#classSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelectors(CssParser.ClassSelectorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PseudoClass}
	 * labeled alternative in {@link CssParser#pseudoSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoClass(CssParser.PseudoClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CssParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlexDeclaration}
	 * labeled alternative in {@link CssParser#flexDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlexDeclaration(CssParser.FlexDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlexNumberValues}
	 * labeled alternative in {@link CssParser#flexValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlexNumberValues(CssParser.FlexNumberValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlexKeywordValue}
	 * labeled alternative in {@link CssParser#flexValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlexKeywordValue(CssParser.FlexKeywordValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColorDeclaration}
	 * labeled alternative in {@link CssParser#colorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorDeclaration(CssParser.ColorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BackgroundColorDeclaration}
	 * labeled alternative in {@link CssParser#backgroundColorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackgroundColorDeclaration(CssParser.BackgroundColorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HexColorValue}
	 * labeled alternative in {@link CssParser#colorValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexColorValue(CssParser.HexColorValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedColorValue}
	 * labeled alternative in {@link CssParser#colorValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedColorValue(CssParser.NamedColorValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionColorValue}
	 * labeled alternative in {@link CssParser#colorValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionColorValue(CssParser.FunctionColorValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LengthDeclaration}
	 * labeled alternative in {@link CssParser#lengthDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthDeclaration(CssParser.LengthDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LengthListValue}
	 * labeled alternative in {@link CssParser#lengthList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthListValue(CssParser.LengthListValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LengthValueItem}
	 * labeled alternative in {@link CssParser#lengthValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthValueItem(CssParser.LengthValueItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpacingDeclaration}
	 * labeled alternative in {@link CssParser#spacingDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpacingDeclaration(CssParser.SpacingDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpacingValueItem}
	 * labeled alternative in {@link CssParser#spacingValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpacingValueItem(CssParser.SpacingValueItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LayoutDeclaration}
	 * labeled alternative in {@link CssParser#layoutDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayoutDeclaration(CssParser.LayoutDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LayoutKeyword}
	 * labeled alternative in {@link CssParser#layoutValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayoutKeyword(CssParser.LayoutKeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LayoutFlexValue}
	 * labeled alternative in {@link CssParser#layoutValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayoutFlexValue(CssParser.LayoutFlexValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FontFamilyDeclaration}
	 * labeled alternative in {@link CssParser#fontDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFamilyDeclaration(CssParser.FontFamilyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FontOtherDeclaration}
	 * labeled alternative in {@link CssParser#fontDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontOtherDeclaration(CssParser.FontOtherDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FontFamilyFull}
	 * labeled alternative in {@link CssParser#fontFamilyDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFamilyFull(CssParser.FontFamilyFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FontFamilyList}
	 * labeled alternative in {@link CssParser#fontFamilyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFamilyList(CssParser.FontFamilyListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FontFamilyString}
	 * labeled alternative in {@link CssParser#fontFamilyItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFamilyString(CssParser.FontFamilyStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FontFamilyIdent}
	 * labeled alternative in {@link CssParser#fontFamilyItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFamilyIdent(CssParser.FontFamilyIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FontKeywordDeclaration}
	 * labeled alternative in {@link CssParser#font}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontKeywordDeclaration(CssParser.FontKeywordDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BackgroundDeclaration}
	 * labeled alternative in {@link CssParser#backgroundDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackgroundDeclaration(CssParser.BackgroundDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BorderDeclaration}
	 * labeled alternative in {@link CssParser#borderDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderDeclaration(CssParser.BorderDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EffectDeclaration}
	 * labeled alternative in {@link CssParser#effectDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffectDeclaration(CssParser.EffectDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GridDeclaration}
	 * labeled alternative in {@link CssParser#gridDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGridDeclaration(CssParser.GridDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoxSizingDeclaration}
	 * labeled alternative in {@link CssParser#boxSizingDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxSizingDeclaration(CssParser.BoxSizingDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CursorDeclaration}
	 * labeled alternative in {@link CssParser#cursorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorDeclaration(CssParser.CursorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link CssParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(CssParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueFunction}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueFunction(CssParser.ValueFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueHexColor}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueHexColor(CssParser.ValueHexColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueNamedColor}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueNamedColor(CssParser.ValueNamedColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueAngle}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueAngle(CssParser.ValueAngleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueNumber}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueNumber(CssParser.ValueNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueString}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueString(CssParser.ValueStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueKeyword}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueKeyword(CssParser.ValueKeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueBackground}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueBackground(CssParser.ValueBackgroundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueTransform}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueTransform(CssParser.ValueTransformContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueIdent}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueIdent(CssParser.ValueIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueComma}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueComma(CssParser.ValueCommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallment}
	 * labeled alternative in {@link CssParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallment(CssParser.FunctionCallmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionArguments}
	 * labeled alternative in {@link CssParser#functionArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArguments(CssParser.FunctionArgumentsContext ctx);
}