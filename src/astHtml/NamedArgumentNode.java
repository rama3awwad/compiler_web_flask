package astHtml;


public class NamedArgumentNode extends ArgumentNode {

    private final String name;

    public NamedArgumentNode(String name, int lineNumber) {
        super("NamedArgument", lineNumber);
        this.name = name;
    }

//
}
