package astHtml;


public class JinjaForNode extends JinjaNode {

    private final String loopVar;

    public JinjaForNode(String loopVar, int lineNumber) {
        super("JinjaFor", lineNumber);
        this.loopVar = loopVar;
    }

    @Override
    public String toString() {
        return "JinjaForNode " + loopVar + " (line " + lineNumber + ")";
    }
}
