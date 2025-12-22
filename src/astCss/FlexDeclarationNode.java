package astCss;


public class FlexDeclarationNode extends DeclarationNode {
    public FlexDeclarationNode(int lineNumber) {
        super("FlexDeclaration", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("FlexDeclaration (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

