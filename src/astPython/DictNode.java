// DictNode.java
package astPython;

public class DictNode extends ExpressionNode {
    public DictNode(int lineNumber) {
        super("Dict", lineNumber);
    }

    @Override
    public String toString() {
        return "DictNode (line " + lineNumber + ")";
    }
}