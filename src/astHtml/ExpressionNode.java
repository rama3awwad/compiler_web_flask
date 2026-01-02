package astHtml;




public abstract class ExpressionNode extends AstNode {

    protected ExpressionNode(String name, int lineNumber) {
        super(name, lineNumber);
    }
    @Override
    public String toString() {
        return "ExpressionNode (line " + lineNumber + ")";
    }
}


