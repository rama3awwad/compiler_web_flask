package astHtml;



public class JinjaExpressionNode extends JinjaNode {

    public JinjaExpressionNode(int lineNumber) {
        super("JinjaExpression", lineNumber);
    }
    @Override
    public String toString() {
        return "JinjaExpressionNode (line " + lineNumber + ")";
    }
//

}
