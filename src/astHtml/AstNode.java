package astHtml;

import java.util.ArrayList;
import java.util.List;

public abstract class AstNode {

    protected String nodeName;
    protected int lineNumber;
    protected List<AstNode> children;

    protected AstNode(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.children = new ArrayList<>();
    }

    public String getNodeName() {
        return nodeName;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public List<AstNode> getChildren() {
        return children;
    }

    public void addChild(AstNode child) {
        if (child != null) {
            children.add(child);
        }
    }

    // Polymorphism
    public abstract void print(int indent);

    protected void indent(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
    }
}
