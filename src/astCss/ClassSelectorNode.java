
package astCss;

public class ClassSelectorNode extends SelectorNode {

    private String className;

    public ClassSelectorNode(String className, int lineNumber) {
        super("ClassSelector", lineNumber);
        this.className = className;
    }
    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return " ClassSelectorNode ( " + className + ") (line " + lineNumber + ")";
    }

}
