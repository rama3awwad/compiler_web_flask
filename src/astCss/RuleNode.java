package astCss;


public class RuleNode extends AstNode {
    public RuleNode(int lineNumber) {
        super("Rule", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

