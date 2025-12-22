package astCss;


public class FontDeclarationNode extends DeclarationNode {
    public FontDeclarationNode(int lineNumber) {
        super("FontDeclaration", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("FontDeclaration (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

