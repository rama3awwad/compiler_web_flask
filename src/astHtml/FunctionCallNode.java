package astHtml;


public class FunctionCallNode extends ExpressionNode {

    private final String functionName;

    public FunctionCallNode(String functionName, int lineNumber) {
        super("FunctionCall", lineNumber);
        this.functionName = functionName;
    }

//
}
