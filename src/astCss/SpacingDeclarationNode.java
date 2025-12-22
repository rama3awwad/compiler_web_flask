package astCss;


public class SpacingDeclarationNode extends DeclarationNode {
    public SpacingDeclarationNode(int lineNumber) {
        super("SpacingDeclaration", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("SpacingDeclaration (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

