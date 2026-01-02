package astCss;


public class CompoundSelectorNode extends SelectorNode {
    public CompoundSelectorNode(int lineNumber) {
        super("CompoundSelector", lineNumber);
    }


    @Override
    public String toString() {
        return " CompoundSelectorNode  (line " + lineNumber + ")";
    }


}

