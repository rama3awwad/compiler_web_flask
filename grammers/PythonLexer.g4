lexer grammar PythonLexer;

@header {
package antlr;
}

tokens { INDENT, DEDENT }

@lexer::members {

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
}

/* ===================== KEYWORDS ===================== */

FROM       : 'from';
IMPORT     : 'import';
AS         : 'as';
DEF        : 'def';
RETURN     : 'return';
IF         : 'if';
FOR        : 'for';
IN         : 'in';

/* ===================== SYMBOLS ===================== */

AT         : '@';
DOT        : '.';
COLON      : ':';
COMMA      : ',';
ASSIGN     : '=';
LPAREN     : '(' { opened++; };
RPAREN     : ')' { opened--; };
LBRACK     : '[' { opened++; };
RBRACK     : ']' { opened--; };
LBRACE     : '{' { opened++; };
RBRACE     : '}' { opened--; };
LT         : '<';
GT         : '>';
EQ         : '==';

/* ===================== LITERALS ===================== */

STRING
  : '"' ( ~["\\] | '\\' . )* '"'
  | '\'' ( ~['\\] | '\\' . )* '\''
  ;

NUMBER
  : [0-9]+ ('.' [0-9]+)?
  ;

ID
  : [a-zA-Z_][a-zA-Z0-9_]*
  ;

/* ===================== NEWLINE + INDENT ===================== */


NEWLINE
  : ( '\r'? '\n' | '\r' | '\f' ) [ \t]*
    {
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
    }
  ;
/* ===================== SKIPPED ===================== */

WS
  : [ \t]+ -> skip
  ;

COMMENT
  : '#' ~[\r\n]* -> skip
  ;

LINE_JOINING
  : '\\' [ \t]* ( '\r'? '\n' | '\r' | '\f' ) -> skip
  ;

UNKNOWN_CHAR
  : .
  ;
