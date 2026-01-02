package astHtml;



public abstract class JinjaNode extends ElementNode {

    protected JinjaNode(String name, int lineNumber) {
        super(name, lineNumber);
    }
    @Override
    public String toString() {
        return "JinjaNode (line " + lineNumber + ")";
    }
}

