package astCss;


public class StylesheetNode extends AstNode {
    public StylesheetNode(int lineNumber) {
        super("Stylesheet", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

