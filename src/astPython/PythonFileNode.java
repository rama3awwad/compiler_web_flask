// PythonFileNode.java
package astPython;

public class PythonFileNode extends AstNode {
    public PythonFileNode(int lineNumber) {
        super("PythonFile", lineNumber);
    }

    @Override
    public String toString() {
        return "PythonFileNode (line " + lineNumber + ")";
    }
}