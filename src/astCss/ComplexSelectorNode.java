package astCss;


public class ComplexSelectorNode extends SelectorNode {
    public ComplexSelectorNode(int lineNumber) {
        super("ComplexSelector", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

