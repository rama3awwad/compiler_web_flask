// ReturnNode.java
package astPython;

public class ReturnNode extends StatementNode {
    public ReturnNode(int lineNumber) {
        super("Return", lineNumber);
    }

    @Override
    public String toString() {
        return "ReturnNode (line " + lineNumber + ")";
    }
}