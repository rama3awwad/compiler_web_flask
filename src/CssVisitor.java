
package visitor;

import antlr.CssParser;
import antlr.CssParserBaseVisitor;
import astCss.*;
import org.antlr.v4.runtime.tree.TerminalNode;

public class CssVisitor extends CssParserBaseVisitor<AstNode> {

    @Override
    public AstNode visitStylesheetStatment(CssParser.StylesheetStatmentContext ctx) {
        StylesheetNode sheet = new StylesheetNode(ctx.getStart().getLine());
        for (CssParser.RuleContext rule : ctx.rule_()) {
            sheet.addChild(visit(rule));
        }
        return sheet;
    }

    @Override
    public AstNode visitRuleStatment(CssParser.RuleStatmentContext ctx) {
        RuleNode rule = new RuleNode(ctx.getStart().getLine());
        rule.addChild(visit(ctx.selector()));
        for (CssParser.DeclarationContext d : ctx.declaration()) {
            rule.addChild(visit(d));
        }
        return rule;
    }

    @Override
    public AstNode visitSelectorList(CssParser.SelectorListContext ctx) {
        SelectorListNode list = new SelectorListNode(ctx.getStart().getLine());
        for (CssParser.ComplexSelectorContext s : ctx.complexSelector()) {
            list.addChild(visit(s));
        }
        return list;
    }

    @Override
    public AstNode visitComplexSelectors(CssParser.ComplexSelectorsContext ctx) {
        ComplexSelectorNode complex = new ComplexSelectorNode(ctx.getStart().getLine());
        for (int i = 0; i < ctx.getChildCount(); i++) {
            AstNode child = visit(ctx.getChild(i));
            if (child != null) complex.addChild(child);
        }
        return complex;
    }

    @Override
    public AstNode visitChildCombinator(CssParser.ChildCombinatorContext ctx) {
        return new CombinatorNode(">", ctx.getStart().getLine());
    }

    @Override
    public AstNode visitDescendantCombinator(CssParser.DescendantCombinatorContext ctx) {
        return new CombinatorNode(" ", ctx.getStart().getLine());
    }

    @Override
    public AstNode visitCompoundSelectors(CssParser.CompoundSelectorsContext ctx) {
        CompoundSelectorNode compound = new CompoundSelectorNode(ctx.getStart().getLine());
        for (CssParser.SimpleSelectorContext s : ctx.simpleSelector()) {
            compound.addChild(visit(s));
        }
        return compound;
    }

    @Override
    public AstNode visitUniversalSelector(CssParser.UniversalSelectorContext ctx) {
        return new UniversalSelectorNode(ctx.getStart().getLine());
    }

    @Override
    public AstNode visitTypeSelectorSimple(CssParser.TypeSelectorSimpleContext ctx) {
        return visit(ctx.typeSelector());
    }

