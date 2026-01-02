package astPython.statement;

import astPython.PythonNode;
import astPython.visitor.PythonVisitor;

public class DecoratorNode extends PythonNode {
    private String decoratorName;
    private String argument;

    public DecoratorNode(String decoratorName, String argument, int line, int column) {
        super(line, column);
        this.decoratorName = decoratorName;
        this.argument = argument;
    }

    public String getDecoratorName() { return decoratorName; }
    public String getArgument() { return argument; }

    @Override
    public <T> T accept(PythonVisitor<T> visitor) {
        return visitor.visitDecorator(this);
    }
}
