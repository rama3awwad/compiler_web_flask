package astHtml;


public class PropertyAccessNode extends ExpressionNode {

    public PropertyAccessNode(int lineNumber) {
        super("PropertyAccess", lineNumber);
    }

    @Override
    public String toString() {
        return "PropertyAccessNode (line " + lineNumber + ")";
    }
}
