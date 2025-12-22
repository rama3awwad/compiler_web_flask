package astHtml;



import java.util.List;

public class HtmlElementNode extends ElementNode {

    private final String tagName;

    public HtmlElementNode(String tagName, int lineNumber) {
        super("HtmlElement", lineNumber);
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("HtmlElementNode <" + tagName + "> (line " + lineNumber + ")");
        for (AstNode child : children) {
            child.print(indent + 1);
        }
        indent(indent);
        System.out.println("</" + tagName + ">");
    }
}


