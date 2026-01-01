// Generated from C:/Users/acer/Desktop/compiler_web_flask/compiler_web_flask/grammers/CssParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CssParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LBRACE=1, RBRACE=2, COLON=3, SEMI=4, COMMA=5, DOT=6, STAR=7, LPAREN=8, 
		RPAREN=9, GT=10, HEX_COLOR=11, COLOR_NAME=12, NUMBER=13, ANGLE=14, UNIT=15, 
		STRING=16, KEYWORD=17, MARGIN=18, MARGIN_TOP=19, MARGIN_BOTTOM=20, PADDING=21, 
		WIDTH=22, HEIGHT=23, MAX_WIDTH=24, GAP=25, FONT_SIZE=26, LINE_HEIGHT=27, 
		BOX_SIZING=28, FLEX=29, COLOR=30, BACKGROUND=31, BACKGROUND_COLOR=32, 
		DISPLAY=33, JUSTIFY_CONTENT=34, ALIGN_ITEMS=35, FLEX_WRAP=36, TEXT_ALIGN=37, 
		OBJECT_FIT=38, FONT_FAMILY=39, FONT_WEIGHT=40, TEXT_DECORATION=41, BORDER=42, 
		BORDER_RADIUS=43, BOX_SHADOW=44, TRANSITION=45, TRANSFORM=46, GRID_TEMPLATE_COLUMNS=47, 
		CURSOR=48, LIST_STYLE=49, IDENT=50, COMMENT=51, WS=52;
	public static final int
		RULE_stylesheet = 0, RULE_rule = 1, RULE_selector = 2, RULE_complexSelector = 3, 
		RULE_combinator = 4, RULE_compoundSelector = 5, RULE_simpleSelector = 6, 
		RULE_typeSelector = 7, RULE_classSelector = 8, RULE_pseudoSelector = 9, 
		RULE_declaration = 10, RULE_flexDecl = 11, RULE_flexValue = 12, RULE_colorDecl = 13, 
		RULE_backgroundColorDecl = 14, RULE_colorValue = 15, RULE_lengthDecl = 16, 
		RULE_lengthList = 17, RULE_lengthValue = 18, RULE_spacingDecl = 19, RULE_spacingValue = 20, 
		RULE_layoutDecl = 21, RULE_layoutValue = 22, RULE_fontDecl = 23, RULE_fontFamilyDecl = 24, 
		RULE_fontFamilyValue = 25, RULE_fontFamilyItem = 26, RULE_font = 27, RULE_backgroundDecl = 28, 
		RULE_borderDecl = 29, RULE_effectDecl = 30, RULE_gridDecl = 31, RULE_boxSizingDecl = 32, 
		RULE_cursorDecl = 33, RULE_value = 34, RULE_valuePart = 35, RULE_functionCall = 36, 
		RULE_functionArgs = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "rule", "selector", "complexSelector", "combinator", "compoundSelector", 
			"simpleSelector", "typeSelector", "classSelector", "pseudoSelector", 
			"declaration", "flexDecl", "flexValue", "colorDecl", "backgroundColorDecl", 
			"colorValue", "lengthDecl", "lengthList", "lengthValue", "spacingDecl", 
			"spacingValue", "layoutDecl", "layoutValue", "fontDecl", "fontFamilyDecl", 
			"fontFamilyValue", "fontFamilyItem", "font", "backgroundDecl", "borderDecl", 
			"effectDecl", "gridDecl", "boxSizingDecl", "cursorDecl", "value", "valuePart", 
			"functionCall", "functionArgs"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "':'", "';'", "','", "'.'", "'*'", "'('", "')'", 
			"'>'", null, null, null, null, null, null, null, "'margin'", "'margin-top'", 
			"'margin-bottom'", "'padding'", "'width'", "'height'", "'max-width'", 
			"'gap'", "'font-size'", "'line-height'", "'box-sizing'", "'flex'", "'color'", 
			"'background'", "'background-color'", "'display'", "'justify-content'", 
			"'align-items'", "'flex-wrap'", "'text-align'", "'object-fit'", "'font-family'", 
			"'font-weight'", "'text-decoration'", "'border'", "'border-radius'", 
			"'box-shadow'", "'transition'", "'transform'", "'grid-template-columns'", 
			"'cursor'", "'list-style'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LBRACE", "RBRACE", "COLON", "SEMI", "COMMA", "DOT", "STAR", "LPAREN", 
			"RPAREN", "GT", "HEX_COLOR", "COLOR_NAME", "NUMBER", "ANGLE", "UNIT", 
			"STRING", "KEYWORD", "MARGIN", "MARGIN_TOP", "MARGIN_BOTTOM", "PADDING", 
			"WIDTH", "HEIGHT", "MAX_WIDTH", "GAP", "FONT_SIZE", "LINE_HEIGHT", "BOX_SIZING", 
			"FLEX", "COLOR", "BACKGROUND", "BACKGROUND_COLOR", "DISPLAY", "JUSTIFY_CONTENT", 
			"ALIGN_ITEMS", "FLEX_WRAP", "TEXT_ALIGN", "OBJECT_FIT", "FONT_FAMILY", 
			"FONT_WEIGHT", "TEXT_DECORATION", "BORDER", "BORDER_RADIUS", "BOX_SHADOW", 
			"TRANSITION", "TRANSFORM", "GRID_TEMPLATE_COLUMNS", "CURSOR", "LIST_STYLE", 
			"IDENT", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CssParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CssParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
	 
		public StylesheetContext() { }
		public void copyFrom(StylesheetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetStatmentContext extends StylesheetContext {
		public TerminalNode EOF() { return getToken(CssParser.EOF, 0); }
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public StylesheetStatmentContext(StylesheetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterStylesheetStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitStylesheetStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitStylesheetStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			_localctx = new StylesheetStatmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125899906842824L) != 0)) {
				{
				{
				setState(76);
				rule_();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleContext extends ParserRuleContext {
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
	 
		public RuleContext() { }
		public void copyFrom(RuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleStatmentContext extends RuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CssParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public RuleStatmentContext(RuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterRuleStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitRuleStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitRuleStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rule);
		int _la;
		try {
			_localctx = new RuleStatmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			selector();
			setState(85);
			match(LBRACE);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 562949953159168L) != 0)) {
				{
				{
				setState(86);
				declaration();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	 
		public SelectorContext() { }
		public void copyFrom(SelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorListContext extends SelectorContext {
		public List<ComplexSelectorContext> complexSelector() {
			return getRuleContexts(ComplexSelectorContext.class);
		}
		public ComplexSelectorContext complexSelector(int i) {
			return getRuleContext(ComplexSelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CssParser.COMMA, i);
		}
		public SelectorListContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSelectorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSelectorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSelectorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selector);
		int _la;
		try {
			_localctx = new SelectorListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			complexSelector();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				complexSelector();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexSelectorContext extends ParserRuleContext {
		public ComplexSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexSelector; }
	 
		public ComplexSelectorContext() { }
		public void copyFrom(ComplexSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexSelectorsContext extends ComplexSelectorContext {
		public List<CompoundSelectorContext> compoundSelector() {
			return getRuleContexts(CompoundSelectorContext.class);
		}
		public CompoundSelectorContext compoundSelector(int i) {
			return getRuleContext(CompoundSelectorContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public ComplexSelectorsContext(ComplexSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterComplexSelectors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitComplexSelectors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitComplexSelectors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexSelectorContext complexSelector() throws RecognitionException {
		ComplexSelectorContext _localctx = new ComplexSelectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_complexSelector);
		int _la;
		try {
			_localctx = new ComplexSelectorsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			compoundSelector();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125899906843848L) != 0)) {
				{
				{
				setState(103);
				combinator();
				setState(104);
				compoundSelector();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CombinatorContext extends ParserRuleContext {
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
	 
		public CombinatorContext() { }
		public void copyFrom(CombinatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildCombinatorContext extends CombinatorContext {
		public TerminalNode GT() { return getToken(CssParser.GT, 0); }
		public ChildCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterChildCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitChildCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitChildCombinator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescendantCombinatorContext extends CombinatorContext {
		public DescendantCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterDescendantCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitDescendantCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitDescendantCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_combinator);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GT:
				_localctx = new ChildCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(GT);
				}
				break;
			case COLON:
			case DOT:
			case STAR:
			case IDENT:
				_localctx = new DescendantCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundSelectorContext extends ParserRuleContext {
		public CompoundSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundSelector; }
	 
		public CompoundSelectorContext() { }
		public void copyFrom(CompoundSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundSelectorsContext extends CompoundSelectorContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public CompoundSelectorsContext(CompoundSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCompoundSelectors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCompoundSelectors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCompoundSelectors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundSelectorContext compoundSelector() throws RecognitionException {
		CompoundSelectorContext _localctx = new CompoundSelectorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compoundSelector);
		try {
			int _alt;
			_localctx = new CompoundSelectorsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(115);
					simpleSelector();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorContext extends ParserRuleContext {
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
	 
		public SimpleSelectorContext() { }
		public void copyFrom(SimpleSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UniversalSelectorContext extends SimpleSelectorContext {
		public TerminalNode STAR() { return getToken(CssParser.STAR, 0); }
		public UniversalSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterUniversalSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitUniversalSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitUniversalSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorSimpleContext extends SimpleSelectorContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public TypeSelectorSimpleContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterTypeSelectorSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitTypeSelectorSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitTypeSelectorSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorSimpleContext extends SimpleSelectorContext {
		public ClassSelectorContext classSelector() {
			return getRuleContext(ClassSelectorContext.class,0);
		}
		public ClassSelectorSimpleContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterClassSelectorSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitClassSelectorSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitClassSelectorSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoSelectorSimpleContext extends SimpleSelectorContext {
		public PseudoSelectorContext pseudoSelector() {
			return getRuleContext(PseudoSelectorContext.class,0);
		}
		public PseudoSelectorSimpleContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPseudoSelectorSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPseudoSelectorSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPseudoSelectorSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simpleSelector);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new UniversalSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(STAR);
				}
				break;
			case IDENT:
				_localctx = new TypeSelectorSimpleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				typeSelector();
				}
				break;
			case DOT:
				_localctx = new ClassSelectorSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				classSelector();
				}
				break;
			case COLON:
				_localctx = new PseudoSelectorSimpleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				pseudoSelector();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorContext extends ParserRuleContext {
		public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSelector; }
	 
		public TypeSelectorContext() { }
		public void copyFrom(TypeSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorsContext extends TypeSelectorContext {
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public TypeSelectorsContext(TypeSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterTypeSelectors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitTypeSelectors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitTypeSelectors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeSelector);
		try {
			_localctx = new TypeSelectorsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorContext extends ParserRuleContext {
		public ClassSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSelector; }
	 
		public ClassSelectorContext() { }
		public void copyFrom(ClassSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorsContext extends ClassSelectorContext {
		public TerminalNode DOT() { return getToken(CssParser.DOT, 0); }
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public ClassSelectorsContext(ClassSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterClassSelectors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitClassSelectors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitClassSelectors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSelectorContext classSelector() throws RecognitionException {
		ClassSelectorContext _localctx = new ClassSelectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classSelector);
		try {
			_localctx = new ClassSelectorsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(DOT);
			setState(129);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoSelectorContext extends ParserRuleContext {
		public PseudoSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoSelector; }
	 
		public PseudoSelectorContext() { }
		public void copyFrom(PseudoSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoClassContext extends PseudoSelectorContext {
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public PseudoClassContext(PseudoSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPseudoClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPseudoClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPseudoClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoSelectorContext pseudoSelector() throws RecognitionException {
		PseudoSelectorContext _localctx = new PseudoSelectorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pseudoSelector);
		try {
			_localctx = new PseudoClassContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(COLON);
			setState(132);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public FlexDeclContext flexDecl() {
			return getRuleContext(FlexDeclContext.class,0);
		}
		public ColorDeclContext colorDecl() {
			return getRuleContext(ColorDeclContext.class,0);
		}
		public BackgroundColorDeclContext backgroundColorDecl() {
			return getRuleContext(BackgroundColorDeclContext.class,0);
		}
		public LengthDeclContext lengthDecl() {
			return getRuleContext(LengthDeclContext.class,0);
		}
		public SpacingDeclContext spacingDecl() {
			return getRuleContext(SpacingDeclContext.class,0);
		}
		public LayoutDeclContext layoutDecl() {
			return getRuleContext(LayoutDeclContext.class,0);
		}
		public FontDeclContext fontDecl() {
			return getRuleContext(FontDeclContext.class,0);
		}
		public BorderDeclContext borderDecl() {
			return getRuleContext(BorderDeclContext.class,0);
		}
		public EffectDeclContext effectDecl() {
			return getRuleContext(EffectDeclContext.class,0);
		}
		public GridDeclContext gridDecl() {
			return getRuleContext(GridDeclContext.class,0);
		}
		public BackgroundDeclContext backgroundDecl() {
			return getRuleContext(BackgroundDeclContext.class,0);
		}
		public BoxSizingDeclContext boxSizingDecl() {
			return getRuleContext(BoxSizingDeclContext.class,0);
		}
		public CursorDeclContext cursorDecl() {
			return getRuleContext(CursorDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				flexDecl();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				colorDecl();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				backgroundColorDecl();
				}
				break;
			case WIDTH:
			case HEIGHT:
			case MAX_WIDTH:
			case GAP:
			case FONT_SIZE:
			case LINE_HEIGHT:
			case BORDER_RADIUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				lengthDecl();
				}
				break;
			case MARGIN:
			case MARGIN_TOP:
			case MARGIN_BOTTOM:
			case PADDING:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				spacingDecl();
				}
				break;
			case DISPLAY:
			case JUSTIFY_CONTENT:
			case ALIGN_ITEMS:
			case FLEX_WRAP:
			case TEXT_ALIGN:
			case OBJECT_FIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				layoutDecl();
				}
				break;
			case FONT_FAMILY:
			case FONT_WEIGHT:
			case TEXT_DECORATION:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				fontDecl();
				}
				break;
			case BORDER:
				enterOuterAlt(_localctx, 8);
				{
				setState(141);
				borderDecl();
				}
				break;
			case BOX_SHADOW:
			case TRANSITION:
			case TRANSFORM:
				enterOuterAlt(_localctx, 9);
				{
				setState(142);
				effectDecl();
				}
				break;
			case GRID_TEMPLATE_COLUMNS:
				enterOuterAlt(_localctx, 10);
				{
				setState(143);
				gridDecl();
				}
				break;
			case BACKGROUND:
				enterOuterAlt(_localctx, 11);
				{
				setState(144);
				backgroundDecl();
				}
				break;
			case BOX_SIZING:
				enterOuterAlt(_localctx, 12);
				{
				setState(145);
				boxSizingDecl();
				}
				break;
			case CURSOR:
				enterOuterAlt(_localctx, 13);
				{
				setState(146);
				cursorDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FlexDeclContext extends ParserRuleContext {
		public FlexDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flexDecl; }
	 
		public FlexDeclContext() { }
		public void copyFrom(FlexDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlexDeclarationContext extends FlexDeclContext {
		public TerminalNode FLEX() { return getToken(CssParser.FLEX, 0); }
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public FlexValueContext flexValue() {
			return getRuleContext(FlexValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CssParser.SEMI, 0); }
		public FlexDeclarationContext(FlexDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFlexDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFlexDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFlexDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlexDeclContext flexDecl() throws RecognitionException {
		FlexDeclContext _localctx = new FlexDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_flexDecl);
		try {
			_localctx = new FlexDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(FLEX);
			setState(150);
			match(COLON);
			setState(151);
			flexValue();
			setState(152);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FlexValueContext extends ParserRuleContext {
		public FlexValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flexValue; }
	 
		public FlexValueContext() { }
		public void copyFrom(FlexValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlexNumberValuesContext extends FlexValueContext {
		public List<TerminalNode> NUMBER() { return getTokens(CssParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CssParser.NUMBER, i);
		}
		public FlexNumberValuesContext(FlexValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFlexNumberValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFlexNumberValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFlexNumberValues(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlexKeywordValueContext extends FlexValueContext {
		public TerminalNode KEYWORD() { return getToken(CssParser.KEYWORD, 0); }
		public FlexKeywordValueContext(FlexValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFlexKeywordValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFlexKeywordValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFlexKeywordValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlexValueContext flexValue() throws RecognitionException {
		FlexValueContext _localctx = new FlexValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_flexValue);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new FlexNumberValuesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154);
					match(NUMBER);
					}
					}
					setState(157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case KEYWORD:
				_localctx = new FlexKeywordValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(KEYWORD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColorDeclContext extends ParserRuleContext {
		public ColorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorDecl; }
	 
		public ColorDeclContext() { }
		public void copyFrom(ColorDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColorDeclarationContext extends ColorDeclContext {
		public TerminalNode COLOR() { return getToken(CssParser.COLOR, 0); }
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public ColorValueContext colorValue() {
			return getRuleContext(ColorValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CssParser.SEMI, 0); }
		public ColorDeclarationContext(ColorDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterColorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitColorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitColorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorDeclContext colorDecl() throws RecognitionException {
		ColorDeclContext _localctx = new ColorDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_colorDecl);
		try {
			_localctx = new ColorDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(COLOR);
			setState(163);
			match(COLON);
			setState(164);
			colorValue();
			setState(165);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BackgroundColorDeclContext extends ParserRuleContext {
		public BackgroundColorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backgroundColorDecl; }
	 
		public BackgroundColorDeclContext() { }
		public void copyFrom(BackgroundColorDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BackgroundColorDeclarationContext extends BackgroundColorDeclContext {
		public TerminalNode BACKGROUND_COLOR() { return getToken(CssParser.BACKGROUND_COLOR, 0); }
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public ColorValueContext colorValue() {
			return getRuleContext(ColorValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CssParser.SEMI, 0); }
		public BackgroundColorDeclarationContext(BackgroundColorDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterBackgroundColorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitBackgroundColorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitBackgroundColorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackgroundColorDeclContext backgroundColorDecl() throws RecognitionException {
		BackgroundColorDeclContext _localctx = new BackgroundColorDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_backgroundColorDecl);
		try {
			_localctx = new BackgroundColorDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(BACKGROUND_COLOR);
			setState(168);
			match(COLON);
			setState(169);
			colorValue();
			setState(170);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColorValueContext extends ParserRuleContext {
		public ColorValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorValue; }
	 
		public ColorValueContext() { }
		public void copyFrom(ColorValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HexColorValueContext extends ColorValueContext {
		public TerminalNode HEX_COLOR() { return getToken(CssParser.HEX_COLOR, 0); }
		public HexColorValueContext(ColorValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterHexColorValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitHexColorValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitHexColorValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedColorValueContext extends ColorValueContext {
		public TerminalNode COLOR_NAME() { return getToken(CssParser.COLOR_NAME, 0); }
		public NamedColorValueContext(ColorValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterNamedColorValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitNamedColorValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitNamedColorValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionColorValueContext extends ColorValueContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionColorValueContext(ColorValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFunctionColorValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFunctionColorValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFunctionColorValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorValueContext colorValue() throws RecognitionException {
		ColorValueContext _localctx = new ColorValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_colorValue);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEX_COLOR:
				_localctx = new HexColorValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(HEX_COLOR);
				}
				break;
			case COLOR_NAME:
				_localctx = new NamedColorValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(COLOR_NAME);
				}
				break;
			case IDENT:
				_localctx = new FunctionColorValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				functionCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LengthDeclContext extends ParserRuleContext {
		public LengthDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthDecl; }
	 
		public LengthDeclContext() { }
		public void copyFrom(LengthDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LengthDeclarationContext extends LengthDeclContext {
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public LengthListContext lengthList() {
			return getRuleContext(LengthListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CssParser.SEMI, 0); }
		public TerminalNode WIDTH() { return getToken(CssParser.WIDTH, 0); }
		public TerminalNode HEIGHT() { return getToken(CssParser.HEIGHT, 0); }
		public TerminalNode MAX_WIDTH() { return getToken(CssParser.MAX_WIDTH, 0); }
		public TerminalNode GAP() { return getToken(CssParser.GAP, 0); }
		public TerminalNode FONT_SIZE() { return getToken(CssParser.FONT_SIZE, 0); }
		public TerminalNode LINE_HEIGHT() { return getToken(CssParser.LINE_HEIGHT, 0); }
		public TerminalNode BORDER_RADIUS() { return getToken(CssParser.BORDER_RADIUS, 0); }
		public LengthDeclarationContext(LengthDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterLengthDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitLengthDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitLengthDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthDeclContext lengthDecl() throws RecognitionException {
		LengthDeclContext _localctx = new LengthDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lengthDecl);
		int _la;
		try {
			_localctx = new LengthDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796357263360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
			match(COLON);
			setState(179);
			lengthList();
			setState(180);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LengthListContext extends ParserRuleContext {
		public LengthListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthList; }
	 
		public LengthListContext() { }
		public void copyFrom(LengthListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LengthListValueContext extends LengthListContext {
		public List<LengthValueContext> lengthValue() {
			return getRuleContexts(LengthValueContext.class);
		}
		public LengthValueContext lengthValue(int i) {
			return getRuleContext(LengthValueContext.class,i);
		}
		public LengthListValueContext(LengthListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterLengthListValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitLengthListValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitLengthListValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthListContext lengthList() throws RecognitionException {
		LengthListContext _localctx = new LengthListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lengthList);
		int _la;
		try {
			_localctx = new LengthListValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				lengthValue();
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LengthValueContext extends ParserRuleContext {
		public LengthValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthValue; }
	 
		public LengthValueContext() { }
		public void copyFrom(LengthValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LengthValueItemContext extends LengthValueContext {
		public TerminalNode NUMBER() { return getToken(CssParser.NUMBER, 0); }
		public TerminalNode UNIT() { return getToken(CssParser.UNIT, 0); }
		public TerminalNode KEYWORD() { return getToken(CssParser.KEYWORD, 0); }
		public LengthValueItemContext(LengthValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterLengthValueItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitLengthValueItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitLengthValueItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthValueContext lengthValue() throws RecognitionException {
		LengthValueContext _localctx = new LengthValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lengthValue);
		int _la;
		try {
			_localctx = new LengthValueItemContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(NUMBER);
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1+1:
				{
				setState(188);
				match(UNIT);
				}
				break;
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD) {
				{
				setState(191);
				match(KEYWORD);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpacingDeclContext extends ParserRuleContext {
		public SpacingDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spacingDecl; }
	 
		public SpacingDeclContext() { }
		public void copyFrom(SpacingDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpacingDeclarationContext extends SpacingDeclContext {
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(CssParser.SEMI, 0); }
		public TerminalNode MARGIN() { return getToken(CssParser.MARGIN, 0); }
		public TerminalNode MARGIN_TOP() { return getToken(CssParser.MARGIN_TOP, 0); }
		public TerminalNode MARGIN_BOTTOM() { return getToken(CssParser.MARGIN_BOTTOM, 0); }
		public TerminalNode PADDING() { return getToken(CssParser.PADDING, 0); }
		public List<SpacingValueContext> spacingValue() {
			return getRuleContexts(SpacingValueContext.class);
		}
		public SpacingValueContext spacingValue(int i) {
			return getRuleContext(SpacingValueContext.class,i);
		}
		public SpacingDeclarationContext(SpacingDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSpacingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSpacingDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSpacingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpacingDeclContext spacingDecl() throws RecognitionException {
		SpacingDeclContext _localctx = new SpacingDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_spacingDecl);
		int _la;
		try {
			_localctx = new SpacingDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(195);
			match(COLON);
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				spacingValue();
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(201);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpacingValueContext extends ParserRuleContext {
		public SpacingValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spacingValue; }
	 
		public SpacingValueContext() { }
		public void copyFrom(SpacingValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpacingValueItemContext extends SpacingValueContext {
		public TerminalNode NUMBER() { return getToken(CssParser.NUMBER, 0); }
		public TerminalNode UNIT() { return getToken(CssParser.UNIT, 0); }
		public TerminalNode KEYWORD() { return getToken(CssParser.KEYWORD, 0); }
		public SpacingValueItemContext(SpacingValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSpacingValueItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSpacingValueItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSpacingValueItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpacingValueContext spacingValue() throws RecognitionException {
		SpacingValueContext _localctx = new SpacingValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_spacingValue);
		int _la;
		try {
			_localctx = new SpacingValueItemContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(NUMBER);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIT) {
				{
				setState(204);
				match(UNIT);
				}
			}

			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD) {
				{
				setState(207);
				match(KEYWORD);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LayoutDeclContext extends ParserRuleContext {
		public LayoutDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoutDecl; }
	 
		public LayoutDeclContext() { }
		public void copyFrom(LayoutDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LayoutDeclarationContext extends LayoutDeclContext {
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public LayoutValueContext layoutValue() {
			return getRuleContext(LayoutValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CssParser.SEMI, 0); }
		public TerminalNode DISPLAY() { return getToken(CssParser.DISPLAY, 0); }
		public TerminalNode JUSTIFY_CONTENT() { return getToken(CssParser.JUSTIFY_CONTENT, 0); }
		public TerminalNode ALIGN_ITEMS() { return getToken(CssParser.ALIGN_ITEMS, 0); }
		public TerminalNode FLEX_WRAP() { return getToken(CssParser.FLEX_WRAP, 0); }
		public TerminalNode TEXT_ALIGN() { return getToken(CssParser.TEXT_ALIGN, 0); }
		public TerminalNode OBJECT_FIT() { return getToken(CssParser.OBJECT_FIT, 0); }
		public LayoutDeclarationContext(LayoutDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterLayoutDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitLayoutDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitLayoutDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoutDeclContext layoutDecl() throws RecognitionException {
		LayoutDeclContext _localctx = new LayoutDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_layoutDecl);
		int _la;
		try {
			_localctx = new LayoutDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(211);
			match(COLON);
			setState(212);
			layoutValue();
			setState(213);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LayoutValueContext extends ParserRuleContext {
		public LayoutValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoutValue; }
	 
		public LayoutValueContext() { }
		public void copyFrom(LayoutValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LayoutFlexValueContext extends LayoutValueContext {
		public TerminalNode FLEX() { return getToken(CssParser.FLEX, 0); }
		public LayoutFlexValueContext(LayoutValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterLayoutFlexValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitLayoutFlexValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitLayoutFlexValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LayoutKeywordContext extends LayoutValueContext {
		public TerminalNode KEYWORD() { return getToken(CssParser.KEYWORD, 0); }
		public LayoutKeywordContext(LayoutValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterLayoutKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitLayoutKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitLayoutKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoutValueContext layoutValue() throws RecognitionException {
		LayoutValueContext _localctx = new LayoutValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_layoutValue);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD:
				_localctx = new LayoutKeywordContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(KEYWORD);
				}
				break;
			case FLEX:
				_localctx = new LayoutFlexValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(FLEX);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontDeclContext extends ParserRuleContext {
		public FontDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontDecl; }
	 
		public FontDeclContext() { }
		public void copyFrom(FontDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FontOtherDeclarationContext extends FontDeclContext {
		public FontContext font() {
			return getRuleContext(FontContext.class,0);
		}
		public FontOtherDeclarationContext(FontDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFontOtherDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFontOtherDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFontOtherDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FontFamilyDeclarationContext extends FontDeclContext {
		public FontFamilyDeclContext fontFamilyDecl() {
			return getRuleContext(FontFamilyDeclContext.class,0);
		}
		public FontFamilyDeclarationContext(FontDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFontFamilyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFontFamilyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFontFamilyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontDeclContext fontDecl() throws RecognitionException {
		FontDeclContext _localctx = new FontDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fontDecl);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FONT_FAMILY:
				_localctx = new FontFamilyDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				fontFamilyDecl();
				}
				break;
			case FONT_WEIGHT:
			case TEXT_DECORATION:
				_localctx = new FontOtherDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				font();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontFamilyDeclContext extends ParserRuleContext {
		public FontFamilyDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFamilyDecl; }
	 
		public FontFamilyDeclContext() { }
		public void copyFrom(FontFamilyDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FontFamilyFullContext extends FontFamilyDeclContext {
		public TerminalNode FONT_FAMILY() { return getToken(CssParser.FONT_FAMILY, 0); }
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public FontFamilyValueContext fontFamilyValue() {
			return getRuleContext(FontFamilyValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CssParser.SEMI, 0); }
		public FontFamilyFullContext(FontFamilyDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFontFamilyFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFontFamilyFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFontFamilyFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFamilyDeclContext fontFamilyDecl() throws RecognitionException {
		FontFamilyDeclContext _localctx = new FontFamilyDeclContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fontFamilyDecl);
		try {
			_localctx = new FontFamilyFullContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(FONT_FAMILY);
			setState(224);
			match(COLON);
			setState(225);
			fontFamilyValue();
			setState(226);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontFamilyValueContext extends ParserRuleContext {
		public FontFamilyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFamilyValue; }
	 
		public FontFamilyValueContext() { }
		public void copyFrom(FontFamilyValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FontFamilyListContext extends FontFamilyValueContext {
		public List<FontFamilyItemContext> fontFamilyItem() {
			return getRuleContexts(FontFamilyItemContext.class);
		}
		public FontFamilyItemContext fontFamilyItem(int i) {
			return getRuleContext(FontFamilyItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CssParser.COMMA, i);
		}
		public FontFamilyListContext(FontFamilyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFontFamilyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFontFamilyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFontFamilyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFamilyValueContext fontFamilyValue() throws RecognitionException {
		FontFamilyValueContext _localctx = new FontFamilyValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fontFamilyValue);
		int _la;
		try {
			_localctx = new FontFamilyListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			fontFamilyItem();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(229);
				match(COMMA);
				setState(230);
				fontFamilyItem();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontFamilyItemContext extends ParserRuleContext {
		public FontFamilyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFamilyItem; }
	 
		public FontFamilyItemContext() { }
		public void copyFrom(FontFamilyItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FontFamilyIdentContext extends FontFamilyItemContext {
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public FontFamilyIdentContext(FontFamilyItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFontFamilyIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFontFamilyIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFontFamilyIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FontFamilyStringContext extends FontFamilyItemContext {
		public TerminalNode STRING() { return getToken(CssParser.STRING, 0); }
		public FontFamilyStringContext(FontFamilyItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFontFamilyString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFontFamilyString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFontFamilyString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFamilyItemContext fontFamilyItem() throws RecognitionException {
		FontFamilyItemContext _localctx = new FontFamilyItemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fontFamilyItem);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new FontFamilyStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(STRING);
				}
				break;
			case IDENT:
				_localctx = new FontFamilyIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontContext extends ParserRuleContext {
		public FontContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_font; }
	 
		public FontContext() { }
		public void copyFrom(FontContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FontKeywordDeclarationContext extends FontContext {
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public TerminalNode KEYWORD() { return getToken(CssParser.KEYWORD, 0); }
		public TerminalNode SEMI() { return getToken(CssParser.SEMI, 0); }
		public TerminalNode FONT_WEIGHT() { return getToken(CssParser.FONT_WEIGHT, 0); }
		public TerminalNode TEXT_DECORATION() { return getToken(CssParser.TEXT_DECORATION, 0); }
		public FontKeywordDeclarationContext(FontContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFontKeywordDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFontKeywordDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFontKeywordDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontContext font() throws RecognitionException {
		FontContext _localctx = new FontContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_font);
		int _la;
		try {
			_localctx = new FontKeywordDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==FONT_WEIGHT || _la==TEXT_DECORATION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(241);
			match(COLON);
			setState(242);
			match(KEYWORD);
			setState(243);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BackgroundDeclContext extends ParserRuleContext {
		public BackgroundDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backgroundDecl; }
	 
		public BackgroundDeclContext() { }
		public void copyFrom(BackgroundDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BackgroundDeclarationContext extends BackgroundDeclContext {
		public TerminalNode BACKGROUND() { return getToken(CssParser.BACKGROUND, 0); }
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public ColorValueContext colorValue() {
			return getRuleContext(ColorValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CssParser.SEMI, 0); }
		public BackgroundDeclarationContext(BackgroundDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterBackgroundDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitBackgroundDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitBackgroundDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackgroundDeclContext backgroundDecl() throws RecognitionException {
		BackgroundDeclContext _localctx = new BackgroundDeclContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_backgroundDecl);
		try {
			_localctx = new BackgroundDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(BACKGROUND);
			setState(246);
			match(COLON);
			setState(247);
			colorValue();
			setState(248);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BorderDeclContext extends ParserRuleContext {
		public BorderDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderDecl; }
	 
		public BorderDeclContext() { }
		public void copyFrom(BorderDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BorderDeclarationContext extends BorderDeclContext {
		public TerminalNode BORDER() { return getToken(CssParser.BORDER, 0); }
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CssParser.SEMI, 0); }
		public BorderDeclarationContext(BorderDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterBorderDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitBorderDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitBorderDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderDeclContext borderDecl() throws RecognitionException {
		BorderDeclContext _localctx = new BorderDeclContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_borderDecl);
		try {
			_localctx = new BorderDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(BORDER);
			setState(251);
			match(COLON);
			setState(252);
			value();
			setState(253);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EffectDeclContext extends ParserRuleContext {
		public EffectDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectDecl; }
	 
		public EffectDeclContext() { }
		public void copyFrom(EffectDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EffectDeclarationContext extends EffectDeclContext {
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CssParser.SEMI, 0); }
		public TerminalNode BOX_SHADOW() { return getToken(CssParser.BOX_SHADOW, 0); }
		public TerminalNode TRANSITION() { return getToken(CssParser.TRANSITION, 0); }
		public TerminalNode TRANSFORM() { return getToken(CssParser.TRANSFORM, 0); }
		public EffectDeclarationContext(EffectDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterEffectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitEffectDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitEffectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectDeclContext effectDecl() throws RecognitionException {
		EffectDeclContext _localctx = new EffectDeclContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_effectDecl);
		int _la;
		try {
			_localctx = new EffectDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 123145302310912L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(256);
			match(COLON);
			setState(257);
			value();
			setState(258);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GridDeclContext extends ParserRuleContext {
		public GridDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gridDecl; }
	 
		public GridDeclContext() { }
		public void copyFrom(GridDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GridDeclarationContext extends GridDeclContext {
		public TerminalNode GRID_TEMPLATE_COLUMNS() { return getToken(CssParser.GRID_TEMPLATE_COLUMNS, 0); }
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CssParser.SEMI, 0); }
		public GridDeclarationContext(GridDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterGridDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitGridDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitGridDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GridDeclContext gridDecl() throws RecognitionException {
		GridDeclContext _localctx = new GridDeclContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_gridDecl);
		try {
			_localctx = new GridDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(GRID_TEMPLATE_COLUMNS);
			setState(261);
			match(COLON);
			setState(262);
			value();
			setState(263);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoxSizingDeclContext extends ParserRuleContext {
		public BoxSizingDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxSizingDecl; }
	 
		public BoxSizingDeclContext() { }
		public void copyFrom(BoxSizingDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoxSizingDeclarationContext extends BoxSizingDeclContext {
		public TerminalNode BOX_SIZING() { return getToken(CssParser.BOX_SIZING, 0); }
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public TerminalNode SEMI() { return getToken(CssParser.SEMI, 0); }
		public BoxSizingDeclarationContext(BoxSizingDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterBoxSizingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitBoxSizingDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitBoxSizingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxSizingDeclContext boxSizingDecl() throws RecognitionException {
		BoxSizingDeclContext _localctx = new BoxSizingDeclContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_boxSizingDecl);
		try {
			_localctx = new BoxSizingDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(BOX_SIZING);
			setState(266);
			match(COLON);
			setState(267);
			match(IDENT);
			setState(268);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CursorDeclContext extends ParserRuleContext {
		public CursorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursorDecl; }
	 
		public CursorDeclContext() { }
		public void copyFrom(CursorDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CursorDeclarationContext extends CursorDeclContext {
		public TerminalNode CURSOR() { return getToken(CssParser.CURSOR, 0); }
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public TerminalNode SEMI() { return getToken(CssParser.SEMI, 0); }
		public CursorDeclarationContext(CursorDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCursorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCursorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCursorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CursorDeclContext cursorDecl() throws RecognitionException {
		CursorDeclContext _localctx = new CursorDeclContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cursorDecl);
		try {
			_localctx = new CursorDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(CURSOR);
			setState(271);
			match(COLON);
			setState(272);
			match(IDENT);
			setState(273);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueListContext extends ValueContext {
		public List<ValuePartContext> valuePart() {
			return getRuleContexts(ValuePartContext.class);
		}
		public ValuePartContext valuePart(int i) {
			return getRuleContext(ValuePartContext.class,i);
		}
		public ValueListContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_value);
		int _la;
		try {
			_localctx = new ValueListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(276); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(275);
				valuePart();
				}
				}
				setState(278); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1196270798731296L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuePartContext extends ParserRuleContext {
		public ValuePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuePart; }
	 
		public ValuePartContext() { }
		public void copyFrom(ValuePartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueFunctionContext extends ValuePartContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ValueFunctionContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValueFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValueFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValueFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueIdentContext extends ValuePartContext {
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public ValueIdentContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValueIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValueIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValueIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueAngleContext extends ValuePartContext {
		public TerminalNode ANGLE() { return getToken(CssParser.ANGLE, 0); }
		public ValueAngleContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValueAngle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValueAngle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValueAngle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueTransformContext extends ValuePartContext {
		public TerminalNode TRANSFORM() { return getToken(CssParser.TRANSFORM, 0); }
		public ValueTransformContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValueTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValueTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValueTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueKeywordContext extends ValuePartContext {
		public TerminalNode KEYWORD() { return getToken(CssParser.KEYWORD, 0); }
		public ValueKeywordContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValueKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValueKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValueKeyword(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueBackgroundContext extends ValuePartContext {
		public TerminalNode BACKGROUND() { return getToken(CssParser.BACKGROUND, 0); }
		public ValueBackgroundContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValueBackground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValueBackground(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValueBackground(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueNamedColorContext extends ValuePartContext {
		public TerminalNode COLOR_NAME() { return getToken(CssParser.COLOR_NAME, 0); }
		public ValueNamedColorContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValueNamedColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValueNamedColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValueNamedColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueNumberContext extends ValuePartContext {
		public TerminalNode NUMBER() { return getToken(CssParser.NUMBER, 0); }
		public TerminalNode UNIT() { return getToken(CssParser.UNIT, 0); }
		public ValueNumberContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValueNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValueNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValueNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueHexColorContext extends ValuePartContext {
		public TerminalNode HEX_COLOR() { return getToken(CssParser.HEX_COLOR, 0); }
		public ValueHexColorContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValueHexColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValueHexColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValueHexColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueCommaContext extends ValuePartContext {
		public TerminalNode COMMA() { return getToken(CssParser.COMMA, 0); }
		public ValueCommaContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValueComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValueComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValueComma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueStringContext extends ValuePartContext {
		public TerminalNode STRING() { return getToken(CssParser.STRING, 0); }
		public ValueStringContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValueString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValueString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValueString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuePartContext valuePart() throws RecognitionException {
		ValuePartContext _localctx = new ValuePartContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_valuePart);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new ValueFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				functionCall();
				}
				break;
			case 2:
				_localctx = new ValueHexColorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(HEX_COLOR);
				}
				break;
			case 3:
				_localctx = new ValueNamedColorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				match(COLOR_NAME);
				}
				break;
			case 4:
				_localctx = new ValueAngleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				match(ANGLE);
				}
				break;
			case 5:
				_localctx = new ValueNumberContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				match(NUMBER);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(285);
					match(UNIT);
					}
				}

				}
				break;
			case 6:
				_localctx = new ValueStringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(288);
				match(STRING);
				}
				break;
			case 7:
				_localctx = new ValueKeywordContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(289);
				match(KEYWORD);
				}
				break;
			case 8:
				_localctx = new ValueBackgroundContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(290);
				match(BACKGROUND);
				}
				break;
			case 9:
				_localctx = new ValueTransformContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(291);
				match(TRANSFORM);
				}
				break;
			case 10:
				_localctx = new ValueIdentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(292);
				match(IDENT);
				}
				break;
			case 11:
				_localctx = new ValueCommaContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(293);
				match(COMMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallmentContext extends FunctionCallContext {
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(CssParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public FunctionCallmentContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFunctionCallment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFunctionCallment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFunctionCallment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functionCall);
		int _la;
		try {
			_localctx = new FunctionCallmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(IDENT);
			setState(297);
			match(LPAREN);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1196270798731296L) != 0)) {
				{
				setState(298);
				functionArgs();
				}
			}

			setState(301);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgsContext extends ParserRuleContext {
		public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs; }
	 
		public FunctionArgsContext() { }
		public void copyFrom(FunctionArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgumentsContext extends FunctionArgsContext {
		public List<ValuePartContext> valuePart() {
			return getRuleContexts(ValuePartContext.class);
		}
		public ValuePartContext valuePart(int i) {
			return getRuleContext(ValuePartContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CssParser.COMMA, i);
		}
		public FunctionArgumentsContext(FunctionArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFunctionArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsContext functionArgs() throws RecognitionException {
		FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_functionArgs);
		int _la;
		try {
			_localctx = new FunctionArgumentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			valuePart();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(304);
				match(COMMA);
				setState(305);
				valuePart();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u0138\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0005\u0000N\b\u0000"+
		"\n\u0000\f\u0000Q\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001X\b\u0001\n\u0001\f\u0001[\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002b\b\u0002"+
		"\n\u0002\f\u0002e\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003k\b\u0003\n\u0003\f\u0003n\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004r\b\u0004\u0001\u0005\u0004\u0005u\b\u0005\u000b\u0005\f\u0005"+
		"v\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006}\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0094\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004\f\u009c\b\f\u000b"+
		"\f\f\f\u009d\u0001\f\u0003\f\u00a1\b\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b0\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011\u00b8"+
		"\b\u0011\u000b\u0011\f\u0011\u00b9\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00be\b\u0012\u0001\u0012\u0003\u0012\u00c1\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0004\u0013\u00c6\b\u0013\u000b\u0013\f\u0013\u00c7"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u00ce\b\u0014"+
		"\u0001\u0014\u0003\u0014\u00d1\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u00da\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00de\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u00e8\b\u0019\n\u0019\f\u0019\u00eb\t\u0019\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u00ef\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0004\"\u0115\b\""+
		"\u000b\"\f\"\u0116\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u011f"+
		"\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0127\b#\u0001$\u0001"+
		"$\u0001$\u0003$\u012c\b$\u0001$\u0001$\u0001%\u0001%\u0001%\u0005%\u0133"+
		"\b%\n%\f%\u0136\t%\u0001%\u0001\u00bd\u0000&\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJ\u0000\u0005\u0002\u0000\u0016\u001b++\u0001\u0000\u0012\u0015"+
		"\u0001\u0000!&\u0001\u0000()\u0001\u0000,.\u0142\u0000O\u0001\u0000\u0000"+
		"\u0000\u0002T\u0001\u0000\u0000\u0000\u0004^\u0001\u0000\u0000\u0000\u0006"+
		"f\u0001\u0000\u0000\u0000\bq\u0001\u0000\u0000\u0000\nt\u0001\u0000\u0000"+
		"\u0000\f|\u0001\u0000\u0000\u0000\u000e~\u0001\u0000\u0000\u0000\u0010"+
		"\u0080\u0001\u0000\u0000\u0000\u0012\u0083\u0001\u0000\u0000\u0000\u0014"+
		"\u0093\u0001\u0000\u0000\u0000\u0016\u0095\u0001\u0000\u0000\u0000\u0018"+
		"\u00a0\u0001\u0000\u0000\u0000\u001a\u00a2\u0001\u0000\u0000\u0000\u001c"+
		"\u00a7\u0001\u0000\u0000\u0000\u001e\u00af\u0001\u0000\u0000\u0000 \u00b1"+
		"\u0001\u0000\u0000\u0000\"\u00b7\u0001\u0000\u0000\u0000$\u00bb\u0001"+
		"\u0000\u0000\u0000&\u00c2\u0001\u0000\u0000\u0000(\u00cb\u0001\u0000\u0000"+
		"\u0000*\u00d2\u0001\u0000\u0000\u0000,\u00d9\u0001\u0000\u0000\u0000."+
		"\u00dd\u0001\u0000\u0000\u00000\u00df\u0001\u0000\u0000\u00002\u00e4\u0001"+
		"\u0000\u0000\u00004\u00ee\u0001\u0000\u0000\u00006\u00f0\u0001\u0000\u0000"+
		"\u00008\u00f5\u0001\u0000\u0000\u0000:\u00fa\u0001\u0000\u0000\u0000<"+
		"\u00ff\u0001\u0000\u0000\u0000>\u0104\u0001\u0000\u0000\u0000@\u0109\u0001"+
		"\u0000\u0000\u0000B\u010e\u0001\u0000\u0000\u0000D\u0114\u0001\u0000\u0000"+
		"\u0000F\u0126\u0001\u0000\u0000\u0000H\u0128\u0001\u0000\u0000\u0000J"+
		"\u012f\u0001\u0000\u0000\u0000LN\u0003\u0002\u0001\u0000ML\u0001\u0000"+
		"\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"RS\u0005\u0000\u0000\u0001S\u0001\u0001\u0000\u0000\u0000TU\u0003\u0004"+
		"\u0002\u0000UY\u0005\u0001\u0000\u0000VX\u0003\u0014\n\u0000WV\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"\\]\u0005\u0002\u0000\u0000]\u0003\u0001\u0000\u0000\u0000^c\u0003\u0006"+
		"\u0003\u0000_`\u0005\u0005\u0000\u0000`b\u0003\u0006\u0003\u0000a_\u0001"+
		"\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000d\u0005\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000fl\u0003\n\u0005\u0000gh\u0003\b\u0004\u0000hi\u0003\n\u0005"+
		"\u0000ik\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000kn\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0007"+
		"\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000or\u0005\n\u0000\u0000"+
		"pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000"+
		"\u0000r\t\u0001\u0000\u0000\u0000su\u0003\f\u0006\u0000ts\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000w\u000b\u0001\u0000\u0000\u0000x}\u0005\u0007\u0000"+
		"\u0000y}\u0003\u000e\u0007\u0000z}\u0003\u0010\b\u0000{}\u0003\u0012\t"+
		"\u0000|x\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000|{\u0001\u0000\u0000\u0000}\r\u0001\u0000\u0000\u0000~\u007f"+
		"\u00052\u0000\u0000\u007f\u000f\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"\u0006\u0000\u0000\u0081\u0082\u00052\u0000\u0000\u0082\u0011\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005\u0003\u0000\u0000\u0084\u0085\u00052\u0000"+
		"\u0000\u0085\u0013\u0001\u0000\u0000\u0000\u0086\u0094\u0003\u0016\u000b"+
		"\u0000\u0087\u0094\u0003\u001a\r\u0000\u0088\u0094\u0003\u001c\u000e\u0000"+
		"\u0089\u0094\u0003 \u0010\u0000\u008a\u0094\u0003&\u0013\u0000\u008b\u0094"+
		"\u0003*\u0015\u0000\u008c\u0094\u0003.\u0017\u0000\u008d\u0094\u0003:"+
		"\u001d\u0000\u008e\u0094\u0003<\u001e\u0000\u008f\u0094\u0003>\u001f\u0000"+
		"\u0090\u0094\u00038\u001c\u0000\u0091\u0094\u0003@ \u0000\u0092\u0094"+
		"\u0003B!\u0000\u0093\u0086\u0001\u0000\u0000\u0000\u0093\u0087\u0001\u0000"+
		"\u0000\u0000\u0093\u0088\u0001\u0000\u0000\u0000\u0093\u0089\u0001\u0000"+
		"\u0000\u0000\u0093\u008a\u0001\u0000\u0000\u0000\u0093\u008b\u0001\u0000"+
		"\u0000\u0000\u0093\u008c\u0001\u0000\u0000\u0000\u0093\u008d\u0001\u0000"+
		"\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0093\u008f\u0001\u0000"+
		"\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0015\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005\u001d\u0000\u0000\u0096\u0097\u0005\u0003"+
		"\u0000\u0000\u0097\u0098\u0003\u0018\f\u0000\u0098\u0099\u0005\u0004\u0000"+
		"\u0000\u0099\u0017\u0001\u0000\u0000\u0000\u009a\u009c\u0005\r\u0000\u0000"+
		"\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u00a1\u0005\u0011\u0000\u0000"+
		"\u00a0\u009b\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u0019\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u001e\u0000\u0000"+
		"\u00a3\u00a4\u0005\u0003\u0000\u0000\u00a4\u00a5\u0003\u001e\u000f\u0000"+
		"\u00a5\u00a6\u0005\u0004\u0000\u0000\u00a6\u001b\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0005 \u0000\u0000\u00a8\u00a9\u0005\u0003\u0000\u0000\u00a9"+
		"\u00aa\u0003\u001e\u000f\u0000\u00aa\u00ab\u0005\u0004\u0000\u0000\u00ab"+
		"\u001d\u0001\u0000\u0000\u0000\u00ac\u00b0\u0005\u000b\u0000\u0000\u00ad"+
		"\u00b0\u0005\f\u0000\u0000\u00ae\u00b0\u0003H$\u0000\u00af\u00ac\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u001f\u0001\u0000\u0000\u0000\u00b1\u00b2\u0007"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005\u0003\u0000\u0000\u00b3\u00b4\u0003"+
		"\"\u0011\u0000\u00b4\u00b5\u0005\u0004\u0000\u0000\u00b5!\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b8\u0003$\u0012\u0000\u00b7\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba#\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bd\u0005\r\u0000\u0000\u00bc\u00be\u0005\u000f\u0000\u0000\u00bd"+
		"\u00be\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00c0\u0001\u0000\u0000\u0000\u00bf\u00c1\u0005\u0011\u0000\u0000\u00c0"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"%\u0001\u0000\u0000\u0000\u00c2\u00c3\u0007\u0001\u0000\u0000\u00c3\u00c5"+
		"\u0005\u0003\u0000\u0000\u00c4\u00c6\u0003(\u0014\u0000\u00c5\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0005\u0004\u0000\u0000\u00ca\'\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cd\u0005\r\u0000\u0000\u00cc\u00ce\u0005\u000f\u0000"+
		"\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00d1\u0005\u0011\u0000"+
		"\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1)\u0001\u0000\u0000\u0000\u00d2\u00d3\u0007\u0002\u0000\u0000"+
		"\u00d3\u00d4\u0005\u0003\u0000\u0000\u00d4\u00d5\u0003,\u0016\u0000\u00d5"+
		"\u00d6\u0005\u0004\u0000\u0000\u00d6+\u0001\u0000\u0000\u0000\u00d7\u00da"+
		"\u0005\u0011\u0000\u0000\u00d8\u00da\u0005\u001d\u0000\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da-\u0001"+
		"\u0000\u0000\u0000\u00db\u00de\u00030\u0018\u0000\u00dc\u00de\u00036\u001b"+
		"\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de/\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\'\u0000\u0000"+
		"\u00e0\u00e1\u0005\u0003\u0000\u0000\u00e1\u00e2\u00032\u0019\u0000\u00e2"+
		"\u00e3\u0005\u0004\u0000\u0000\u00e31\u0001\u0000\u0000\u0000\u00e4\u00e9"+
		"\u00034\u001a\u0000\u00e5\u00e6\u0005\u0005\u0000\u0000\u00e6\u00e8\u0003"+
		"4\u001a\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea3\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ef\u0005\u0010\u0000\u0000\u00ed\u00ef\u00052\u0000\u0000"+
		"\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ef5\u0001\u0000\u0000\u0000\u00f0\u00f1\u0007\u0003\u0000\u0000\u00f1"+
		"\u00f2\u0005\u0003\u0000\u0000\u00f2\u00f3\u0005\u0011\u0000\u0000\u00f3"+
		"\u00f4\u0005\u0004\u0000\u0000\u00f47\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0005\u001f\u0000\u0000\u00f6\u00f7\u0005\u0003\u0000\u0000\u00f7\u00f8"+
		"\u0003\u001e\u000f\u0000\u00f8\u00f9\u0005\u0004\u0000\u0000\u00f99\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0005*\u0000\u0000\u00fb\u00fc\u0005\u0003"+
		"\u0000\u0000\u00fc\u00fd\u0003D\"\u0000\u00fd\u00fe\u0005\u0004\u0000"+
		"\u0000\u00fe;\u0001\u0000\u0000\u0000\u00ff\u0100\u0007\u0004\u0000\u0000"+
		"\u0100\u0101\u0005\u0003\u0000\u0000\u0101\u0102\u0003D\"\u0000\u0102"+
		"\u0103\u0005\u0004\u0000\u0000\u0103=\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0005/\u0000\u0000\u0105\u0106\u0005\u0003\u0000\u0000\u0106\u0107\u0003"+
		"D\"\u0000\u0107\u0108\u0005\u0004\u0000\u0000\u0108?\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0005\u001c\u0000\u0000\u010a\u010b\u0005\u0003\u0000"+
		"\u0000\u010b\u010c\u00052\u0000\u0000\u010c\u010d\u0005\u0004\u0000\u0000"+
		"\u010dA\u0001\u0000\u0000\u0000\u010e\u010f\u00050\u0000\u0000\u010f\u0110"+
		"\u0005\u0003\u0000\u0000\u0110\u0111\u00052\u0000\u0000\u0111\u0112\u0005"+
		"\u0004\u0000\u0000\u0112C\u0001\u0000\u0000\u0000\u0113\u0115\u0003F#"+
		"\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117E\u0001\u0000\u0000\u0000\u0118\u0127\u0003H$\u0000\u0119"+
		"\u0127\u0005\u000b\u0000\u0000\u011a\u0127\u0005\f\u0000\u0000\u011b\u0127"+
		"\u0005\u000e\u0000\u0000\u011c\u011e\u0005\r\u0000\u0000\u011d\u011f\u0005"+
		"\u000f\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001"+
		"\u0000\u0000\u0000\u011f\u0127\u0001\u0000\u0000\u0000\u0120\u0127\u0005"+
		"\u0010\u0000\u0000\u0121\u0127\u0005\u0011\u0000\u0000\u0122\u0127\u0005"+
		"\u001f\u0000\u0000\u0123\u0127\u0005.\u0000\u0000\u0124\u0127\u00052\u0000"+
		"\u0000\u0125\u0127\u0005\u0005\u0000\u0000\u0126\u0118\u0001\u0000\u0000"+
		"\u0000\u0126\u0119\u0001\u0000\u0000\u0000\u0126\u011a\u0001\u0000\u0000"+
		"\u0000\u0126\u011b\u0001\u0000\u0000\u0000\u0126\u011c\u0001\u0000\u0000"+
		"\u0000\u0126\u0120\u0001\u0000\u0000\u0000\u0126\u0121\u0001\u0000\u0000"+
		"\u0000\u0126\u0122\u0001\u0000\u0000\u0000\u0126\u0123\u0001\u0000\u0000"+
		"\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0125\u0001\u0000\u0000"+
		"\u0000\u0127G\u0001\u0000\u0000\u0000\u0128\u0129\u00052\u0000\u0000\u0129"+
		"\u012b\u0005\b\u0000\u0000\u012a\u012c\u0003J%\u0000\u012b\u012a\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0005\t\u0000\u0000\u012eI\u0001\u0000"+
		"\u0000\u0000\u012f\u0134\u0003F#\u0000\u0130\u0131\u0005\u0005\u0000\u0000"+
		"\u0131\u0133\u0003F#\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0136"+
		"\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0001\u0000\u0000\u0000\u0135K\u0001\u0000\u0000\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u001aOYclqv|\u0093\u009d\u00a0\u00af\u00b9\u00bd\u00c0"+
		"\u00c7\u00cd\u00d0\u00d9\u00dd\u00e9\u00ee\u0116\u011e\u0126\u012b\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}