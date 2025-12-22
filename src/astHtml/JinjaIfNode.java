package astHtml;


public class JinjaIfNode extends JinjaNode {

    public JinjaIfNode(int lineNumber) {
        super("JinjaIf", lineNumber);
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("JinjaIfNode (line " + lineNumber + ")");
        for (AstNode child : children) {
            child.print(indent + 1);
        }
    }
}

