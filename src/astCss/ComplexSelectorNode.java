package astCss;


public class ComplexSelectorNode extends SelectorNode {
    public ComplexSelectorNode(int lineNumber) {
        super("ComplexSelector", lineNumber);
    }

    @Override
    public String toString() {
        return " ComplexSelectorNode  (line " + lineNumber + ")";
    }

}

