package astHtml;


public class PropertyAccessNode extends ExpressionNode {

    public PropertyAccessNode(int lineNumber) {
        super("PropertyAccess", lineNumber);
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("PropertyAccessNode (line " + lineNumber + ")");
        for (AstNode child : children) {
            child.print(indent + 1);
        }
    }
}

