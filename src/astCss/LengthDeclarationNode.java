package astCss;


public class LengthDeclarationNode extends DeclarationNode {
    public LengthDeclarationNode(int lineNumber) {
        super("LengthDeclaration", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("LengthDeclaration (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

