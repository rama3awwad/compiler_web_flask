package astPython.expression;

import astPython.visitor.PythonVisitor;
import java.util.List;

public class CallNode extends ExpressionNode {
    private ExpressionNode function;
    private List<ExpressionNode> arguments;

    public CallNode(ExpressionNode function, List<ExpressionNode> arguments, int line, int column) {
        super(line, column);
        this.function = function;
        this.arguments = arguments;
    }

    public ExpressionNode getFunction() { return function; }
    public List<ExpressionNode> getArguments() { return arguments; }

    @Override
    public <T> T accept(PythonVisitor<T> visitor) {
        return visitor.visitCall(this);
    }
}
