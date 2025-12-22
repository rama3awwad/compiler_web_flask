package astCss;


public class AngleValueNode extends ValueNode {
    private String value;

    public AngleValueNode(String value, int lineNumber) {
        super("AngleValue", lineNumber);
        this.value = value;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Angle: " + value + " (line " + lineNumber + ")");
    }
}

