
package astCss;

public class ClassSelectorNode extends SelectorNode {

    private String className;

    public ClassSelectorNode(String className, int lineNumber) {
        super("ClassSelector", lineNumber);
        this.className = className;
    }



}
