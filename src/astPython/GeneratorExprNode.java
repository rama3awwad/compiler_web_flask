// GeneratorExprNode.java
package astPython;

public class GeneratorExprNode extends ExpressionNode {
    public GeneratorExprNode(int lineNumber) {
        super("GeneratorExpr", lineNumber);
    }

    @Override
    public String toString() {
        return "GeneratorExprNode (line " + lineNumber + ")";
    }
}