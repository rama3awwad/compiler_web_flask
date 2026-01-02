package astCss;


public class FlexDeclarationNode extends DeclarationNode {
    public FlexDeclarationNode(String propertyName, int lineNumber) {
        super(propertyName, lineNumber);
    }

    @Override
    public String toString() {
        return " FlexDeclarationNode  (line " + lineNumber + ")";
    }

}

