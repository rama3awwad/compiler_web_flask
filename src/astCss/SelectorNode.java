
package astCss;

public abstract class SelectorNode extends AstNode {

    public SelectorNode(String name, int lineNumber) {
        super(name, lineNumber);
    }

    protected void printHeader(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
    }
}

