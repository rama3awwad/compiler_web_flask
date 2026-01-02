package astCss;


public class BoxSizingDeclarationNode extends DeclarationNode {
    public BoxSizingDeclarationNode(String propertyName, int lineNumber) {
        super(propertyName, lineNumber);
    }
    @Override
    public String toString() {
        return " BoxSizingDeclarationNode  (line " + lineNumber + ")";
    }

}

