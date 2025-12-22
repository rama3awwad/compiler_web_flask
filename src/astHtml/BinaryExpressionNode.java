package astHtml;



public class BinaryExpressionNode extends ExpressionNode {

    private final String operator;

    public BinaryExpressionNode(String operator, int lineNumber) {
        super("BinaryExpression", lineNumber);
        this.operator = operator;
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("BinaryExpressionNode '" + operator + "' (line " + lineNumber + ")");
        for (AstNode child : children) {
            child.print(indent + 1);
        }
    }
}





