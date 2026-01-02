package astPython.statement;

import astPython.PythonNode;
import astPython.expression.ExpressionNode;
import astPython.visitor.PythonVisitor;

public class ReturnNode extends PythonNode {
    private ExpressionNode value;

    public ReturnNode(ExpressionNode value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public ExpressionNode getValue() { return value; }

    @Override
    public <T> T accept(PythonVisitor<T> visitor) {
        return visitor.visitReturn(this);
    }
}
