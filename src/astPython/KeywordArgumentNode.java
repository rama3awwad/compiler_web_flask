// KeywordArgumentNode.java
package astPython;

public class KeywordArgumentNode extends AstNode {
    private final String name;

    public KeywordArgumentNode(String name, int lineNumber) {
        super("KeywordArgument", lineNumber);
        this.name = name;
    }

    @Override
    public String toString() {
        return "KeywordArgumentNode (" + name + "=...) (line " + lineNumber + ")";
    }
}