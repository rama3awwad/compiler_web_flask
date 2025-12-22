package astCss;


public class SelectorListNode extends SelectorNode {
    public SelectorListNode(int lineNumber) {
        super("SelectorList", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

