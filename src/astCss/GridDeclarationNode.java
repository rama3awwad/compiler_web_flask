package astCss;


public class GridDeclarationNode extends DeclarationNode {
    public GridDeclarationNode(String propertyName, int lineNumber) {
        super(propertyName, lineNumber);
    }
    @Override
    public String toString() {
        return " GridDeclarationNode  (line " + lineNumber + ")";
    }

}

