package astHtml;



public class JinjaExpressionNode extends JinjaNode {

    public JinjaExpressionNode(int lineNumber) {
        super("JinjaExpression", lineNumber);
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("JinjaExpressionNode (line " + lineNumber + ")");
        for (AstNode child : children) {
            child.print(indent + 1);
        }
    }
}

