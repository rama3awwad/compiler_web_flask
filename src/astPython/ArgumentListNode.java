// ArgumentListNode.java
package astPython;

public class ArgumentListNode extends AstNode {
    public ArgumentListNode(int lineNumber) {
        super("ArgumentList", lineNumber);
    }

    @Override
    public String toString() {
        return "ArgumentListNode (line " + lineNumber + ")";
    }
}