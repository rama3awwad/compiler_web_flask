// StringLiteralNode.java
package astPython;

public class StringLiteralNode extends ExpressionNode {
    private final String value;

    public StringLiteralNode(String value, int lineNumber) {
        super("StringLiteral", lineNumber);
        this.value = value;
    }

    @Override
    public String toString() {
        return "StringLiteralNode (" + value + ") (line " + lineNumber + ")";
    }
}