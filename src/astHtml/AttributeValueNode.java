package astHtml;



public class AttributeValueNode extends AstNode {

    public AttributeValueNode(int lineNumber) {
        super("AttributeValue", lineNumber);
    }
    @Override
    public String toString() {
        return "AttributeValueNode (line " + lineNumber + ")";
    }

}

