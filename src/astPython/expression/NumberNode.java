package astPython.expression;

import astPython.visitor.PythonVisitor;

public class NumberNode extends ExpressionNode {
    private String value;

    public NumberNode(String value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public String getValue() { return value; }

    @Override
    public <T> T accept(PythonVisitor<T> visitor) {
        return visitor.visitNumber(this);
    }
}
