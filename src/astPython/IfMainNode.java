// IfMainNode.java
package astPython;

public class IfMainNode extends StatementNode {
    public IfMainNode(int lineNumber) {
        super("IfMain", lineNumber);
    }

    @Override
    public String toString() {
        return "IfMainNode (line " + lineNumber + ")";
    }
}