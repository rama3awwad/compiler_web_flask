package astCss;

public class IdentValueNode extends ValueNode {
    private String ident;

    public IdentValueNode(String ident, int lineNumber) {
        super("IdentValue", lineNumber);
        this.ident = ident;
    }


}
