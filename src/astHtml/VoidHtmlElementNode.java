package astHtml;


public class VoidHtmlElementNode extends ElementNode {

    private final String tagName;

    public VoidHtmlElementNode(String tagName, int lineNumber) {
        super(tagName, lineNumber);
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

}
