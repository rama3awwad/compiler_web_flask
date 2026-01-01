package astHtml;


public class IdentifierNode extends ExpressionNode {

    private final String name;

    public IdentifierNode(String name, int lineNumber) {
        super("Identifier", lineNumber);
        this.name = name;
    }

}


