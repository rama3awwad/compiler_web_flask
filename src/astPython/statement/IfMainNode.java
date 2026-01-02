package astPython.statement;

import astPython.PythonNode;
import astPython.visitor.PythonVisitor;
import java.util.List;

public class IfMainNode extends PythonNode {
    private List<PythonNode> body;

    public IfMainNode(List<PythonNode> body, int line, int column) {
        super(line, column);
        this.body = body;
    }

    public List<PythonNode> getBody() { return body; }

    @Override
    public <T> T accept(PythonVisitor<T> visitor) {
        return visitor.visitIfMain(this);
    }
}
