package astCss;


public class ValueListNode extends ValueNode {
    public ValueListNode(int lineNumber) {
        super("ValueList", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("ValueList (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

