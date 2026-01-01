package astCss;

public class ColorValueNode extends ValueNode {
    private String type;
    private String value;

    public ColorValueNode(String type, String value, int lineNumber) {
        super("ColorValue", lineNumber);
        this.type = type;
        this.value = value;
    }

}