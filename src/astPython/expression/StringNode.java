package astPython.expression;

import astPython.visitor.PythonVisitor;

public class StringNode extends ExpressionNode {
    private String value;

    public StringNode(String value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public String getValue() { return value; }

    @Override
    public <T> T accept(PythonVisitor<T> visitor){
        return visitor.visitString(this);
    }
}
