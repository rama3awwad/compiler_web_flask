// StatementNode.java
package astPython;

public abstract class StatementNode extends AstNode {
    protected StatementNode(String name, int lineNumber) {
        super(name, lineNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (line " + lineNumber + ")";
    }
}