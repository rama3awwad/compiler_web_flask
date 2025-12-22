// Generated from C:/Users/admin/Desktop/mythreejsapp/compiler_web_flask/grammers/CssParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CssParser}.
 */
public interface CssParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code StylesheetStatment}
	 * labeled alternative in {@link CssParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheetStatment(CssParser.StylesheetStatmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StylesheetStatment}
	 * labeled alternative in {@link CssParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheetStatment(CssParser.StylesheetStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RuleStatment}
	 * labeled alternative in {@link CssParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRuleStatment(CssParser.RuleStatmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RuleStatment}
	 * labeled alternative in {@link CssParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRuleStatment(CssParser.RuleStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorList}
	 * labeled alternative in {@link CssParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelectorList(CssParser.SelectorListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorList}
	 * labeled alternative in {@link CssParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelectorList(CssParser.SelectorListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexSelectors}
	 * labeled alternative in {@link CssParser#complexSelector}.
	 * @param ctx the parse tree
	 */
	void enterComplexSelectors(CssParser.ComplexSelectorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexSelectors}
	 * labeled alternative in {@link CssParser#complexSelector}.
	 * @param ctx the parse tree
	 */
	void exitComplexSelectors(CssParser.ComplexSelectorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChildCombinator}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterChildCombinator(CssParser.ChildCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChildCombinator}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitChildCombinator(CssParser.ChildCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DescendantCombinator}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterDescendantCombinator(CssParser.DescendantCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DescendantCombinator}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitDescendantCombinator(CssParser.DescendantCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundSelectors}
	 * labeled alternative in {@link CssParser#compoundSelector}.
	 * @param ctx the parse tree
	 */
	void enterCompoundSelectors(CssParser.CompoundSelectorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundSelectors}
	 * labeled alternative in {@link CssParser#compoundSelector}.
	 * @param ctx the parse tree
	 */
	void exitCompoundSelectors(CssParser.CompoundSelectorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UniversalSelector}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterUniversalSelector(CssParser.UniversalSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UniversalSelector}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitUniversalSelector(CssParser.UniversalSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeSelectorSimple}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterTypeSelectorSimple(CssParser.TypeSelectorSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeSelectorSimple}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitTypeSelectorSimple(CssParser.TypeSelectorSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassSelectorSimple}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelectorSimple(CssParser.ClassSelectorSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassSelectorSimple}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelectorSimple(CssParser.ClassSelectorSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PseudoSelectorSimple}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterPseudoSelectorSimple(CssParser.PseudoSelectorSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PseudoSelectorSimple}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitPseudoSelectorSimple(CssParser.PseudoSelectorSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeSelectors}
	 * labeled alternative in {@link CssParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void enterTypeSelectors(CssParser.TypeSelectorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeSelectors}
	 * labeled alternative in {@link CssParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void exitTypeSelectors(CssParser.TypeSelectorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassSelectors}
	 * labeled alternative in {@link CssParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelectors(CssParser.ClassSelectorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassSelectors}
	 * labeled alternative in {@link CssParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelectors(CssParser.ClassSelectorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PseudoClass}
	 * labeled alternative in {@link CssParser#pseudoSelector}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClass(CssParser.PseudoClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PseudoClass}
	 * labeled alternative in {@link CssParser#pseudoSelector}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClass(CssParser.PseudoClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CssParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CssParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlexDeclaration}
	 * labeled alternative in {@link CssParser#flexDecl}.
	 * @param ctx the parse tree
	 */
	void enterFlexDeclaration(CssParser.FlexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlexDeclaration}
	 * labeled alternative in {@link CssParser#flexDecl}.
	 * @param ctx the parse tree
	 */
	void exitFlexDeclaration(CssParser.FlexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlexNumberValues}
	 * labeled alternative in {@link CssParser#flexValue}.
	 * @param ctx the parse tree
	 */
	void enterFlexNumberValues(CssParser.FlexNumberValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlexNumberValues}
	 * labeled alternative in {@link CssParser#flexValue}.
	 * @param ctx the parse tree
	 */
	void exitFlexNumberValues(CssParser.FlexNumberValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlexKeywordValue}
	 * labeled alternative in {@link CssParser#flexValue}.
	 * @param ctx the parse tree
	 */
	void enterFlexKeywordValue(CssParser.FlexKeywordValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlexKeywordValue}
	 * labeled alternative in {@link CssParser#flexValue}.
	 * @param ctx the parse tree
	 */
	void exitFlexKeywordValue(CssParser.FlexKeywordValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColorDeclaration}
	 * labeled alternative in {@link CssParser#colorDecl}.
	 * @param ctx the parse tree
	 */
	void enterColorDeclaration(CssParser.ColorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColorDeclaration}
	 * labeled alternative in {@link CssParser#colorDecl}.
	 * @param ctx the parse tree
	 */
	void exitColorDeclaration(CssParser.ColorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BackgroundColorDeclaration}
	 * labeled alternative in {@link CssParser#backgroundColorDecl}.
	 * @param ctx the parse tree
	 */
	void enterBackgroundColorDeclaration(CssParser.BackgroundColorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BackgroundColorDeclaration}
	 * labeled alternative in {@link CssParser#backgroundColorDecl}.
	 * @param ctx the parse tree
	 */
	void exitBackgroundColorDeclaration(CssParser.BackgroundColorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HexColorValue}
	 * labeled alternative in {@link CssParser#colorValue}.
	 * @param ctx the parse tree
	 */
	void enterHexColorValue(CssParser.HexColorValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HexColorValue}
	 * labeled alternative in {@link CssParser#colorValue}.
	 * @param ctx the parse tree
	 */
	void exitHexColorValue(CssParser.HexColorValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedColorValue}
	 * labeled alternative in {@link CssParser#colorValue}.
	 * @param ctx the parse tree
	 */
	void enterNamedColorValue(CssParser.NamedColorValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedColorValue}
	 * labeled alternative in {@link CssParser#colorValue}.
	 * @param ctx the parse tree
	 */
	void exitNamedColorValue(CssParser.NamedColorValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionColorValue}
	 * labeled alternative in {@link CssParser#colorValue}.
	 * @param ctx the parse tree
	 */
	void enterFunctionColorValue(CssParser.FunctionColorValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionColorValue}
	 * labeled alternative in {@link CssParser#colorValue}.
	 * @param ctx the parse tree
	 */
	void exitFunctionColorValue(CssParser.FunctionColorValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LengthDeclaration}
	 * labeled alternative in {@link CssParser#lengthDecl}.
	 * @param ctx the parse tree
	 */
	void enterLengthDeclaration(CssParser.LengthDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LengthDeclaration}
	 * labeled alternative in {@link CssParser#lengthDecl}.
	 * @param ctx the parse tree
	 */
	void exitLengthDeclaration(CssParser.LengthDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LengthListValue}
	 * labeled alternative in {@link CssParser#lengthList}.
	 * @param ctx the parse tree
	 */
	void enterLengthListValue(CssParser.LengthListValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LengthListValue}
	 * labeled alternative in {@link CssParser#lengthList}.
	 * @param ctx the parse tree
	 */
	void exitLengthListValue(CssParser.LengthListValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LengthValueItem}
	 * labeled alternative in {@link CssParser#lengthValue}.
	 * @param ctx the parse tree
	 */
	void enterLengthValueItem(CssParser.LengthValueItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LengthValueItem}
	 * labeled alternative in {@link CssParser#lengthValue}.
	 * @param ctx the parse tree
	 */
	void exitLengthValueItem(CssParser.LengthValueItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpacingDeclaration}
	 * labeled alternative in {@link CssParser#spacingDecl}.
	 * @param ctx the parse tree
	 */
	void enterSpacingDeclaration(CssParser.SpacingDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpacingDeclaration}
	 * labeled alternative in {@link CssParser#spacingDecl}.
	 * @param ctx the parse tree
	 */
	void exitSpacingDeclaration(CssParser.SpacingDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpacingValueItem}
	 * labeled alternative in {@link CssParser#spacingValue}.
	 * @param ctx the parse tree
	 */
	void enterSpacingValueItem(CssParser.SpacingValueItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpacingValueItem}
	 * labeled alternative in {@link CssParser#spacingValue}.
	 * @param ctx the parse tree
	 */
	void exitSpacingValueItem(CssParser.SpacingValueItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LayoutDeclaration}
	 * labeled alternative in {@link CssParser#layoutDecl}.
	 * @param ctx the parse tree
	 */
	void enterLayoutDeclaration(CssParser.LayoutDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LayoutDeclaration}
	 * labeled alternative in {@link CssParser#layoutDecl}.
	 * @param ctx the parse tree
	 */
	void exitLayoutDeclaration(CssParser.LayoutDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LayoutKeyword}
	 * labeled alternative in {@link CssParser#layoutValue}.
	 * @param ctx the parse tree
	 */
	void enterLayoutKeyword(CssParser.LayoutKeywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LayoutKeyword}
	 * labeled alternative in {@link CssParser#layoutValue}.
	 * @param ctx the parse tree
	 */
	void exitLayoutKeyword(CssParser.LayoutKeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LayoutFlexValue}
	 * labeled alternative in {@link CssParser#layoutValue}.
	 * @param ctx the parse tree
	 */
	void enterLayoutFlexValue(CssParser.LayoutFlexValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LayoutFlexValue}
	 * labeled alternative in {@link CssParser#layoutValue}.
	 * @param ctx the parse tree
	 */
	void exitLayoutFlexValue(CssParser.LayoutFlexValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FontFamilyDeclaration}
	 * labeled alternative in {@link CssParser#fontDecl}.
	 * @param ctx the parse tree
	 */
	void enterFontFamilyDeclaration(CssParser.FontFamilyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FontFamilyDeclaration}
	 * labeled alternative in {@link CssParser#fontDecl}.
	 * @param ctx the parse tree
	 */
	void exitFontFamilyDeclaration(CssParser.FontFamilyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FontOtherDeclaration}
	 * labeled alternative in {@link CssParser#fontDecl}.
	 * @param ctx the parse tree
	 */
	void enterFontOtherDeclaration(CssParser.FontOtherDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FontOtherDeclaration}
	 * labeled alternative in {@link CssParser#fontDecl}.
	 * @param ctx the parse tree
	 */
	void exitFontOtherDeclaration(CssParser.FontOtherDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FontFamilyFull}
	 * labeled alternative in {@link CssParser#fontFamilyDecl}.
	 * @param ctx the parse tree
	 */
	void enterFontFamilyFull(CssParser.FontFamilyFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FontFamilyFull}
	 * labeled alternative in {@link CssParser#fontFamilyDecl}.
	 * @param ctx the parse tree
	 */
	void exitFontFamilyFull(CssParser.FontFamilyFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FontFamilyList}
	 * labeled alternative in {@link CssParser#fontFamilyValue}.
	 * @param ctx the parse tree
	 */
	void enterFontFamilyList(CssParser.FontFamilyListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FontFamilyList}
	 * labeled alternative in {@link CssParser#fontFamilyValue}.
	 * @param ctx the parse tree
	 */
	void exitFontFamilyList(CssParser.FontFamilyListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FontFamilyString}
	 * labeled alternative in {@link CssParser#fontFamilyItem}.
	 * @param ctx the parse tree
	 */
	void enterFontFamilyString(CssParser.FontFamilyStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FontFamilyString}
	 * labeled alternative in {@link CssParser#fontFamilyItem}.
	 * @param ctx the parse tree
	 */
	void exitFontFamilyString(CssParser.FontFamilyStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FontFamilyIdent}
	 * labeled alternative in {@link CssParser#fontFamilyItem}.
	 * @param ctx the parse tree
	 */
	void enterFontFamilyIdent(CssParser.FontFamilyIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FontFamilyIdent}
	 * labeled alternative in {@link CssParser#fontFamilyItem}.
	 * @param ctx the parse tree
	 */
	void exitFontFamilyIdent(CssParser.FontFamilyIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FontKeywordDeclaration}
	 * labeled alternative in {@link CssParser#font}.
	 * @param ctx the parse tree
	 */
	void enterFontKeywordDeclaration(CssParser.FontKeywordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FontKeywordDeclaration}
	 * labeled alternative in {@link CssParser#font}.
	 * @param ctx the parse tree
	 */
	void exitFontKeywordDeclaration(CssParser.FontKeywordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BackgroundDeclaration}
	 * labeled alternative in {@link CssParser#backgroundDecl}.
	 * @param ctx the parse tree
	 */
	void enterBackgroundDeclaration(CssParser.BackgroundDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BackgroundDeclaration}
	 * labeled alternative in {@link CssParser#backgroundDecl}.
	 * @param ctx the parse tree
	 */
	void exitBackgroundDeclaration(CssParser.BackgroundDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BorderDeclaration}
	 * labeled alternative in {@link CssParser#borderDecl}.
	 * @param ctx the parse tree
	 */
	void enterBorderDeclaration(CssParser.BorderDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BorderDeclaration}
	 * labeled alternative in {@link CssParser#borderDecl}.
	 * @param ctx the parse tree
	 */
	void exitBorderDeclaration(CssParser.BorderDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EffectDeclaration}
	 * labeled alternative in {@link CssParser#effectDecl}.
	 * @param ctx the parse tree
	 */
	void enterEffectDeclaration(CssParser.EffectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EffectDeclaration}
	 * labeled alternative in {@link CssParser#effectDecl}.
	 * @param ctx the parse tree
	 */
	void exitEffectDeclaration(CssParser.EffectDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GridDeclaration}
	 * labeled alternative in {@link CssParser#gridDecl}.
	 * @param ctx the parse tree
	 */
	void enterGridDeclaration(CssParser.GridDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GridDeclaration}
	 * labeled alternative in {@link CssParser#gridDecl}.
	 * @param ctx the parse tree
	 */
	void exitGridDeclaration(CssParser.GridDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoxSizingDeclaration}
	 * labeled alternative in {@link CssParser#boxSizingDecl}.
	 * @param ctx the parse tree
	 */
	void enterBoxSizingDeclaration(CssParser.BoxSizingDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoxSizingDeclaration}
	 * labeled alternative in {@link CssParser#boxSizingDecl}.
	 * @param ctx the parse tree
	 */
	void exitBoxSizingDeclaration(CssParser.BoxSizingDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CursorDeclaration}
	 * labeled alternative in {@link CssParser#cursorDecl}.
	 * @param ctx the parse tree
	 */
	void enterCursorDeclaration(CssParser.CursorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CursorDeclaration}
	 * labeled alternative in {@link CssParser#cursorDecl}.
	 * @param ctx the parse tree
	 */
	void exitCursorDeclaration(CssParser.CursorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link CssParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueList(CssParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link CssParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueList(CssParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueFunction}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterValueFunction(CssParser.ValueFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueFunction}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitValueFunction(CssParser.ValueFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueHexColor}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterValueHexColor(CssParser.ValueHexColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueHexColor}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitValueHexColor(CssParser.ValueHexColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueNamedColor}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterValueNamedColor(CssParser.ValueNamedColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueNamedColor}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitValueNamedColor(CssParser.ValueNamedColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueAngle}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterValueAngle(CssParser.ValueAngleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueAngle}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitValueAngle(CssParser.ValueAngleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueNumber}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterValueNumber(CssParser.ValueNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueNumber}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitValueNumber(CssParser.ValueNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueString}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterValueString(CssParser.ValueStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueString}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitValueString(CssParser.ValueStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueKeyword}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterValueKeyword(CssParser.ValueKeywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueKeyword}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitValueKeyword(CssParser.ValueKeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueBackground}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterValueBackground(CssParser.ValueBackgroundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueBackground}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitValueBackground(CssParser.ValueBackgroundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueTransform}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterValueTransform(CssParser.ValueTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueTransform}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitValueTransform(CssParser.ValueTransformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueIdent}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterValueIdent(CssParser.ValueIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueIdent}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitValueIdent(CssParser.ValueIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueComma}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterValueComma(CssParser.ValueCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueComma}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitValueComma(CssParser.ValueCommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallment}
	 * labeled alternative in {@link CssParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallment(CssParser.FunctionCallmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallment}
	 * labeled alternative in {@link CssParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallment(CssParser.FunctionCallmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionArguments}
	 * labeled alternative in {@link CssParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArguments(CssParser.FunctionArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionArguments}
	 * labeled alternative in {@link CssParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArguments(CssParser.FunctionArgumentsContext ctx);
}