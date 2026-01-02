package astCss;


public class CombinatorNode extends SelectorNode {
    private String combinator;
    public CombinatorNode(String combinator, int lineNumber) {
        super("Combinator", lineNumber);
        this.combinator = combinator;
    }
    @Override
    public String toString() {
        return " CombinatorNode ( " + combinator + ") (line " + lineNumber + ")";
    }

}

