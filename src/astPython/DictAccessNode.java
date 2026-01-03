// DictAccessNode.java
package astPython;

public class DictAccessNode extends ExpressionNode {
    private final String key;

    public DictAccessNode(String key, int lineNumber) {
        super("DictAccess", lineNumber);
        this.key = key;
    }

    @Override
    public String toString() {
        return "DictAccessNode [" + key + "] (line " + lineNumber + ")";
    }
}