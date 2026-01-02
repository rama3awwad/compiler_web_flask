package astCss;


public class BackgroundColorDeclarationNode extends DeclarationNode {
    public BackgroundColorDeclarationNode(String propertyName, int lineNumber) {
        super(propertyName, lineNumber);
    }

    @Override
    public String toString() {
        return " BackgroundColorDeclarationNode  (line " + lineNumber + ")";
    }

}

