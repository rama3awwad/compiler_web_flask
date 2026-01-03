package visitor.html;

import astHtml.*;
import symbolTable.SymbolTable;

public class JinjaSymbolTableVisitor {

    private SymbolTable symbolTable = new SymbolTable();

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void visit(AstNode node) {
        if (node == null) return;

        String nodeName = node.getClass().getSimpleName();

        // -------------------- HTML TAG --------------------
        if (node instanceof HtmlElementNode || node instanceof VoidHtmlElementNode) {
            String tagName;
            if (node instanceof HtmlElementNode) tagName = ((HtmlElementNode) node).getTagName();
            else tagName = ((VoidHtmlElementNode) node).getTagName();

            symbolTable.insert(tagName, node.getLineNumber(), "HTML_TAG");
        }

        // -------------------- JINJA VARIABLE --------------------
        else if (node instanceof IdentifierNode) {
            IdentifierNode idNode = (IdentifierNode) node;
            symbolTable.insert(idNode.toString().split(" ")[1].replace("(", ""), node.getLineNumber(), "JINJA_VARIABLE");
        }
        else if (node instanceof JinjaForNode) {
            JinjaForNode forNode = (JinjaForNode) node;
            String loopVar = forNode.toString().split(" ")[1]; // "item"
            symbolTable.insert(loopVar, node.getLineNumber(), "JINJA_VARIABLE");
        }

        // -------------------- JINJA STATEMENT --------------------
        else if (node instanceof JinjaForNode || node instanceof JinjaIfNode || node instanceof JinjaExpressionNode) {
            symbolTable.insert(node.getNodeName(), node.getLineNumber(), "JINJA_STATEMENT");
        }

        // -------------------- زيارة الأبناء --------------------
        for (AstNode child : node.getChildren()) {
            visit(child);
        }
    }
}
