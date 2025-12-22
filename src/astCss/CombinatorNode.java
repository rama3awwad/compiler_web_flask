package astCss;


public class CombinatorNode extends SelectorNode {
    private String combinator; // ">" أو " " (مسافة)

    public CombinatorNode(String combinator, int lineNumber) {
        super("Combinator", lineNumber);
        this.combinator = combinator;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Combinator: " + combinator + " (line " + lineNumber + ")");
    }
}

