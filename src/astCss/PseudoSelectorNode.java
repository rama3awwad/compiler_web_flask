package astCss;


public class PseudoSelectorNode extends SimpleSelectorNode {
    private String pseudo;

    public PseudoSelectorNode(String pseudo, int lineNumber) {
        super("PseudoSelector", lineNumber);
        this.pseudo = pseudo;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(":" + pseudo + " (line " + lineNumber + ")");
    }
}

