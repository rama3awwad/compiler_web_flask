// HtmlJinjaParser.g4
parser grammar JinjaParser;

options { tokenVocab=JinjaLexer; }
@header { package antlr; }

//  ROOT
file
    : element* EOF                      #FileRoot
    ;

//  ELEMENT
element
    : DOCTYPE                           #DoctypeElement
    | htmlElement                       #HtmlElementStatment
    | voidHtmlElement                   #VoidHtmlElementStatment
    | jinjaExpression                   #JinjaExpressionElement
    | jinjaIfBlock                      #JinjaIfElement
    | jinjaForBlock                     #JinjaForElement
    | HTML_TEXT                         #TextElement
    ;

//  HTML
htmlElement
    : TAG_OPEN NORMALTAGENAME attribute* TAG_CLOSE
      element*
      TAG_SLASH_OPEN NORMALTAGENAME TAG_CLOSE
                                      #NormalHtmlTag
    ;

voidHtmlElement
    : TAG_OPEN VOIDTAGENAME attribute* TAG_SLASH_CLOSE
                                      #VoidHtmlSelfClose
    | TAG_OPEN VOIDTAGENAME attribute* TAG_CLOSE
                                      #VoidHtmlOpenOnly
    ;

// TAG PARTS
tagName
    : TAG_NAME                          #TagNameStatment
    ;

attribute
    : TAG_NAME EQUALS attrValue         #AttributeStatment
    ;

attrValue
    : TAG_QUOTE_OPEN attrPart* ATTR_QUOTE_CLOSE
                                      #AttributeValue
    ;

attrPart
    : ATTR_TEXT                         #AttributeText
    | jinjaExpression                   #AttributeJinja
    ;

//  JINJA
jinjaExpression
    : J_EXPR_OPEN expression J_EXPR_CLOSE
                                      #JinjaExpressionStatment
    ;

jinjaIfBlock
    : J_STMT_OPEN IF expression J_STMT_CLOSE
      element*
      (J_STMT_OPEN ELSE J_STMT_CLOSE element*)?
      J_STMT_OPEN ENDIF J_STMT_CLOSE
                                      #JinjaIfBlockStatment
    ;

jinjaForBlock
    : J_STMT_OPEN FOR ID IN expression J_STMT_CLOSE
      element*
      J_STMT_OPEN ENDFOR J_STMT_CLOSE
                                      #JinjaForBlockStatment
    ;

// EXPRESSIONS
expression
    : orExpr                            #ExpressionStatment
    ;

orExpr
    : andExpr (OR andExpr)*             #OrExpression
    ;

andExpr
    : notExpr (AND notExpr)*            #AndExpression
    ;

notExpr
    : NOT notExpr                       #NotExpression
    | compareExpr                       #CompareExpressionOnly
    ;

compareExpr
    : addExpr ((EQ|NEQ|LE|GE|LT|GT) addExpr)*
                                      #CompareExpression
    ;

addExpr
    : mulExpr ((PLUS|MINUS) mulExpr)*   #AddExpression
    ;

mulExpr
    : primary ((MUL|DIV|MOD) primary)*  #MulExpression
    ;

// PRIMARY
primary
    : ID                                #IdPrimary
    | NUMBER                            #NumberPrimary
    | STRING                            #StringPrimary
    | primary DOT ID                    #PropertyAccess
    | ID LPAREN argList? RPAREN         #FunctionCall
    | LPAREN expression RPAREN          #ParenExpression
    ;

// FUNCTION ARGS
argument
    : expression                        #PositionalArgument
    | ID ASSIGN expression              #NamedArgument
    ;

argList
    : argument (COMMA argument)*        #ArgumentList
    ;



