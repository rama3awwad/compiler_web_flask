package astCss;


public class FontDeclarationNode extends DeclarationNode {
    public FontDeclarationNode(String propertyName, int lineNumber) {
        super(propertyName, lineNumber);
    }
    @Override
    public String toString() {
        return " FontDeclarationNode  (line " + lineNumber + ")";
    }


}

