package astPython.expression;

import astPython.visitor.PythonVisitor;
import java.util.Map;

public class DictNode extends ExpressionNode {
    private Map<String, ExpressionNode> entries;

    public DictNode(Map<String, ExpressionNode> entries, int line, int column) {
        super(line, column);
        this.entries = entries;
    }

    public Map<String, ExpressionNode> getEntries() { return entries; }

    @Override
    public <T> T accept(PythonVisitor<T> visitor) {
        return visitor.visitDict(this);
    }
}
