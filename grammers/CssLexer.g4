lexer grammar CssLexer;
@header { package antlr; }

MARGIN          : 'margin';
MARGIN_TOP      : 'margin-top';
MARGIN_BOTTOM   : 'margin-bottom';
PADDING         : 'padding';
WIDTH           : 'width';
HEIGHT          : 'height';
MAX_WIDTH       : 'max-width';
GAP             : 'gap';
FONT_SIZE       : 'font-size';
LINE_HEIGHT     : 'line-height';
BOX_SIZING      : 'box-sizing';
FLEX            : 'flex';
COLOR           : 'color';
BACKGROUND      : 'background';
BACKGROUND_COLOR: 'background-color';
DISPLAY         : 'display';
JUSTIFY_CONTENT : 'justify-content';
ALIGN_ITEMS     : 'align-items';
FLEX_WRAP       : 'flex-wrap';
TEXT_ALIGN      : 'text-align';
OBJECT_FIT      : 'object-fit';
FONT_FAMILY     : 'font-family';
FONT_WEIGHT     : 'font-weight';
TEXT_DECORATION : 'text-decoration';
BORDER          : 'border';
BORDER_RADIUS   : 'border-radius';
BOX_SHADOW      : 'box-shadow';
TRANSITION      : 'transition';
TRANSFORM       : 'transform';
GRID_TEMPLATE_COLUMNS : 'grid-template-columns';
CURSOR          : 'cursor';
LIST_STYLE      : 'list-style';
KEYWORD
    : 'block'
  //  | 'flex'
    | 'none'
    | 'center'
    | 'row'
    | 'column'
    | 'wrap'
    | 'cover'
    | 'auto'
    | 'bold'
    |'space-between'
    |'grid'
    ;
LBRACE  : '{' ;
RBRACE  : '}' ;
COLON   : ':' ;
SEMI    : ';' ;
COMMA   : ',' ;
DOT     : '.' ;
STAR    : '*' ;
LPAREN  : '(' ;
RPAREN  : ')' ;
GT : '>' ;
fragment HEX_DIGIT : [0-9a-fA-F];
HEX_COLOR
    : '#' HEX_DIGIT HEX_DIGIT HEX_DIGIT
      (HEX_DIGIT HEX_DIGIT HEX_DIGIT)?
    ;
COLOR_NAME
    : 'white' | 'black' | 'red' | 'green' | 'blue'
    | 'gray' | 'grey' | 'yellow' | 'orange'
    ;
NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;
ANGLE
    : [0-9]+ 'deg'
    ;
UNIT
    : 'px' | 'em' | 'rem' | 'vh' | 'vw' | '%' | 'fr'
    ;
STRING
    : '"' (~["\\] | '\\' .)* '"'
    | '\'' (~['\\] | '\\' .)* '\''
    ;
IDENT
    : [a-zA-Z_-] [a-zA-Z0-9_-]*
    ;
COMMENT
    : '/*' .*? '*/' -> skip
    ;
WS
    : [ \t\r\n]+ -> skip
    ;
