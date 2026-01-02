package astCss;


public class EffectDeclarationNode extends DeclarationNode {
    public EffectDeclarationNode(String propertyName, int lineNumber) {
        super(propertyName, lineNumber);
    }

    @Override
    public String toString() {
        return " EffectDeclarationNode  (line " + lineNumber + ")";
    }

}

