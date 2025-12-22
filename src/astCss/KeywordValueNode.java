package astCss;


public class KeywordValueNode extends ValueNode {
    private String keyword;

    public KeywordValueNode(String keyword, int lineNumber) {
        super("KeywordValue", lineNumber);
        this.keyword = keyword;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Keyword: " + keyword + " (line " + lineNumber + ")");
    }
}

