package astCss;


public class UniversalSelectorNode extends SimpleSelectorNode {
    public UniversalSelectorNode(int lineNumber) {
        super("UniversalSelector", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("* (line " + lineNumber + ")");
    }
}

