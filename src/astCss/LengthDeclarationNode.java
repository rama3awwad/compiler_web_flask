package astCss;


public class LengthDeclarationNode extends DeclarationNode {
    public LengthDeclarationNode(String propertyName, int lineNumber) {
        super(propertyName, lineNumber);
    }
    @Override
    public String toString() {
        return " LengthDeclarationNode  (line " + lineNumber + ")";
    }
}

