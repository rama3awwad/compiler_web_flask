package astHtml;

import astHtml.AstNode;

public class FileNode extends AstNode {

    public FileNode(int lineNumber) {
        super("File", lineNumber);
    }
    @Override
    public String toString() {
        return "FileNode (line " + lineNumber + ")";
    }
//
}

