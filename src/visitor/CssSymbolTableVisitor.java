package visitor;

import astCss.*;
import symbolTable.SymbolTable;

public class CssSymbolTableVisitor {

    private SymbolTable symbolTable = new SymbolTable();

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void visit(AstNode node) {
        if (node == null) return;

        String nodeName = node.getClass().getSimpleName();

        // class selector مثل .navbar
        if (nodeName.equals("ClassSelectorNode")) {
            ClassSelectorNode classNode = (ClassSelectorNode) node;
            symbolTable.insert(classNode.getClassName(), node.getLineNumber(), "css_class");
        }

        // type selector مثل div, body
        else if (nodeName.equals("TypeSelectorNode")) {
            TypeSelectorNode typeNode = (TypeSelectorNode) node;
            symbolTable.insert(typeNode.getTagName(), node.getLineNumber(), "css_selector");
        }

        // pseudo selector مثل :hover
        else if (nodeName.equals("PseudoSelectorNode")) {
            PseudoSelectorNode pseudoNode = (PseudoSelectorNode) node;
            symbolTable.insert(pseudoNode.getPseudoName(), node.getLineNumber(), "css_selector");
        }

        // id selector مثل #header
        else if (nodeName.equals("IdSelectorNode")) {
            IdSelectorNode idNode = (IdSelectorNode) node;
            symbolTable.insert(idNode.getIdName(), node.getLineNumber(), "css_id");
        }

        // declaration properties مثل color, background
        else if (node instanceof DeclarationNode) {
            DeclarationNode decl = (DeclarationNode) node;
            symbolTable.insert(decl.getPropertyName(), node.getLineNumber(), "css_property");
        }

        // زيارة الأبناء
        for (AstNode child : node.getChildren()) {
            visit(child);
        }
    }
}
