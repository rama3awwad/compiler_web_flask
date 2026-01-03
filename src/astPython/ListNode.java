// ListNode.java
package astPython;

public class ListNode extends ExpressionNode {
    public ListNode(int lineNumber) {
        super("List", lineNumber);
    }

    @Override
    public String toString() {
        return "ListNode (line " + lineNumber + ")";
    }
}