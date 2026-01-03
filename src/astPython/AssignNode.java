// AssignNode.java
package astPython;

public class AssignNode extends StatementNode {
    private final String targetName;

    public AssignNode(String targetName, int lineNumber) {
        super("Assign", lineNumber);
        this.targetName = targetName;
    }

    public String getTargetName() {
        return targetName;
    }

    @Override
    public String toString() {
        return "AssignNode (" + targetName + ") (line " + lineNumber + ")";
    }
}