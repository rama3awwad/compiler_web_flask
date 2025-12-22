package astHtml;


public class PositionalArgumentNode extends ArgumentNode {

    public PositionalArgumentNode(int lineNumber) {
        super("PositionalArgument", lineNumber);
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("PositionalArgumentNode (line " + lineNumber + ")");
        for (AstNode child : children) {
            child.print(indent + 1);
        }
    }
}

