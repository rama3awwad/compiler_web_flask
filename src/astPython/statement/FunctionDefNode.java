package astPython.statement;

import astPython.PythonNode;
import astPython.visitor.PythonVisitor;

import java.util.List;

public class FunctionDefNode extends PythonNode {
    private String name;
    private List<String> params;
    private List<PythonNode> body;

    public FunctionDefNode(String name, List<String> params, List<PythonNode> body, int line, int column) {
        super(line, column);
        this.name = name;
        this.params = params;
        this.body = body;
    }

    public String getName() { return name; }
    public List<String> getParams() { return params; }
    public List<PythonNode> getBody() { return body; }

    @Override
    public <T> T accept(PythonVisitor<T> visitor) {
        return visitor.visitFunctionDef(this);
    }
}
