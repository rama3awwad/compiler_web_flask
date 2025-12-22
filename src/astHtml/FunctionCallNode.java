package astHtml;


public class FunctionCallNode extends ExpressionNode {

    private final String functionName;

    public FunctionCallNode(String functionName, int lineNumber) {
        super("FunctionCall", lineNumber);
        this.functionName = functionName;
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("FunctionCallNode " + functionName + " (line " + lineNumber + ")");
        for (AstNode child : children) {
            child.print(indent + 1);
        }
    }
}

