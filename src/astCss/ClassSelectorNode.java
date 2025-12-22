package astCss;


public class ClassSelectorNode extends SimpleSelectorNode {
    private String className;

    public ClassSelectorNode(String className, int lineNumber) {
        super("ClassSelector", lineNumber);
        this.className = className;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("." + className + " (line " + lineNumber + ")");
    }
}

