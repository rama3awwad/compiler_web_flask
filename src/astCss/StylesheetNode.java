package astCss;


public class StylesheetNode extends AstNode {
    public StylesheetNode(int lineNumber) {
        super("Stylesheet", lineNumber);
    }
    @Override
    public String toString() {
        return " StylesheetNode  (line " + lineNumber + ")";
    }

}

