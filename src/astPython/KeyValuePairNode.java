// KeyValuePairNode.java
package astPython;

public class KeyValuePairNode extends AstNode {
    private final String key;

    public KeyValuePairNode(String key, int lineNumber) {
        super("KeyValuePair", lineNumber);
        this.key = key;
    }

    @Override
    public String toString() {
        return "KeyValuePairNode (" + key + ") (line " + lineNumber + ")";
    }
}