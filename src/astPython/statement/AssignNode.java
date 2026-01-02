package astPython.statement;

import astPython.PythonNode;
import astPython.expression.ExpressionNode;
import astPython.visitor.PythonVisitor;

public class AssignNode extends PythonNode {
    private String varName;
    private ExpressionNode value;

    public AssignNode(String varName, ExpressionNode value, int line, int column) {
        super(line, column);
        this.varName = varName;
        this.value = value;
    }

    public String getVarName() { return varName; }
    public ExpressionNode getValue() { return value; }

    @Override
    public <T> T accept(PythonVisitor<T> visitor) {
        return visitor.visitAssign(this);
    }
}
