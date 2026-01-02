package astHtml;


public class JinjaIfNode extends JinjaNode {

    public JinjaIfNode(int lineNumber) {
        super("JinjaIf", lineNumber);
    }
    @Override
    public String toString() {
        return "JinjaIfNode (line " + lineNumber + ")";
    }
}
