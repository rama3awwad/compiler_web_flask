package astCss;


public class NumberValueNode extends ValueNode {
    private String value;

    public NumberValueNode(String value, int lineNumber) {
        super("NumberValue", lineNumber);
        this.value = value;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Number: " + value + " (line " + lineNumber + ")");
    }
}

