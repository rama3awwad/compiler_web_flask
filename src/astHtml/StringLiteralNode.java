package astHtml;


public class StringLiteralNode extends ExpressionNode {

    private final String value;

    public StringLiteralNode(String value, int lineNumber) {
        super("StringLiteral", lineNumber);
        this.value = value;
    }
//
}
