package astCss;


public class BorderDeclarationNode extends DeclarationNode {
    public BorderDeclarationNode(int lineNumber) {
        super("BorderDeclaration", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("BorderDeclaration (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

