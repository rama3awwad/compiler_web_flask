
package astCss;

public class TypeSelectorNode extends SelectorNode {

    private String tagName;

    public TypeSelectorNode(String tagName, int lineNumber) {
        super("TypeSelector", lineNumber);
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    @Override
    public String toString() {
        return " TypeSelectorNode ( " + tagName + ") (line " + lineNumber + ")";
    }

}

