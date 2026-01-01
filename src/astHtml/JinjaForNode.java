package astHtml;


public class JinjaForNode extends JinjaNode {

    private final String loopVar;

    public JinjaForNode(String loopVar, int lineNumber) {
        super("JinjaFor", lineNumber);
        this.loopVar = loopVar;
    }

//
}
