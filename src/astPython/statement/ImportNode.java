package astPython.statement;

import astPython.PythonNode;
import astPython.visitor.PythonVisitor;

import java.util.List;

public class ImportNode extends PythonNode {
    private String module;
    private List<String> names;

    public ImportNode(String module, List<String> names, int line, int column) {
        super(line, column);
        this.module = module;
        this.names = names;
    }

    public String getModule() { return module; }
    public List<String> getNames() { return names; }

    @Override
    public <T> T accept(PythonVisitor<T> visitor) {
        return visitor.visitImport(this);
    }
}
