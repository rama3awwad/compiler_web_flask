
package astCss;

public class TypeSelectorNode extends SelectorNode {

    private String tagName;

    public TypeSelectorNode(String tagName, int lineNumber) {
        super("TypeSelector", lineNumber);
        this.tagName = tagName;
    }
    @Override
    public String toString() {
        return " TypeSelectorNode ( " + tagName + ") (line " + lineNumber + ")";
    }

}

