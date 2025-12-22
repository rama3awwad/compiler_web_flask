package astHtml;


public class VoidHtmlElementNode extends ElementNode {

    private final String tagName;

    public VoidHtmlElementNode(String tagName, int lineNumber) {
        super("VoidHtmlElement", lineNumber);
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("VoidHtmlElementNode <" + tagName + " /> (line " + lineNumber + ")");
    }
}


