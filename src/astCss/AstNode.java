package astCss;
import java.util.ArrayList;
import java.util.List;
public abstract class AstNode {
    protected String nodeName;
    protected int lineNumber;
    protected List<AstNode> children = new ArrayList<>();

    public AstNode(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
    }

    public void addChild(AstNode child) {
        if (child != null) children.add(child);
    }

    public List<AstNode> getChildren() {
        return children;
    }
    public String getNodeName() {
        return getClass().getSimpleName();
    }

public void print(int indent) {
    printIndent(indent);
    System.out.println(toString());
    for (astCss.AstNode child : children) {
        child.print(indent + 1);
    }
}


    protected void printIndent(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
    }
}
