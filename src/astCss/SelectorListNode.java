package astCss;


public class SelectorListNode extends SelectorNode {
    public SelectorListNode(int lineNumber) {
        super("SelectorList", lineNumber);
    }
    @Override
    public String toString() {
        return " SelectorListNode  (line " + lineNumber + ")";
    }


}

