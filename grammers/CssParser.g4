
parser grammar CssParser;

options { tokenVocab=CssLexer; }
@header { package antlr; }

// Root
stylesheet
    : rule* EOF                           #StylesheetStatment
    ;

rule
    : selector LBRACE declaration* RBRACE  #RuleStatment
    ;

//Selectors

selector
    : complexSelector (COMMA complexSelector)*   #SelectorList
    ;
complexSelector
    : compoundSelector (combinator compoundSelector)*   #ComplexSelectors
    ;
combinator
    : GT        #ChildCombinator
    |            #DescendantCombinator
    ;
compoundSelector
    : simpleSelector+   #CompoundSelectors
    ;
simpleSelector
    : STAR              #UniversalSelector
    | typeSelector      #TypeSelectorSimple
    | classSelector     #ClassSelectorSimple
    | pseudoSelector    #PseudoSelectorSimple
    ;

typeSelector
    : IDENT             #TypeSelectors
    ;

classSelector
    : DOT IDENT         #ClassSelectors
    ;

pseudoSelector
    : COLON IDENT       #PseudoClass
    ;


// Declarations
declaration
    : flexDecl
    | colorDecl
    | backgroundColorDecl
    | lengthDecl
    | spacingDecl
    | layoutDecl
    | fontDecl
    | borderDecl
    | effectDecl
    | gridDecl
    | backgroundDecl
    | boxSizingDecl
    | cursorDecl
    // | genericDecl
    ;

// Flex
flexDecl
    : FLEX COLON flexValue SEMI              #FlexDeclaration
    ;
flexValue
    : NUMBER+                                #FlexNumberValues
    | KEYWORD                                #FlexKeywordValue
    ;

// Color
colorDecl
    : COLOR COLON colorValue SEMI             #ColorDeclaration
    ;

backgroundColorDecl
    : BACKGROUND_COLOR COLON colorValue SEMI #BackgroundColorDeclaration
    ;

colorValue
    : HEX_COLOR                               #HexColorValue
    | COLOR_NAME                              #NamedColorValue
    | functionCall                            #FunctionColorValue
    ;

// Lengths
lengthDecl
    : (WIDTH | HEIGHT | MAX_WIDTH | GAP | FONT_SIZE | LINE_HEIGHT | BORDER_RADIUS)
      COLON lengthList SEMI                  #LengthDeclaration
    ;

lengthList
    : lengthValue+                            #LengthListValue
    ;

lengthValue
    : NUMBER (UNIT)? ?(KEYWORD)?             #LengthValueItem
    ;

spacingDecl
    : (MARGIN | MARGIN_TOP | MARGIN_BOTTOM | PADDING)
      COLON spacingValue+ SEMI               #SpacingDeclaration
    ;

spacingValue
    : NUMBER (UNIT)? (KEYWORD)?             #SpacingValueItem
    ;

//Layout
layoutDecl
    : (DISPLAY | JUSTIFY_CONTENT | ALIGN_ITEMS | FLEX_WRAP | TEXT_ALIGN | OBJECT_FIT)
      COLON layoutValue SEMI                 #LayoutDeclaration
    ;

layoutValue
    : KEYWORD                                #LayoutKeyword
    | FLEX                                    #LayoutFlexValue
    ;

//Fonts
fontDecl
    : fontFamilyDecl                          #FontFamilyDeclaration
    | font                                     #FontOtherDeclaration
    ;

fontFamilyDecl
    : FONT_FAMILY COLON fontFamilyValue SEMI  #FontFamilyFull
    ;

fontFamilyValue
    : fontFamilyItem (COMMA fontFamilyItem)*  #FontFamilyList
    ;

fontFamilyItem
    : STRING                                  #FontFamilyString
    | IDENT                                   #FontFamilyIdent
    ;

font
    : (FONT_WEIGHT| TEXT_DECORATION)
      COLON KEYWORD SEMI                      #FontKeywordDeclaration
    ;

// Background
backgroundDecl
    : BACKGROUND COLON colorValue SEMI       #BackgroundDeclaration
    ;

// Border & Effects
borderDecl
    : BORDER COLON value SEMI                #BorderDeclaration
    ;

effectDecl
    : (BOX_SHADOW | TRANSITION | TRANSFORM)
      COLON value SEMI                        #EffectDeclaration
    ;

// Grid
gridDecl
    : GRID_TEMPLATE_COLUMNS COLON value SEMI #GridDeclaration
    ;

// Misc
boxSizingDecl
    : BOX_SIZING COLON IDENT SEMI            #BoxSizingDeclaration
    ;

cursorDecl
    : CURSOR COLON IDENT SEMI                #CursorDeclaration
    ;



// Values
value
    : valuePart+                              #ValueList
    ;

valuePart
    : functionCall                             #ValueFunction
    | HEX_COLOR                                #ValueHexColor
    | COLOR_NAME                               #ValueNamedColor
    | ANGLE                                    #ValueAngle
    | NUMBER UNIT?                             #ValueNumber
    | STRING                                   #ValueString
    | KEYWORD                                  #ValueKeyword
    | BACKGROUND                               #ValueBackground
    | TRANSFORM                                #ValueTransform
    // | FLEX
    | IDENT                                    #ValueIdent
    | COMMA                                    #ValueComma
    ;

// Functions
functionCall
    : IDENT LPAREN functionArgs? RPAREN       #FunctionCallment
    ;

functionArgs
    : valuePart (COMMA valuePart)*            #FunctionArguments
    ;















//selector
//    : simpleSelector (COMMA simpleSelector)*  #SelectorList
//    ;
//
//simpleSelector
//    : STAR                                     #UniversalSelector
//    | (DOT)? IDENT (IDENT)* pseudo?           #TypeOrClassSelector
//    ;
//
//pseudo
//    : COLON IDENT                              #PseudoClass
//    ;
