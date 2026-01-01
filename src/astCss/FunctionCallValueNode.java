package astCss;


public class FunctionCallValueNode extends ValueNode {
    private String functionName;

    public FunctionCallValueNode(String functionName, int lineNumber) {
        super("FunctionCallValue", lineNumber);
        this.functionName = functionName;
    }


}

