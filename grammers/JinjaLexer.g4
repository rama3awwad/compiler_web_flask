// HtmlJinjaLexer.g4
// This file defines a LEXER grammar only.
// Its responsibility is to tokenize HTML files that contain Jinja2 syntax.
// It does NOT build a parse tree or understand grammar rules.
lexer grammar JinjaLexer;

// Java-specific header.
// Generated lexer files will be placed inside the "antlr" package.
@header { package antlr; }

//////////////////////////////////////////////////////
// DEFAULT MODE
// This is the initial lexer mode.
// It handles plain HTML content outside tags and Jinja blocks.
//////////////////////////////////////////////////////

// Matches the start of a Jinja expression: {{ ... }}
// Switches to JINJA mode to tokenize Python-like expressions.
J_EXPR_OPEN  : '{{' -> pushMode(JINJA);

// Matches the start of a Jinja statement: {% ... %}
// Also switches to JINJA mode.
J_STMT_OPEN  : '{%' -> pushMode(JINJA);

// Matches HTML comments: <!-- comment -->
// These tokens are ignored completely.
COMMENT : '<!--' .*? '-->' -> skip;

// Matches the HTML doctype declaration.
// It is treated as a standalone token.
DOCTYPE : '<!doctype html>' ;

// Matches the start of a closing HTML tag: </tag>
// Switches to TAG mode to read the tag name.
TAG_SLASH_OPEN : '</' -> pushMode(TAG);

// Matches the start of an opening HTML tag: <tag>
// Switches to TAG mode.
TAG_OPEN       : '<'  -> pushMode(TAG);

// Matches plain HTML text content.
// Stops when encountering '<' or '{' (start of tag or Jinja).
HTML_TEXT : (~[<{\r\n])+ ;

// Matches whitespace and line breaks in HTML.
// These are ignored.
WS : [ \t\r\n]+ -> skip;

//////////////////////////////////////////////////////
// TAG MODE
// This mode handles everything inside < ... >
// such as tag names and attributes.
//////////////////////////////////////////////////////
mode TAG;

// Matches self-closing tags like <img />
// Returns to the previous mode (DEFAULT).
TAG_SLASH_CLOSE : '/>' -> popMode;

// Matches the end of an HTML tag: >
// Returns to the previous mode.
TAG_CLOSE       : '>'  -> popMode;

// Matches the equals sign used in attributes.
EQUALS : '=';

// Matches common predefined HTML tag names.
// This helps semantic processing later.
NORMALTAGENAME
    : 'html' | 'head' | 'title' | 'body'
    | 'nav'  | 'div'  | 'a'
    | 'h1'   | 'h3'   | 'p'
    | 'form' | 'label' | 'textarea' | 'button'
    ;

// Matches void (self-closing) HTML tags.
VOIDTAGENAME
    : 'meta'
    | 'link'
    | 'img'
    | 'input'
    ;

// Matches any generic HTML tag name.
// Allows custom or unknown tags.
TAG_NAME : [a-zA-Z][a-zA-Z0-9_-]*;

// Matches the start of an attribute value: "
// Switches to ATTR mode to read the attribute content.
TAG_QUOTE_OPEN : '"' -> pushMode(ATTR);

// Matches whitespace inside HTML tags.
// These are ignored.
TAG_WS : [ \t\r\n]+ -> skip;

//////////////////////////////////////////////////////
// ATTR MODE
// This mode handles attribute values inside " ... "
//////////////////////////////////////////////////////
mode ATTR;

// Matches the start of a Jinja expression inside an attribute.
// Example: class="{{ user.role }}"
// Reuses J_EXPR_OPEN token and switches to JINJA mode.
ATTR_JINJA_OPEN : '{{' -> type(J_EXPR_OPEN), pushMode(JINJA);

// Matches plain text inside attribute values.
// Stops before " or {.
ATTR_TEXT : ~["{]+;

// Matches the closing quote of an attribute value.
// Returns to TAG mode.
ATTR_QUOTE_CLOSE : '"' -> popMode;

//////////////////////////////////////////////////////
// JINJA MODE
// This mode tokenizes Python-like syntax inside Jinja blocks.
// Used for both {{ expressions }} and {% statements %}.
//////////////////////////////////////////////////////
mode JINJA;

// Matches the end of a Jinja expression: }}
// Returns to the previous mode.
J_EXPR_CLOSE : '}}' -> popMode;

// Matches the end of a Jinja statement: %}
// Returns to the previous mode.
J_STMT_CLOSE : '%}' -> popMode;

// Parentheses for function calls and expressions.
LPAREN : '(';
RPAREN : ')';

// Comma used in argument lists.
COMMA  : ',';

// Dot operator for attribute access (e.g., user.name).
DOT    : '.';

// String literals (double-quoted or single-quoted).
STRING
    : '"' (~["\\] | '\\' .)* '"'
    | '\'' (~['\\] | '\\' .)* '\''
    ;

// Numeric literals (integers and decimals).
NUMBER : [0-9]+ ('.' [0-9]+)?;

// Jinja control keywords.
FOR     : 'for';
IN      : 'in';
IF      : 'if';
ELSE    : 'else';
ENDIF   : 'endif';
ENDFOR  : 'endfor';

// Logical operators.
OR  : 'or';
AND : 'and';
NOT : 'not';

// Comparison operators.
ASSIGN : '=' ;
EQ     : '==';
NEQ    : '!=';
LE     : '<=';
GE     : '>=';
LT     : '<';
GT     : '>';

// Arithmetic operators.
PLUS  : '+';
MINUS : '-';
MUL   : '*';
DIV   : '/';
MOD   : '%';

// Identifiers: variable and function names.
ID : [a-zA-Z_][a-zA-Z0-9_]*;

// Single-line comments inside Jinja blocks.
// These are ignored.
SINGLE_LINE_COMMENT : '//' ~[\r\n]* -> skip;

// Multi-line comments inside Jinja blocks.
// These are ignored.
MULTI_LINE_COMMENT  : '/*' .*? '*/' -> skip;

// Whitespace inside Jinja blocks.
// These are ignored.
J_WS : [ \t\r\n]+ -> skip;
