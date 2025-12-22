package astCss;


public class ColorDeclarationNode extends DeclarationNode {
    public ColorDeclarationNode(int lineNumber) {
        super("ColorDeclaration", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("ColorDeclaration (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

