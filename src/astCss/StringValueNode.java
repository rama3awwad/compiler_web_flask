package astCss;


public class StringValueNode extends ValueNode {
    private String value;

    public StringValueNode(String value, int lineNumber) {
        super("StringValue", lineNumber);
        this.value = value;
    }



}

