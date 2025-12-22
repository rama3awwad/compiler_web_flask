package astCss;


public class BackgroundDeclarationNode extends DeclarationNode {
    public BackgroundDeclarationNode(int lineNumber) {
        super("BackgroundDeclaration", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("BackgroundDeclaration (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

