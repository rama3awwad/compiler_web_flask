// ProgramNode.java
package astPython;

public class ProgramNode extends AstNode {
    public ProgramNode(int lineNumber) {
        super("Program", lineNumber);
    }

    @Override
    public String toString() {
        return "ProgramNode (line " + lineNumber + ")";
    }
}