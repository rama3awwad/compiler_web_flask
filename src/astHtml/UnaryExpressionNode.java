package astHtml;


public class UnaryExpressionNode extends ExpressionNode {

    private final String operator;

    public UnaryExpressionNode(String operator, int lineNumber) {
        super("UnaryExpression", lineNumber);
        this.operator = operator;
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("UnaryExpressionNode '" + operator + "' (line " + lineNumber + ")");
        for (AstNode child : children) {
            child.print(indent + 1);
        }
    }
}
