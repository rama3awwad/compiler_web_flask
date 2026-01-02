package astCss;


public class BackgroundDeclarationNode extends DeclarationNode {
    public BackgroundDeclarationNode(String propertyName, int lineNumber) {
        super(propertyName, lineNumber);
    }
    @Override
    public String toString() {
        return " BackgroundDeclarationNode  (line " + lineNumber + ")";
    }


}

