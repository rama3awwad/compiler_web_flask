package astPython.statement;

import astPython.PythonNode;
import astPython.visitor.PythonVisitor;

import java.util.List;

public class ProgramNode extends PythonNode {
    private List<PythonNode> statements;

    public ProgramNode(List<PythonNode> statements) {
        super(0,0);
        this.statements = statements;
    }

    public List<PythonNode> getStatements() { return statements; }

    @Override
    public <T> T accept(PythonVisitor<T> visitor) {
        return visitor.visitProgram(this);
    }
}
