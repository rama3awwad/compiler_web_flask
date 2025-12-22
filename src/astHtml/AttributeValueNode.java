package astHtml;



public class AttributeValueNode extends AstNode {

    public AttributeValueNode(int lineNumber) {
        super("AttributeValue", lineNumber);
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("AttributeValueNode (line " + lineNumber + ")");
        for (AstNode child : children) {
            child.print(indent + 1);
        }
    }
}

