package astHtml;


public class JinjaForNode extends JinjaNode {

    private final String loopVar;

    public JinjaForNode(String loopVar, int lineNumber) {
        super("JinjaFor", lineNumber);
        this.loopVar = loopVar;
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("JinjaForNode var=" + loopVar + " (line " + lineNumber + ")");
        for (AstNode child : children) {
            child.print(indent + 1);
        }
    }
}

