
package astCss;

public abstract class SimpleSelectorNode extends SelectorNode {

    protected SimpleSelectorType selectorType;
    protected String value;

    public SimpleSelectorNode(
            String nodeName,
            SimpleSelectorType selectorType,
            String value,
            int lineNumber
    ) {
        super(nodeName, lineNumber);
        this.selectorType = selectorType;
        this.value = value;
    }
    @Override
    public String toString() {
        return " SimpleSelectorNode ( " + selectorType + "):( "+ value + ") (line " + lineNumber + ")";
    }

}

