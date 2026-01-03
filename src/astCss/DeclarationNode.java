
package astCss;

public abstract class DeclarationNode extends AstNode {
    protected String propertyName;

    public DeclarationNode(String propertyName, int lineNumber) {
        super("Declaration", lineNumber);
        this.propertyName = propertyName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    @Override
    public String toString() {
        return " DeclarationNode ( " + propertyName + ") (line " + lineNumber + ")";
    }


}



