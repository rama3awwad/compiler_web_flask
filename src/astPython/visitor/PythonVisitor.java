package astPython.visitor;

import astPython.PythonNode;
import astPython.statement.*;
import astPython.expression.*;

public interface PythonVisitor<T> {
    T visitProgram(ProgramNode node);
    T visitAssign(AssignNode node);
    T visitReturn(ReturnNode node);
    T visitFunctionDef(FunctionDefNode node);
    T visitIfMain(IfMainNode node);
    T visitImport(ImportNode node);
    T visitDecorator(DecoratorNode node);
    T visitIdentifier(IdentifierNode node);
    T visitNumber(NumberNode node);
    T visitString(StringNode node);
    T visitCall(CallNode node);
    T visitList(ListNode node);
    T visitDict(DictNode node);
}
