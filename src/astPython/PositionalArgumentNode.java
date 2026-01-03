package astPython;

public class PositionalArgumentNode extends ArgumentNode {
    public PositionalArgumentNode(int lineNumber) {
        super("PositionalArgument", lineNumber);
    }

    @Override
    public String toString() {
        return "PositionalArgumentNode (line " + lineNumber + ")";
    }
}