package astPython;

public abstract class ArgumentNode extends AstNode {
    protected ArgumentNode(String name, int lineNumber) {
        super(name, lineNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (line " + lineNumber + ")";
    }
}