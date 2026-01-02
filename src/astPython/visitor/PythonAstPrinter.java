package astPython.visitor;

import astPython.PythonNode;
import astPython.statement.*;
import astPython.expression.*;

public class PythonAstPrinter implements PythonVisitor<Void> {
    private int indent = 0;
    private void printIndent() { for(int i=0;i<indent;i++) System.out.print("  "); }

    @Override
    public Void visitProgram(ProgramNode node) {
        for(PythonNode stmt : node.getStatements()) stmt.accept(this);
        return null;
    }
    @Override public Void visitAssign(AssignNode node) {
        printIndent(); System.out.print(node.getVarName() + " = ");
        node.getValue().accept(this);
        System.out.println(); return null;
    }
    @Override public Void visitReturn(ReturnNode node) {
        printIndent(); System.out.print("return "); node.getValue().accept(this); System.out.println(); return null;
    }
    @Override public Void visitFunctionDef(FunctionDefNode node) {
        printIndent(); System.out.println("def " + node.getName() + "(" + String.join(",", node.getParams()) + "):");
        indent++; for(PythonNode stmt : node.getBody()) stmt.accept(this); indent--;
        return null;
    }
    @Override public Void visitIfMain(IfMainNode node) {
        printIndent(); System.out.println("if __name__ == \"__main__\":");
        indent++; for(PythonNode stmt : node.getBody()) stmt.accept(this); indent--;
        return null;
    }
    @Override public Void visitImport(ImportNode node) {
        printIndent(); System.out.println("from " + node.getModule() + " import " + String.join(",", node.getNames())); return null;
    }
    @Override public Void visitDecorator(DecoratorNode node) {
        printIndent(); System.out.println("@" + node.getDecoratorName() + "(\"" + node.getArgument() + "\")"); return null;
    }
    @Override public Void visitIdentifier(IdentifierNode node) { System.out.print(node.getName()); return null; }
    @Override public Void visitNumber(NumberNode node) { System.out.print(node.getValue()); return null; }
    @Override public Void visitString(StringNode node) { System.out.print("\""+node.getValue()+"\""); return null; }
    @Override public Void visitCall(CallNode node) {
        node.getFunction().accept(this); System.out.print("(");
        for(int i=0;i<node.getArguments().size();i++){ node.getArguments().get(i).accept(this); if(i<node.getArguments().size()-1) System.out.print(", "); }
        System.out.print(")"); return null;
    }
    @Override public Void visitList(ListNode node) {
        System.out.print("["); for(int i=0;i<node.getElements().size();i++){ node.getElements().get(i).accept(this); if(i<node.getElements().size()-1) System.out.print(", "); } System.out.print("]"); return null;
    }
    @Override public Void visitDict(DictNode node) {
        System.out.print("{"); int c=0;
        for(var e : node.getEntries().entrySet()){ System.out.print("\""+e.getKey()+"\": "); e.getValue().accept(this); if(c<node.getEntries().size()-1) System.out.print(", "); c++; }
        System.out.print("}"); return null;
    }
}
