package astCss;

public class NumberValueNode extends ValueNode {
    private String value;

    public NumberValueNode(String value, int lineNumber) {
        super("NumberValue", lineNumber);
        this.value = value;
    }
    @Override
    public String toString() {
        return " NumberValueNode ( " + value + ") (line " + lineNumber + ")";
    }

}

