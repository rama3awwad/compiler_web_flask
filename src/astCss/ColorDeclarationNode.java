package astCss;


public class ColorDeclarationNode extends DeclarationNode {
    public ColorDeclarationNode(String propertyName, int lineNumber) {
        super(propertyName, lineNumber);
    }
    @Override
    public String toString() {
        return " ColorDeclarationNode  (line " + lineNumber + ")";
    }

}

