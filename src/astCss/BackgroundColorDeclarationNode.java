package astCss;


public class BackgroundColorDeclarationNode extends DeclarationNode {
    public BackgroundColorDeclarationNode(int lineNumber) {
        super("BackgroundColorDeclaration", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("BackgroundColorDeclaration (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

