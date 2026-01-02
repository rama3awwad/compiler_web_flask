package astCss;


public class FunctionCallValueNode extends ValueNode {
    private String functionName;

    public FunctionCallValueNode(String functionName, int lineNumber) {
        super("FunctionCallValue", lineNumber);
        this.functionName = functionName;
    }
    @Override
    public String toString() {
        return " FunctionCallValueNode ( " + functionName + ") (line " + lineNumber + ")";
    }

}

