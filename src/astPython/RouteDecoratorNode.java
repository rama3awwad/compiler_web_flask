// RouteDecoratorNode.java
package astPython;

public class RouteDecoratorNode extends StatementNode {
    private final String routePath;

    public RouteDecoratorNode(String routePath, int lineNumber) {
        super("RouteDecorator", lineNumber);
        this.routePath = routePath;
    }

    @Override
    public String toString() {
        return "RouteDecoratorNode (" + routePath + ") (line " + lineNumber + ")";
    }
}