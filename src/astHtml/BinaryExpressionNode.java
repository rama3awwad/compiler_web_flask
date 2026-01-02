package astHtml;



public class BinaryExpressionNode extends ExpressionNode {

    private final String operator;

    public BinaryExpressionNode(String operator, int lineNumber) {
        super("BinaryExpression", lineNumber);
        this.operator = operator;
    }

    @Override
    public String toString() {
        return " BinaryExpressionNode ( " + operator + ") (line " + lineNumber + ")";
    }
}





