package astHtml;


public class AttributeNode extends AstNode {

    private final String name;

    public AttributeNode(String name, int lineNumber) {
        super("Attribute", lineNumber);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("AttributeNode " + name + " (line " + lineNumber + ")");
        for (AstNode child : children) {
            child.print(indent + 1);
        }
    }
}

