package astHtml;



public class NumberLiteralNode extends ExpressionNode {

    private final String value;

    public NumberLiteralNode(String value, int lineNumber) {
        super("NumberLiteral", lineNumber);
        this.value = value;
    }

    @Override
    public String toString() {
        return "NumberLiteralNode (" + value + ") (line " + lineNumber + ")";
    }
}
