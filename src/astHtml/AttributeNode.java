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

}
