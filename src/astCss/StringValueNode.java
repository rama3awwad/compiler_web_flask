package astCss;


public class StringValueNode extends ValueNode {
    private String value;

    public StringValueNode(String value, int lineNumber) {
        super("StringValue", lineNumber);
        this.value = value;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("String: " + value + " (line " + lineNumber + ")");
    }
}

