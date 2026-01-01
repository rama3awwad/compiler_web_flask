
package astCss;

public class TypeSelectorNode extends SelectorNode {

    private String tagName;

    public TypeSelectorNode(String tagName, int lineNumber) {
        super("TypeSelector", lineNumber);
        this.tagName = tagName;
    }


}

