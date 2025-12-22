package astCss;


public class GridDeclarationNode extends DeclarationNode {
    public GridDeclarationNode(int lineNumber) {
        super("GridDeclaration", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("GridDeclaration (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

