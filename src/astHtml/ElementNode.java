package astHtml;



public abstract class ElementNode extends AstNode {

    protected ElementNode(String name, int lineNumber) {
        super(name, lineNumber);
    }
    @Override
    public String toString() {
        return "ElementNode (line " + lineNumber + ")";
    }
}


