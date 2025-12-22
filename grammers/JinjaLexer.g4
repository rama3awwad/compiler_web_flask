// HtmlJinjaLexer.g4
lexer grammar JinjaLexer;

@header { package antlr; }

// DEFAULT Mode
J_EXPR_OPEN  : '{{' -> pushMode(JINJA);
J_STMT_OPEN  : '{%' -> pushMode(JINJA);
COMMENT : '<!--' .*? '-->' -> skip;
DOCTYPE : '<!doctype html>' ;
TAG_SLASH_OPEN : '</' -> pushMode(TAG);
TAG_OPEN       : '<'  -> pushMode(TAG);
HTML_TEXT : (~[<{\r\n])+ ;
WS : [ \t\r\n]+ -> skip;

//  TAG Mode
mode TAG;

TAG_SLASH_CLOSE : '/>' -> popMode;
TAG_CLOSE       : '>'  -> popMode;
EQUALS : '=';
NORMALTAGENAME
:'html'|'head'|'title'|'body'|'nav'|'div'|'a'|'h1'|'h3'|'p'|'form'|'label'|'textarea'|'button';
VOIDTAGENAME
    : 'meta'
    | 'link'
    | 'img'
    | 'input'
    //|'nav'
    ;
TAG_NAME : [a-zA-Z][a-zA-Z0-9_-]*;
TAG_QUOTE_OPEN : '"' -> pushMode(ATTR);
TAG_WS : [ \t\r\n]+ -> skip;

//  ATTR VALUE
mode ATTR;

ATTR_JINJA_OPEN : '{{' -> type(J_EXPR_OPEN), pushMode(JINJA);
ATTR_TEXT : ~["{]+;
ATTR_QUOTE_CLOSE : '"' -> popMode;

//  JINJA Mode
mode JINJA;

J_EXPR_CLOSE : '}}' -> popMode;
J_STMT_CLOSE : '%}' -> popMode;
LPAREN : '(';
RPAREN : ')';
COMMA  : ',';
DOT    : '.';
STRING
    : '"' (~["\\] | '\\' .)* '"'
    | '\'' (~['\\] | '\\' .)* '\''
    ;
NUMBER : [0-9]+ ('.' [0-9]+)?;
FOR : 'for';
IN  : 'in';
IF  : 'if';
ELSE : 'else';
ENDIF : 'endif';
ENDFOR : 'endfor';
OR : 'or';
AND : 'and';
NOT : 'not';
ASSIGN : '=' ;
EQ : '==';
NEQ : '!=';
LE : '<=';
GE : '>=';
LT : '<';
GT : '>';
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
MOD : '%';

ID : [a-zA-Z_][a-zA-Z0-9_]*;
SINGLE_LINE_COMMENT: '//' ~[\r\n]* -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;
J_WS : [ \t\r\n]+ -> skip;


