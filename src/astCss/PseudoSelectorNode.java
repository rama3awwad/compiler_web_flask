
package astCss;

public class PseudoSelectorNode extends SelectorNode {

    private String pseudoName;

    public PseudoSelectorNode(String pseudoName, int lineNumber) {
        super("PseudoSelector", lineNumber);
        this.pseudoName = pseudoName;
    }

}

