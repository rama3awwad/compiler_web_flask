// NameNode.java
package astPython;

public class NameNode extends ExpressionNode {
    private final String name;

    public NameNode(String name, int lineNumber) {
        super("Name", lineNumber);
        this.name = name;
    }

    @Override
    public String toString() {
        return "NameNode (" + name + ") (line " + lineNumber + ")";
    }
}