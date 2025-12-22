package astCss;


public class EffectDeclarationNode extends DeclarationNode {
    public EffectDeclarationNode(int lineNumber) {
        super("EffectDeclaration", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("EffectDeclaration (line " + lineNumber + ")");
        for (AstNode child : children) child.print(indent + 1);
    }
}

