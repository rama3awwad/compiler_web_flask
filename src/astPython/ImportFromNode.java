// ImportFromNode.java
package astPython;

public class ImportFromNode extends StatementNode {
    private final String module;

    public ImportFromNode(String module, int lineNumber) {
        super("ImportFrom", lineNumber);
        this.module = module;
    }

    @Override
    public String toString() {
        return "ImportFromNode (" + module + ") (line " + lineNumber + ")";
    }
}