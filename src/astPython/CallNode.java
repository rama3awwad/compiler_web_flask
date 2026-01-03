// CallNode.java
package astPython;

public class CallNode extends ExpressionNode {
    private final String functionName;

    public CallNode(String functionName, int lineNumber) {
        super("Call", lineNumber);
        this.functionName = functionName;
    }

    @Override
    public String toString() {
        return "CallNode (" + functionName + ") (line " + lineNumber + ")";
    }
}