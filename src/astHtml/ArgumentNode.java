package astHtml;


public abstract class ArgumentNode extends AstNode {

    protected ArgumentNode(String name, int lineNumber) {
        super(name, lineNumber);
    }
    @Override
    public String toString() {
        return " ArgumentNode (line " + lineNumber + ")";
    }
}

