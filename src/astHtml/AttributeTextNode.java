package astHtml;


public class AttributeTextNode extends AstNode {

    private final String text;

    public AttributeTextNode(String text, int lineNumber) {
        super("AttributeText", lineNumber);
        this.text = text;
    }

}

