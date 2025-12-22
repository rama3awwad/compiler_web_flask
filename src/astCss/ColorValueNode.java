package astCss;


public class ColorValueNode extends ValueNode {
    private String color;

    public ColorValueNode(String color, int lineNumber) {
        super("ColorValue", lineNumber);
        this.color = color;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Color: " + color + " (line " + lineNumber + ")");
    }
}

