package astHtml;


public class NamedArgumentNode extends ArgumentNode {

    private final String name;

    public NamedArgumentNode(String name, int lineNumber) {
        super("NamedArgument", lineNumber);
        this.name = name;
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("NamedArgumentNode " + name + " (line " + lineNumber + ")");
        for (AstNode child : children) {
            child.print(indent + 1);
        }
    }
}

