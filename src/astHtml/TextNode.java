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
    public String toString() {
        return "TextNode \"" + text + "\" (line " + lineNumber + ")";
    }


}


