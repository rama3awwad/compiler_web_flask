package astCss;


public class LayoutDeclarationNode extends DeclarationNode {
    public LayoutDeclarationNode(int lineNumber) {
        super("LayoutDeclaration", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("LayoutDeclaration (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

