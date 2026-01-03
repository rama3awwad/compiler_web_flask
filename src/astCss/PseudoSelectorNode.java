
package astCss;

public class PseudoSelectorNode extends SelectorNode {

    private String pseudoName;

    public PseudoSelectorNode(String pseudoName, int lineNumber) {
        super("PseudoSelector", lineNumber);
        this.pseudoName = pseudoName;
    }

    public String getPseudoName() {
        return pseudoName;
    }

    @Override
    public String toString() {
        return " PseudoSelectorNode ( " + pseudoName + ") (line " + lineNumber + ")";
    }
}

