package astPython.expression;

import astPython.PythonNode;

public abstract class ExpressionNode extends PythonNode {
    public ExpressionNode(int line, int column) {
        super(line, column);
    }
}
