package astCss;


public class CompoundSelectorNode extends SelectorNode {
    public CompoundSelectorNode(int lineNumber) {
        super("CompoundSelector", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

