package astHtml;


public class DoctypeNode extends ElementNode {

    public DoctypeNode(int lineNumber) {
        super("Doctype", lineNumber);
    }
    @Override
    public String toString() {
        return "DoctypeNode  (line " + lineNumber + ")";
    }
}
