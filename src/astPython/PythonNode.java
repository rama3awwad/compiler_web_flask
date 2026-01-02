package astPython;

import astPython.visitor.PythonVisitor;

public abstract class PythonNode {
    private int line;
    private int column;

    public PythonNode(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() { return line; }
    public int getColumn() { return column; }

    public abstract <T> T accept(PythonVisitor<T> visitor);
}
