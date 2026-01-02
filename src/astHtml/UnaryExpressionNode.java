package astHtml;


public class UnaryExpressionNode extends ExpressionNode {

    private final String operator;

    public UnaryExpressionNode(String operator, int lineNumber) {
        super(operator, lineNumber);
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "UnaryExpressionNode (" + operator + ") (line " + lineNumber + ")";
    }
}
