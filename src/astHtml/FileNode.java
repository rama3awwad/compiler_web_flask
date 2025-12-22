package astHtml;

import astHtml.AstNode;

public class FileNode extends AstNode {

    public FileNode(int lineNumber) {
        super("File", lineNumber);
    }

    @Override
    public void print(int indent) {
        indent(indent);
        System.out.println("FileNode (line " + lineNumber + ")");
        for (AstNode child : children) {
            child.print(indent + 1);
        }
    }
}

