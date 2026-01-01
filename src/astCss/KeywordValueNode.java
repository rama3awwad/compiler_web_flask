package astCss;


public class KeywordValueNode extends ValueNode {
    private String keyword;

    public KeywordValueNode(String keyword, int lineNumber) {
        super("KeywordValue", lineNumber);
        this.keyword = keyword;
    }


}

