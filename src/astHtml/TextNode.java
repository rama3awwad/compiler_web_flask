package astHtml;



public class TextNode extends ElementNode {

    private final String text;

    public TextNode(String text, int lineNumber) {
        super("Text", lineNumber);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("TextNode: \"" + text + "\" (line " + lineNumber + ")");
    }
}