    @Override
    public AstNode visitTypeSelectors(CssParser.TypeSelectorsContext ctx) {
        return new TypeSelectorNode(ctx.IDENT().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitClassSelectorSimple(CssParser.ClassSelectorSimpleContext ctx) {
        return visit(ctx.classSelector());
    }

    @Override
    public AstNode visitClassSelectors(CssParser.ClassSelectorsContext ctx) {
        return new ClassSelectorNode(ctx.IDENT().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitPseudoSelectorSimple(CssParser.PseudoSelectorSimpleContext ctx) {
        return visit(ctx.pseudoSelector());
    }

    @Override
    public AstNode visitPseudoClass(CssParser.PseudoClassContext ctx) {
        return new PseudoSelectorNode(ctx.IDENT().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitDeclaration(CssParser.DeclarationContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public AstNode visitFontFamilyDeclaration(CssParser.FontFamilyDeclarationContext ctx) {
        String property = ctx.fontFamilyDecl().getText();
        FontDeclarationNode node = new FontDeclarationNode(property, ctx.getStart().getLine());

        AstNode familyValue = visit(ctx.fontFamilyDecl());
        if (familyValue != null) {
            node.addChild(familyValue);
        }
        return node;
    }

    @Override
    public AstNode visitFontFamilyFull(CssParser.FontFamilyFullContext ctx) {
        ValueListNode list = new ValueListNode(ctx.getStart().getLine());
        AstNode value = visit(ctx.fontFamilyValue());
        if (value != null) list.addChild(value);
        return list;
    }

    @Override
    public AstNode visitFontFamilyList(CssParser.FontFamilyListContext ctx) {
        ValueListNode list = new ValueListNode(ctx.getStart().getLine());
        for (CssParser.FontFamilyItemContext item : ctx.fontFamilyItem()) {
            AstNode child = visit(item);
            if (child != null) list.addChild(child);
        }
        return list;
    }

@Override
public AstNode visitFontFamilyString(CssParser.FontFamilyStringContext ctx) {
    return new StringValueNode(ctx.STRING().getText(), ctx.getStart().getLine());
}

    @Override
    public AstNode visitFontFamilyIdent(CssParser.FontFamilyIdentContext ctx) {
        return new IdentValueNode(ctx.IDENT().getText(), ctx.getStart().getLine());
    }
    @Override
    public AstNode visitFontKeywordDeclaration(CssParser.FontKeywordDeclarationContext ctx) {
        String property = ctx.getChild(0).getText();
        FontDeclarationNode node = new FontDeclarationNode(property, ctx.getStart().getLine());
        if (ctx.KEYWORD() != null) {
            node.addChild(new KeywordValueNode(ctx.KEYWORD().getText(), ctx.getStart().getLine()));
        }
        return node;
    }

    @Override
    public AstNode visitFlexDeclaration(CssParser.FlexDeclarationContext ctx) {
        String property = ctx.FLEX().getText();
        FlexDeclarationNode node = new FlexDeclarationNode(property, ctx.getStart().getLine());
        AstNode value = visit(ctx.flexValue());
        if (value != null) node.addChild(value);
        return node;
    }

    @Override
    public AstNode visitColorDeclaration(CssParser.ColorDeclarationContext ctx) {
        String property = ctx.COLOR().getText();
        ColorDeclarationNode node = new ColorDeclarationNode(property, ctx.getStart().getLine());
        if (ctx.colorValue() != null) {
            node.addChild(visit(ctx.colorValue()));
        }
        return node;
    }

    @Override
    public AstNode visitBackgroundColorDeclaration(CssParser.BackgroundColorDeclarationContext ctx) {
        String property = ctx.BACKGROUND_COLOR().getText();
        BackgroundColorDeclarationNode node = new BackgroundColorDeclarationNode(property, ctx.getStart().getLine());
        if (ctx.colorValue() != null) {
            node.addChild(visit(ctx.colorValue()));
        }
        return node;
    }

@Override
public AstNode visitLengthDeclaration(CssParser.LengthDeclarationContext ctx) {
    String property = ctx.getChild(0).getText();
    LengthDeclarationNode node = new LengthDeclarationNode(property, ctx.getStart().getLine());

    if (ctx.lengthList() != null) {
        AstNode lengthList = visit(ctx.lengthList());
        if (lengthList != null) node.addChild(lengthList);
    }
    return node;
}

    @Override
    public AstNode visitSpacingDeclaration(CssParser.SpacingDeclarationContext ctx) {
        String property = ctx.getChild(0).getText();
        SpacingDeclarationNode node = new SpacingDeclarationNode(property, ctx.getStart().getLine());
        ValueListNode values = new ValueListNode(ctx.getStart().getLine());
        for (CssParser.SpacingValueContext v : ctx.spacingValue()) {
            AstNode child = visit(v);
            if (child != null) values.addChild(child);
        }
        node.addChild(values);
        return node;
    }

    @Override
    public AstNode visitLayoutDeclaration(CssParser.LayoutDeclarationContext ctx) {
        String property = ctx.getChild(0).getText();
        LayoutDeclarationNode node = new LayoutDeclarationNode(property, ctx.getStart().getLine());
        ValueListNode values = new ValueListNode(ctx.getStart().getLine());
        AstNode value = visit(ctx.layoutValue());
        if (value != null) values.addChild(value);
        node.addChild(values);
        return node;
    }


    @Override
    public AstNode visitBackgroundDeclaration(CssParser.BackgroundDeclarationContext ctx) {
        String property = ctx.BACKGROUND().getText();
        BackgroundDeclarationNode node = new BackgroundDeclarationNode(property, ctx.getStart().getLine());
        ValueListNode values = new ValueListNode(ctx.getStart().getLine());
        if (ctx.colorValue() != null) values.addChild(visit(ctx.colorValue()));
        node.addChild(values);
        return node;
    }
    @Override
    public AstNode visitEffectDeclaration(CssParser.EffectDeclarationContext ctx) {
        String property = ctx.getChild(0).getText();
        EffectDeclarationNode node =
                new EffectDeclarationNode(property, ctx.getStart().getLine());

        AstNode valueNode = visit(ctx.value());
        if (valueNode != null) {
            node.addChild(valueNode);
        }

        return node;
    }


    @Override
    public AstNode visitBorderDeclaration(CssParser.BorderDeclarationContext ctx) {
        String property = ctx.BORDER().getText();
        BorderDeclarationNode node = new BorderDeclarationNode(property, ctx.getStart().getLine());

        if (ctx.value() != null) {
            AstNode value = visit(ctx.value());
            if (value != null) {
                node.addChild(value);
            }
        }
        return node;
    }

    @Override
    public AstNode visitGridDeclaration(CssParser.GridDeclarationContext ctx) {
        String property = ctx.GRID_TEMPLATE_COLUMNS().getText();
        GridDeclarationNode node = new GridDeclarationNode(property, ctx.getStart().getLine());
        ValueListNode values = new ValueListNode(ctx.getStart().getLine());
        if (ctx.value() != null) values.addChild(visit(ctx.value()));
        node.addChild(values);
        return node;
    }

@Override
public AstNode visitBoxSizingDeclaration(CssParser.BoxSizingDeclarationContext ctx) {
    String property = ctx.BOX_SIZING().getText();
    BoxSizingDeclarationNode node = new BoxSizingDeclarationNode(property, ctx.getStart().getLine());

    if (ctx.IDENT() != null) {
        node.addChild(new IdentValueNode(ctx.IDENT().getText(), ctx.getStart().getLine()));
    }
    return node;
}

@Override
public AstNode visitCursorDeclaration(CssParser.CursorDeclarationContext ctx) {
    String property = ctx.CURSOR().getText();
    CursorDeclarationNode node = new CursorDeclarationNode(property, ctx.getStart().getLine());

    if (ctx.IDENT() != null) {
        node.addChild(new IdentValueNode(ctx.IDENT().getText(), ctx.getStart().getLine()));
    }
    return node;
}

    @Override
    public AstNode visitValueTransform(CssParser.ValueTransformContext ctx) {
        return new KeywordValueNode("transform", ctx.getStart().getLine());
    }
    @Override
    public AstNode visitValueBackground(CssParser.ValueBackgroundContext ctx) {
        return new KeywordValueNode("background", ctx.getStart().getLine());
    }

    @Override
    public AstNode visitValueList(CssParser.ValueListContext ctx) {
        ValueListNode list = new ValueListNode(ctx.getStart().getLine());
        for (CssParser.ValuePartContext part : ctx.valuePart()) {
            AstNode child = visit(part);
            if (child != null) {
                list.addChild(child);
            }
        }
        return list;
    }

    @Override
    public AstNode visitValueNumber(CssParser.ValueNumberContext ctx) {
        return new NumberValueNode(ctx.getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitValueString(CssParser.ValueStringContext ctx) {
        return new StringValueNode(ctx.STRING().getText(), ctx.getStart().getLine());
    }



    @Override
    public AstNode visitValueKeyword(CssParser.ValueKeywordContext ctx) {
        return new KeywordValueNode(ctx.getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitValueAngle(CssParser.ValueAngleContext ctx) {
        return new AngleValueNode(ctx.getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitValueIdent(CssParser.ValueIdentContext ctx) {
        return new IdentValueNode(ctx.IDENT().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitFunctionCallment(CssParser.FunctionCallmentContext ctx) {
        FunctionCallValueNode node = new FunctionCallValueNode(ctx.IDENT().getText(), ctx.getStart().getLine());
        if (ctx.functionArgs() != null) {
            node.addChild(visit(ctx.functionArgs()));
        }
        return node;
    }

    @Override
    public AstNode visitFunctionArguments(CssParser.FunctionArgumentsContext ctx) {
        ValueListNode list = new ValueListNode(ctx.getStart().getLine());
        for (CssParser.ValuePartContext v : ctx.valuePart()) {
            AstNode child = visit(v);
            if (child != null) list.addChild(child);
        }
        return list;
    }

    @Override
    public AstNode visitHexColorValue(CssParser.HexColorValueContext ctx) {
        return new ColorValueNode("HexColor", ctx.HEX_COLOR().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitNamedColorValue(CssParser.NamedColorValueContext ctx) {
        return new ColorValueNode("NamedColor", ctx.COLOR_NAME().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitFunctionColorValue(CssParser.FunctionColorValueContext ctx) {
        return visit(ctx.functionCall());
    }

    @Override
    public AstNode visitLengthListValue(CssParser.LengthListValueContext ctx) {
        if (ctx.lengthValue().size() == 1) {
            return visit(ctx.lengthValue(0));
        }

        ValueListNode list = new ValueListNode(ctx.getStart().getLine());
        for (CssParser.LengthValueContext v : ctx.lengthValue()) {
            AstNode child = visit(v);
            if (child != null) list.addChild(child);
        }
        return list;
    }

@Override
public AstNode visitLengthValueItem(CssParser.LengthValueItemContext ctx) {
    int line = ctx.getStart().getLine();
    ValueListNode list = new ValueListNode(line);

    if (ctx.NUMBER() != null) {
        list.addChild(new NumberValueNode(ctx.NUMBER().getText(), line));
    }
    if (ctx.UNIT() != null) {
        list.addChild(new UnitValueNode(ctx.UNIT().getText(), line));
    }
    if (ctx.KEYWORD() != null) {
        list.addChild(new KeywordValueNode(ctx.KEYWORD().getText(), line));
    }

    return list.getChildren().isEmpty() ? null : list;
}

@Override
public AstNode visitSpacingValueItem(CssParser.SpacingValueItemContext ctx) {
    int line = ctx.getStart().getLine();
    ValueListNode list = new ValueListNode(line);

    if (ctx.NUMBER() != null) {
        list.addChild(new NumberValueNode(ctx.NUMBER().getText(), line));
    }

    if (ctx.UNIT() != null) {
        list.addChild(new UnitValueNode(ctx.UNIT().getText(), line));
    }

    if (ctx.KEYWORD() != null) {
        list.addChild(new KeywordValueNode(ctx.KEYWORD().getText(), line));
    }

    if (list.getChildren().isEmpty()) {
        return null;
    }

    return list;
}

    @Override
    public AstNode visitLayoutKeyword(CssParser.LayoutKeywordContext ctx) {
        return new KeywordValueNode(ctx.KEYWORD().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitLayoutFlexValue(CssParser.LayoutFlexValueContext ctx) {
        return new KeywordValueNode(ctx.FLEX().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitFlexKeywordValue(CssParser.FlexKeywordValueContext ctx) {
        return new KeywordValueNode(ctx.KEYWORD().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitFlexNumberValues(CssParser.FlexNumberValuesContext ctx) {
        ValueListNode list = new ValueListNode(ctx.getStart().getLine());
        for (TerminalNode num : ctx.NUMBER()) {
            list.addChild(new NumberValueNode(num.getText(), ctx.getStart().getLine()));
        }
        return list;
    }

}
