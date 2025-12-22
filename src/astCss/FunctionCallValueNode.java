package astCss;


public class FunctionCallValueNode extends ValueNode {
    private String functionName;

    public FunctionCallValueNode(String functionName, int lineNumber) {
        super("FunctionCallValue", lineNumber);
        this.functionName = functionName;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("FunctionCall: " + functionName + " (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

