// HtmlJinjaParser.g4
parser grammar JinjaParser;

options { tokenVocab=JinjaLexer; }
@header { package antlr; }

//////////////////////////////////////////////////////
// ROOT RULE
// Every parser must start with one main rule.
// This rule represents the entire input file.
//////////////////////////////////////////////////////

// A file consists of zero or more elements,
// followed by the end of file (EOF).


file
    : element* EOF                      #FileRoot
    ;

//////////////////////////////////////////////////////
// ELEMENT RULE
// An element is the basic building block of the file.
// Everything in the file must be one of these.
//////////////////////////////////////////////////////

// An element can be:
// - HTML doctype
// - normal HTML tag
// - self-closing HTML tag
// - Jinja expression {{ ... }}
// - Jinja if block
// - Jinja for block
// - plain HTML text

element
    : DOCTYPE                           #DoctypeElement
    | htmlElement                       #HtmlElementStatment
    | voidHtmlElement                   #VoidHtmlElementStatment
    | jinjaExpression                   #JinjaExpressionElement
    | jinjaIfBlock                      #JinjaIfElement
    | jinjaForBlock                     #JinjaForElement
    | HTML_TEXT                         #TextElement
    ;

//////////////////////////////////////////////////////
// HTML ELEMENTS
// These rules describe how HTML tags are structured.
//////////////////////////////////////////////////////

// A normal HTML tag with opening and closing tags.
// Example:
// <div class="x"> ... </div>
htmlElement
    : TAG_OPEN NORMALTAGENAME attribute* TAG_CLOSE
      element*
      TAG_SLASH_OPEN NORMALTAGENAME TAG_CLOSE
                                      #NormalHtmlTag
    ;


// HTML tags that do not wrap content (void elements).
// Examples:
// <img />
// <input>
voidHtmlElement
    : TAG_OPEN VOIDTAGENAME attribute* TAG_SLASH_CLOSE
                                      #VoidHtmlSelfClose
    | TAG_OPEN VOIDTAGENAME attribute* TAG_CLOSE
                                      #VoidHtmlOpenOnly
    ;

//////////////////////////////////////////////////////
// TAG PARTS
// These rules describe the internal structure of HTML tags.
//////////////////////////////////////////////////////

// Represents a tag name.
// Example: div, span, header
tagName
    : TAG_NAME                          #TagNameStatment
    ;


// Represents a single HTML attribute.
// Example: class="header"
attribute
    : TAG_NAME EQUALS attrValue         #AttributeStatment
    ;


// Represents the value of an attribute.
// The value can contain plain text or Jinja expressions.
attrValue
    : TAG_QUOTE_OPEN attrPart* ATTR_QUOTE_CLOSE
                                      #AttributeValue
    ;

// Parts inside an attribute value.
// This allows mixing text and Jinja.
attrPart
    : ATTR_TEXT                         #AttributeText
    | jinjaExpression                   #AttributeJinja
    ;



//////////////////////////////////////////////////////
// JINJA ELEMENTS
// These rules define template logic embedded in HTML.
//////////////////////////////////////////////////////

// A Jinja expression prints a value.
// Example: {{ user.name }}
jinjaExpression
    : J_EXPR_OPEN expression J_EXPR_CLOSE
                                      #JinjaExpressionStatment
    ;



// A Jinja if block with optional else.
// Example:
// {% if condition %}
//   ...
// {% else %}
//   ...
// {% endif %}
jinjaIfBlock
    : J_STMT_OPEN IF expression J_STMT_CLOSE
      element*
      (J_STMT_OPEN ELSE J_STMT_CLOSE element*)?
      J_STMT_OPEN ENDIF J_STMT_CLOSE
                                      #JinjaIfBlockStatment
    ;


// A Jinja for loop.
// Example:
// {% for item in items %}
//   ...
// {% endfor %}
jinjaForBlock
    : J_STMT_OPEN FOR ID IN expression J_STMT_CLOSE
      element*
      J_STMT_OPEN ENDFOR J_STMT_CLOSE
                                      #JinjaForBlockStatment
    ;

//////////////////////////////////////////////////////
// EXPRESSIONS
// These rules describe Python-like expressions
// used inside Jinja.
//////////////////////////////////////////////////////

// Entry point for any expression.
expression
    : orExpr                            #ExpressionStatment
    ;


// Logical OR expression.
orExpr
    : andExpr (OR andExpr)*             #OrExpression
    ;

// Logical AND expression.
andExpr
    : notExpr (AND notExpr)*            #AndExpression
    ;

// Logical NOT expression.
notExpr
    : NOT notExpr                       #NotExpression
    | compareExpr                       #CompareExpressionOnly
    ;

// Comparison expressions.
// Example: a == b, x >= y
compareExpr
    : addExpr ((EQ|NEQ|LE|GE|LT|GT) addExpr)*
                                      #CompareExpression
    ;

// Addition and subtraction.
// Example: a + b - c
addExpr
    : mulExpr ((PLUS|MINUS) mulExpr)*   #AddExpression
    ;

// Multiplication, division, modulo.
// Example: a * b / c
mulExpr
    : primary ((MUL|DIV|MOD) primary)*  #MulExpression
    ;


//////////////////////////////////////////////////////
// PRIMARY EXPRESSIONS
// These are the simplest units of expressions.
//////////////////////////////////////////////////////

// A primary expression can be:
// - variable name
// - number
// - string
// - property access
// - function call
// - parenthesized expression
primary
    : ID                                #IdPrimary
    | NUMBER                            #NumberPrimary
    | STRING                            #StringPrimary
    | primary DOT ID                    #PropertyAccess
    | ID LPAREN argList? RPAREN         #FunctionCall
    | LPAREN expression RPAREN          #ParenExpression
    ;



//////////////////////////////////////////////////////
// FUNCTION ARGUMENTS
// These rules define function call arguments.
//////////////////////////////////////////////////////

// A function argument can be positional or named.
// Examples:
// foo(1)
// foo(x=3)
argument
    : expression                        #PositionalArgument
    | ID ASSIGN expression              #NamedArgument
    ;


// A comma-separated list of arguments.
argList
    : argument (COMMA argument)*        #ArgumentList
    ;



