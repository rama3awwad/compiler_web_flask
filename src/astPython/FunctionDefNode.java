// FunctionDefNode.java
package astPython;

public class FunctionDefNode extends StatementNode {
    private final String functionName;

    public FunctionDefNode(String functionName, int lineNumber) {
        super("FunctionDef", lineNumber);
        this.functionName = functionName;
    }

    public String getFunctionName() {
        return functionName;
    }
    @Override
    public String toString() {
        return "FunctionDefNode (" + functionName + ") (line " + lineNumber + ")";
    }
}