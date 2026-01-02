package astCss;


public class BorderDeclarationNode extends DeclarationNode {
    public BorderDeclarationNode(String propertyName, int lineNumber) {
        super(propertyName, lineNumber);
    }
    @Override
    public String toString() {
        return " BorderDeclarationNode  (line " + lineNumber + ")";
    }

}

