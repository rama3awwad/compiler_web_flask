package astHtml;


public class HtmlElementNode extends ElementNode {

    private final String tagName;

    public HtmlElementNode(String tagName, int lineNumber) {
        super(tagName, lineNumber);
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }



}
