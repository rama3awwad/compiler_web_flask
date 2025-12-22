package astCss;


public class TypeSelectorNode extends SimpleSelectorNode {
    private String typeName;

    public TypeSelectorNode(String typeName, int lineNumber) {
        super("TypeSelector", lineNumber);
        this.typeName = typeName;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(typeName + " (line " + lineNumber + ")");
    }
}

