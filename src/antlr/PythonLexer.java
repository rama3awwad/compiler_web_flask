// Generated from grammers/PythonLexer.g4 by ANTLR 4.13.2
package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, FROM=3, IMPORT=4, AS=5, DEF=6, RETURN=7, IF=8, FOR=9, 
		IN=10, AT=11, DOT=12, COLON=13, COMMA=14, ASSIGN=15, LPAREN=16, RPAREN=17, 
		LBRACK=18, RBRACK=19, LBRACE=20, RBRACE=21, LT=22, GT=23, EQ=24, STRING=25, 
		NUMBER=26, ID=27, NEWLINE=28, WS=29, COMMENT=30, LINE_JOINING=31, UNKNOWN_CHAR=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FROM", "IMPORT", "AS", "DEF", "RETURN", "IF", "FOR", "IN", "AT", "DOT", 
			"COLON", "COMMA", "ASSIGN", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", 
			"RBRACE", "LT", "GT", "EQ", "STRING", "NUMBER", "ID", "NEWLINE", "WS", 
			"COMMENT", "LINE_JOINING", "UNKNOWN_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'from'", "'import'", "'as'", "'def'", "'return'", 
			"'if'", "'for'", "'in'", "'@'", "'.'", "':'", "','", "'='", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'<'", "'>'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "FROM", "IMPORT", "AS", "DEF", "RETURN", "IF", 
			"FOR", "IN", "AT", "DOT", "COLON", "COMMA", "ASSIGN", "LPAREN", "RPAREN", 
			"LBRACK", "RBRACK", "LBRACE", "RBRACE", "LT", "GT", "EQ", "STRING", "NUMBER", 
			"ID", "NEWLINE", "WS", "COMMENT", "LINE_JOINING", "UNKNOWN_CHAR"
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



	  private final java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
	  private final java.util.Stack<Integer> indents = new java.util.Stack<>();
	  private int opened = 0;
	  private Token lastToken = null;

	  @Override
	  public void emit(Token t) {
	    super.setToken(t);
	    tokens.offer(t);
	  }

	  @Override
	  public Token nextToken() {

	    if (_input.LA(1) == EOF && !indents.isEmpty()) {

	      // remove trailing EOFs
	      while (!tokens.isEmpty() && tokens.peekLast().getType() == EOF) {
	        tokens.pollLast();
	      }

	      // emit a final NEWLINE
	      emit(commonToken(NEWLINE, "\n"));

	      // emit remaining DEDENTs
	      while (!indents.isEmpty()) {
	        emit(commonToken(DEDENT, ""));
	        indents.pop();
	      }

	      emit(commonToken(EOF, "<EOF>"));
	    }

	    Token next = super.nextToken();

	    if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	      lastToken = next;
	    }

	    return tokens.isEmpty() ? next : tokens.poll();
	  }

	  private CommonToken commonToken(int type, String text) {
	    int stop = getCharIndex() - 1;
	    int start = text.isEmpty() ? stop : stop - text.length() + 1;
	    return new CommonToken(_tokenFactorySourcePair, type, Token.DEFAULT_CHANNEL, start, stop);
	  }

	  private int getIndentationCount(String spaces) {
	    int count = 0;
	    for (char ch : spaces.toCharArray()) {
	      if (ch == '\t') {
	        count += 8 - (count % 8);
	      } else {
	        count++;
	      }
	    }
	    return count;
	  }

	  private boolean atStartOfInput() {
	    return getCharPositionInLine() == 0 && getLine() == 1;
	  }


	public PythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PythonLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 13:
			LPAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			RPAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			LBRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			RBRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			LBRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			RBRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 opened++; 
			break;
		}
	}
	private void RPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 opened--; 
			break;
		}
	}
	private void LBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 opened++; 
			break;
		}
	}
	private void RBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 opened--; 
			break;
		}
	}
	private void LBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 opened++; 
			break;
		}
	}
	private void RBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 opened--; 
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:

			      String text = getText();
			      String newLine = text.replaceAll("[^\\r\\n\\f]+", "");
			      String spaces = text.replaceAll("[\\r\\n\\f]+", "");

			      // إذا كنا داخل أي نوع من الأقواس → نخفي الـ NEWLINE تمامًا (لا نصدر أي شيء)
			      if (opened > 0) {
			        skip();
			      } else {
			        // خارج الأقواس فقط → نصدر NEWLINE ونعالج الـ indentation
			        emit(commonToken(NEWLINE, newLine));

			        int indent = getIndentationCount(spaces);
			        int previous = indents.isEmpty() ? 0 : indents.peek();

			        if (indent == previous) {
			          // نفس المستوى → لا INDENT ولا DEDENT إضافي
			        } else if (indent > previous) {
			          indents.push(indent);
			          emit(commonToken(INDENT, spaces));
			        } else {
			          while (!indents.isEmpty() && indents.peek() > indent) {
			            emit(commonToken(DEDENT, ""));
			            indents.pop();
			          }
			        }
			      }
			    
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000 \u00df\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u0089\b\u0016\n\u0016\f\u0016\u008c\t\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0093\b\u0016\n\u0016\f\u0016"+
		"\u0096\t\u0016\u0001\u0016\u0003\u0016\u0099\b\u0016\u0001\u0017\u0004"+
		"\u0017\u009c\b\u0017\u000b\u0017\f\u0017\u009d\u0001\u0017\u0001\u0017"+
		"\u0004\u0017\u00a2\b\u0017\u000b\u0017\f\u0017\u00a3\u0003\u0017\u00a6"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u00aa\b\u0018\n\u0018\f\u0018"+
		"\u00ad\t\u0018\u0001\u0019\u0003\u0019\u00b0\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u00b4\b\u0019\u0001\u0019\u0005\u0019\u00b7\b\u0019"+
		"\n\u0019\f\u0019\u00ba\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0004"+
		"\u001a\u00bf\b\u001a\u000b\u001a\f\u001a\u00c0\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u00c7\b\u001b\n\u001b\f\u001b\u00ca"+
		"\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0005\u001c\u00d0"+
		"\b\u001c\n\u001c\f\u001c\u00d3\t\u001c\u0001\u001c\u0003\u001c\u00d6\b"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u00da\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0000\u0000\u001e\u0001\u0003\u0003\u0004"+
		"\u0005\u0005\u0007\u0006\t\u0007\u000b\b\r\t\u000f\n\u0011\u000b\u0013"+
		"\f\u0015\r\u0017\u000e\u0019\u000f\u001b\u0010\u001d\u0011\u001f\u0012"+
		"!\u0013#\u0014%\u0015\'\u0016)\u0017+\u0018-\u0019/\u001a1\u001b3\u001c"+
		"5\u001d7\u001e9\u001f; \u0001\u0000\u0007\u0002\u0000\"\"\\\\\u0002\u0000"+
		"\'\'\\\\\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000"+
		"\t\t  \u0002\u0000\n\n\r\r\u00ef\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0001=\u0001\u0000\u0000\u0000\u0003B\u0001\u0000"+
		"\u0000\u0000\u0005I\u0001\u0000\u0000\u0000\u0007L\u0001\u0000\u0000\u0000"+
		"\tP\u0001\u0000\u0000\u0000\u000bW\u0001\u0000\u0000\u0000\rZ\u0001\u0000"+
		"\u0000\u0000\u000f^\u0001\u0000\u0000\u0000\u0011a\u0001\u0000\u0000\u0000"+
		"\u0013c\u0001\u0000\u0000\u0000\u0015e\u0001\u0000\u0000\u0000\u0017g"+
		"\u0001\u0000\u0000\u0000\u0019i\u0001\u0000\u0000\u0000\u001bk\u0001\u0000"+
		"\u0000\u0000\u001dn\u0001\u0000\u0000\u0000\u001fq\u0001\u0000\u0000\u0000"+
		"!t\u0001\u0000\u0000\u0000#w\u0001\u0000\u0000\u0000%z\u0001\u0000\u0000"+
		"\u0000\'}\u0001\u0000\u0000\u0000)\u007f\u0001\u0000\u0000\u0000+\u0081"+
		"\u0001\u0000\u0000\u0000-\u0098\u0001\u0000\u0000\u0000/\u009b\u0001\u0000"+
		"\u0000\u00001\u00a7\u0001\u0000\u0000\u00003\u00b3\u0001\u0000\u0000\u0000"+
		"5\u00be\u0001\u0000\u0000\u00007\u00c4\u0001\u0000\u0000\u00009\u00cd"+
		"\u0001\u0000\u0000\u0000;\u00dd\u0001\u0000\u0000\u0000=>\u0005f\u0000"+
		"\u0000>?\u0005r\u0000\u0000?@\u0005o\u0000\u0000@A\u0005m\u0000\u0000"+
		"A\u0002\u0001\u0000\u0000\u0000BC\u0005i\u0000\u0000CD\u0005m\u0000\u0000"+
		"DE\u0005p\u0000\u0000EF\u0005o\u0000\u0000FG\u0005r\u0000\u0000GH\u0005"+
		"t\u0000\u0000H\u0004\u0001\u0000\u0000\u0000IJ\u0005a\u0000\u0000JK\u0005"+
		"s\u0000\u0000K\u0006\u0001\u0000\u0000\u0000LM\u0005d\u0000\u0000MN\u0005"+
		"e\u0000\u0000NO\u0005f\u0000\u0000O\b\u0001\u0000\u0000\u0000PQ\u0005"+
		"r\u0000\u0000QR\u0005e\u0000\u0000RS\u0005t\u0000\u0000ST\u0005u\u0000"+
		"\u0000TU\u0005r\u0000\u0000UV\u0005n\u0000\u0000V\n\u0001\u0000\u0000"+
		"\u0000WX\u0005i\u0000\u0000XY\u0005f\u0000\u0000Y\f\u0001\u0000\u0000"+
		"\u0000Z[\u0005f\u0000\u0000[\\\u0005o\u0000\u0000\\]\u0005r\u0000\u0000"+
		"]\u000e\u0001\u0000\u0000\u0000^_\u0005i\u0000\u0000_`\u0005n\u0000\u0000"+
		"`\u0010\u0001\u0000\u0000\u0000ab\u0005@\u0000\u0000b\u0012\u0001\u0000"+
		"\u0000\u0000cd\u0005.\u0000\u0000d\u0014\u0001\u0000\u0000\u0000ef\u0005"+
		":\u0000\u0000f\u0016\u0001\u0000\u0000\u0000gh\u0005,\u0000\u0000h\u0018"+
		"\u0001\u0000\u0000\u0000ij\u0005=\u0000\u0000j\u001a\u0001\u0000\u0000"+
		"\u0000kl\u0005(\u0000\u0000lm\u0006\r\u0000\u0000m\u001c\u0001\u0000\u0000"+
		"\u0000no\u0005)\u0000\u0000op\u0006\u000e\u0001\u0000p\u001e\u0001\u0000"+
		"\u0000\u0000qr\u0005[\u0000\u0000rs\u0006\u000f\u0002\u0000s \u0001\u0000"+
		"\u0000\u0000tu\u0005]\u0000\u0000uv\u0006\u0010\u0003\u0000v\"\u0001\u0000"+
		"\u0000\u0000wx\u0005{\u0000\u0000xy\u0006\u0011\u0004\u0000y$\u0001\u0000"+
		"\u0000\u0000z{\u0005}\u0000\u0000{|\u0006\u0012\u0005\u0000|&\u0001\u0000"+
		"\u0000\u0000}~\u0005<\u0000\u0000~(\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005>\u0000\u0000\u0080*\u0001\u0000\u0000\u0000\u0081\u0082\u0005="+
		"\u0000\u0000\u0082\u0083\u0005=\u0000\u0000\u0083,\u0001\u0000\u0000\u0000"+
		"\u0084\u008a\u0005\"\u0000\u0000\u0085\u0089\b\u0000\u0000\u0000\u0086"+
		"\u0087\u0005\\\u0000\u0000\u0087\u0089\t\u0000\u0000\u0000\u0088\u0085"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008c"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008d\u0099\u0005\"\u0000\u0000\u008e\u0094\u0005"+
		"\'\u0000\u0000\u008f\u0093\b\u0001\u0000\u0000\u0090\u0091\u0005\\\u0000"+
		"\u0000\u0091\u0093\t\u0000\u0000\u0000\u0092\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0005\'\u0000\u0000\u0098\u0084\u0001\u0000\u0000\u0000\u0098"+
		"\u008e\u0001\u0000\u0000\u0000\u0099.\u0001\u0000\u0000\u0000\u009a\u009c"+
		"\u0007\u0002\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u00a5\u0001\u0000\u0000\u0000\u009f\u00a1"+
		"\u0005.\u0000\u0000\u00a0\u00a2\u0007\u0002\u0000\u0000\u00a1\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a5\u009f\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a60\u0001\u0000\u0000\u0000\u00a7\u00ab\u0007\u0003"+
		"\u0000\u0000\u00a8\u00aa\u0007\u0004\u0000\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac2\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005\r\u0000\u0000"+
		"\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b4\u0005\n\u0000\u0000\u00b2"+
		"\u00b4\u0002\f\r\u0000\u00b3\u00af\u0001\u0000\u0000\u0000\u00b3\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b8\u0001\u0000\u0000\u0000\u00b5\u00b7"+
		"\u0007\u0005\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0006\u0019\u0006\u0000\u00bc4\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bf\u0007\u0005\u0000\u0000\u00be\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0006\u001a\u0007\u0000\u00c36\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c8\u0005#\u0000\u0000\u00c5\u00c7\b\u0006\u0000"+
		"\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0006\u001b\u0007\u0000\u00cc8\u0001\u0000\u0000\u0000"+
		"\u00cd\u00d1\u0005\\\u0000\u0000\u00ce\u00d0\u0007\u0005\u0000\u0000\u00cf"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d6\u0005\r\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00da"+
		"\u0005\n\u0000\u0000\u00d8\u00da\u0002\f\r\u0000\u00d9\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0006\u001c\u0007\u0000\u00dc:\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\t\u0000\u0000\u0000\u00de<\u0001\u0000\u0000\u0000"+
		"\u0012\u0000\u0088\u008a\u0092\u0094\u0098\u009d\u00a3\u00a5\u00ab\u00af"+
		"\u00b3\u00b8\u00c0\u00c8\u00d1\u00d5\u00d9\b\u0001\r\u0000\u0001\u000e"+
		"\u0001\u0001\u000f\u0002\u0001\u0010\u0003\u0001\u0011\u0004\u0001\u0012"+
		"\u0005\u0001\u0019\u0006\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}