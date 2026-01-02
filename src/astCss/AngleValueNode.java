package astCss;


public class AngleValueNode extends ValueNode {
    private String value;

    public AngleValueNode(String value, int lineNumber) {
        super("AngleValue", lineNumber);
        this.value = value;
    }

    @Override
    public String toString() {
        return " AngleValueNode ( " + value + ") (line " + lineNumber + ")";
    }

}

