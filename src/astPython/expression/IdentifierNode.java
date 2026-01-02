package astPython.expression;

import astPython.visitor.PythonVisitor;

public class IdentifierNode extends ExpressionNode {
    private String name;

    public IdentifierNode(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public <T> T accept(PythonVisitor<T> visitor) {
        return visitor.visitIdentifier(this);
    }
}
