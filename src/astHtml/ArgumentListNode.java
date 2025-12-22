package astHtml;


public class ArgumentListNode extends AstNode {

    public ArgumentListNode(int lineNumber) {
        super("ArgumentList", lineNumber);
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("ArgumentListNode (line " + lineNumber + ")");
        for (AstNode child : children) {
            child.print(indent + 1);
        }
    }
}

