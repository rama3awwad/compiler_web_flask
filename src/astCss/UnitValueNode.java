package astCss;

public class UnitValueNode extends AstNode {
    public UnitValueNode(String value, int line) {
        super("UnitValue", line);
    }
    @Override
    public String toString() {
        return " UnitValueNode  (line " + lineNumber + ")";
    }
}

