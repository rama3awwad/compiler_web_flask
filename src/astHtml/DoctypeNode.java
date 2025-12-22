package astHtml;


public class DoctypeNode extends ElementNode {

    public DoctypeNode(int lineNumber) {
        super("Doctype", lineNumber);
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("DoctypeNode (line " + lineNumber + ")");
    }
}

