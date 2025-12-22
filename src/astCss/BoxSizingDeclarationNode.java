package astCss;


public class BoxSizingDeclarationNode extends DeclarationNode {
    public BoxSizingDeclarationNode(int lineNumber) {
        super("BoxSizingDeclaration", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("BoxSizingDeclaration (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

