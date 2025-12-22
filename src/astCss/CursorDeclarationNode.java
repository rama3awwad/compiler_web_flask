package astCss;


public class CursorDeclarationNode extends DeclarationNode {
    public CursorDeclarationNode(int lineNumber) {
        super("CursorDeclaration", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("CursorDeclaration (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

