package visitor.python;

import astPython.*;
import symbolTable.SymbolTable;

public class PythonSymbolTableVisitor {

    private SymbolTable symbolTable = new SymbolTable();

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void visit(AstNode node) {
        if (node == null) return;

        String nodeName = node.getClass().getSimpleName();

        if (nodeName.equals("AssignNode")) {
            AssignNode assign = (AssignNode) node;
            String varName = assign.getTargetName();
            symbolTable.insert(varName, node.getLineNumber(), "variable");
        } else if (nodeName.equals("FunctionDefNode")) {
            FunctionDefNode func = (FunctionDefNode) node;
            String funcName = func.getFunctionName();
            symbolTable.insert(funcName, node.getLineNumber(), "function");
        }

        for (AstNode child : node.getChildren()) {
            visit(child);
        }
    }
}