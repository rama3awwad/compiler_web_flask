
package astCss;

public abstract class DeclarationNode extends AstNode {
    protected String propertyName;

    public DeclarationNode(String propertyName, int lineNumber) {
        super("Declaration", lineNumber);
        this.propertyName = propertyName;
    }


}



