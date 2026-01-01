parser grammar PythonParser;
options {
    tokenVocab = PythonLexer;
}
@header {
    package antlr;
}

/* =========================
   Program structure
========================= */
program
    : statement* EOF                    #ProgramBlock
    ;

/* =========================
   Statements
========================= */
statement
    : simpleStatement (NEWLINE | EOF)  #SimpleStmtBlock
    | compoundStatement                 #CompoundStmt
    | decoratorStatement                #DecoratorStmt
    | NEWLINE                           #EmptyLine
    ;

/* =========================
   Compound statements
========================= */
compoundStatement
    : decoratorStatement* functionDef   #DecoratedFuncDef
    | ifMainStatement                    #IfMainStmt
    ;

/* =========================
   Simple statements
========================= */
simpleStatement
    : simpleStmt (COMMA simpleStmt)*    #MultiSimpleStmt
    ;

simpleStmt
    : importStatement                    #ImportStmtStmt
    | returnStatement                    #ReturnStmtStmt
    | assignStatement                    #AssignStmtStmt
    | expression                         #ExprStmtStmt
    ;

/* =========================
   Function definition
========================= */
functionDef
    : DEF ID LPAREN paramList? RPAREN COLON suite
                                         #FuncDef
    ;

paramList
    : ID (COMMA ID)*                      #NormalParams
    | ID LT ID GT                         #RouteParam
    ;

/* =========================
   Block / Suite
========================= */
suite
    : simpleStatement NEWLINE             #SingleLineSuite
    | NEWLINE INDENT statement+ DEDENT   #IndentedSuite
     | NEWLINE simpleStatement NEWLINE    #SingleStmtSuite
    ;

/* =========================
   Return / Assignment
========================= */
returnStatement
    : RETURN expression                   #ReturnStmtExpr
    ;

assignStatement
    : ID ASSIGN expression                #AssignStmtExpr
    ;

/* =========================
   If **name** == "**main**"
========================= */
ifMainStatement
    : IF ID EQ STRING COLON suite        #IfMainBlock
    ;

/* =========================
   Decorators
========================= */
decoratorStatement
    : AT dottedName LPAREN STRING RPAREN NEWLINE?
                                         #RouteDecorator
    ;

/* =========================
   Imports
========================= */
importStatement
    : FROM dottedName IMPORT importList  #FromImportStmt
    ;

importList
    : ID (COMMA ID)*                      #ImportListExpr
    ;

dottedName
    : ID (DOT ID)*                        #DottedNameExpr
    ;

/* =========================
   Expressions
========================= */
expression
    : callExpression                      #FuncCallExprExpr
    | listExpression                      #ListExprExpr
    | dictExpression                      #DictExprExpr
    | genExpr                             #GenExprExpr
    | primary                             #PrimaryExprExpr
    ;

callExpression
    : dottedName LPAREN argList? RPAREN  #FuncCallExprCall
    ;

argList
    : argument (COMMA argument)*          #ArgListExpr
    ;

argument
    : expression                          #PositionalArgExpr
    | genExpr                              #GeneratorArgExpr
    | ID ASSIGN expression                #KeywordArgExpr
    ;

/* =========================
   Generator Expression
========================= */
genExpr
    : LPAREN ID FOR ID IN dottedName IF dictAccess EQ ID RPAREN
                                         #GeneratorExprExpr
    ;

/* =========================
   Dictionary Access
========================= */
dictAccess
    : ID LBRACK STRING RBRACK             #DictAccessExprPrimary
    ;

/* =========================
   Collections
========================= */
/*listExpression
    : LBRACK (elementList (COMMA? | NEWLINE+))? RBRACK #ListLiteralExpr
    ;*/

listExpression
    : LBRACK NEWLINE* elementList? NEWLINE* RBRACK
      #ListLiteralExpr
    ;

/*elementList
    : expression ( (COMMA | NEWLINE+) expression )*
    ;*/

elementList
        : expression ( (COMMA | NEWLINE)+ expression )*
        ;


/*dictExpression
    : LBRACE (keyValuePair (COMMA? | NEWLINE+))* RBRACE #DictLiteralExpr
    ;*/

    dictExpression
        : LBRACE NEWLINE* keyValuePairList? NEWLINE* RBRACE
          #DictLiteralExpr
        ;
keyValuePairList
    : keyValuePair ( (COMMA | NEWLINE)+ keyValuePair )*
    ;


keyValuePair
    : STRING COLON expression
    ;

/* =========================
   Primary expressions
========================= */
primary
    : ID                                  #IdentifierPrimary
    | NUMBER                              #NumberLiteralPrimary
    | STRING                              #StringLiteralPrimary
    | LPAREN expression RPAREN            #ParenExprPrimary
    | dictAccess                          #DictAccessPrimary
    ;
