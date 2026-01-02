package astCss;


public class RuleNode extends AstNode {
    public RuleNode(int lineNumber) {
        super("Rule", lineNumber);
    }

    @Override
    public String toString() {
        return " RuleNode  (line " + lineNumber + ")";
    }

}

