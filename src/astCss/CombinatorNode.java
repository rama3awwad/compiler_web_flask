package astCss;


public class CombinatorNode extends SelectorNode {
    private String combinator;
    public CombinatorNode(String combinator, int lineNumber) {
        super("Combinator", lineNumber);
        this.combinator = combinator;
    }
}

