package astCss;

public class SpacingDeclarationNode extends DeclarationNode {

    public SpacingDeclarationNode(String propertyName, int lineNumber) {
        super(propertyName, lineNumber);
    }
    @Override
    public String toString() {
        return " SpacingDeclarationNode  (line " + lineNumber + ")";
    }

}


