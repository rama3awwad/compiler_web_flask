package astPython.expression;

import astPython.visitor.PythonVisitor;
import java.util.List;

public class ListNode extends ExpressionNode {
    private List<ExpressionNode> elements;

    public ListNode(List<ExpressionNode> elements, int line, int column) {
        super(line, column);
        this.elements = elements;
    }

    public List<ExpressionNode> getElements() { return elements; }

    @Override
    public <T> T accept(PythonVisitor<T> visitor) {
        return visitor.visitList(this);
    }
}
