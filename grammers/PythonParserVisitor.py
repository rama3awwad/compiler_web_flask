# Generated from PythonParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .PythonParser import PythonParser
else:
    from PythonParser import PythonParser

    package antlr;


# This class defines a complete generic visitor for a parse tree produced by PythonParser.

class PythonParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PythonParser#ProgramBlock.
    def visitProgramBlock(self, ctx:PythonParser.ProgramBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#SimpleStmtBlock.
    def visitSimpleStmtBlock(self, ctx:PythonParser.SimpleStmtBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#CompoundStmt.
    def visitCompoundStmt(self, ctx:PythonParser.CompoundStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#DecoratorStmt.
    def visitDecoratorStmt(self, ctx:PythonParser.DecoratorStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#EmptyLine.
    def visitEmptyLine(self, ctx:PythonParser.EmptyLineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#DecoratedFuncDef.
    def visitDecoratedFuncDef(self, ctx:PythonParser.DecoratedFuncDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#IfMainStmt.
    def visitIfMainStmt(self, ctx:PythonParser.IfMainStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#MultiSimpleStmt.
    def visitMultiSimpleStmt(self, ctx:PythonParser.MultiSimpleStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#ImportStmtStmt.
    def visitImportStmtStmt(self, ctx:PythonParser.ImportStmtStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#ReturnStmtStmt.
    def visitReturnStmtStmt(self, ctx:PythonParser.ReturnStmtStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#AssignStmtStmt.
    def visitAssignStmtStmt(self, ctx:PythonParser.AssignStmtStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#ExprStmtStmt.
    def visitExprStmtStmt(self, ctx:PythonParser.ExprStmtStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#FuncDef.
    def visitFuncDef(self, ctx:PythonParser.FuncDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#NormalParams.
    def visitNormalParams(self, ctx:PythonParser.NormalParamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#RouteParam.
    def visitRouteParam(self, ctx:PythonParser.RouteParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#SingleLineSuite.
    def visitSingleLineSuite(self, ctx:PythonParser.SingleLineSuiteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#IndentedSuite.
    def visitIndentedSuite(self, ctx:PythonParser.IndentedSuiteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#SingleStmtSuite.
    def visitSingleStmtSuite(self, ctx:PythonParser.SingleStmtSuiteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#ReturnStmtExpr.
    def visitReturnStmtExpr(self, ctx:PythonParser.ReturnStmtExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#AssignStmtExpr.
    def visitAssignStmtExpr(self, ctx:PythonParser.AssignStmtExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#IfMainBlock.
    def visitIfMainBlock(self, ctx:PythonParser.IfMainBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#RouteDecorator.
    def visitRouteDecorator(self, ctx:PythonParser.RouteDecoratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#FromImportStmt.
    def visitFromImportStmt(self, ctx:PythonParser.FromImportStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#ImportListExpr.
    def visitImportListExpr(self, ctx:PythonParser.ImportListExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#DottedNameExpr.
    def visitDottedNameExpr(self, ctx:PythonParser.DottedNameExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#FuncCallExprExpr.
    def visitFuncCallExprExpr(self, ctx:PythonParser.FuncCallExprExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#ListExprExpr.
    def visitListExprExpr(self, ctx:PythonParser.ListExprExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#DictExprExpr.
    def visitDictExprExpr(self, ctx:PythonParser.DictExprExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#GenExprExpr.
    def visitGenExprExpr(self, ctx:PythonParser.GenExprExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#PrimaryExprExpr.
    def visitPrimaryExprExpr(self, ctx:PythonParser.PrimaryExprExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#FuncCallExprCall.
    def visitFuncCallExprCall(self, ctx:PythonParser.FuncCallExprCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#ArgListExpr.
    def visitArgListExpr(self, ctx:PythonParser.ArgListExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#PositionalArgExpr.
    def visitPositionalArgExpr(self, ctx:PythonParser.PositionalArgExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#GeneratorArgExpr.
    def visitGeneratorArgExpr(self, ctx:PythonParser.GeneratorArgExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#KeywordArgExpr.
    def visitKeywordArgExpr(self, ctx:PythonParser.KeywordArgExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#GeneratorExprExpr.
    def visitGeneratorExprExpr(self, ctx:PythonParser.GeneratorExprExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#DictAccessExprPrimary.
    def visitDictAccessExprPrimary(self, ctx:PythonParser.DictAccessExprPrimaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#ListLiteralExpr.
    def visitListLiteralExpr(self, ctx:PythonParser.ListLiteralExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#elementList.
    def visitElementList(self, ctx:PythonParser.ElementListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#DictLiteralExpr.
    def visitDictLiteralExpr(self, ctx:PythonParser.DictLiteralExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#keyValuePair.
    def visitKeyValuePair(self, ctx:PythonParser.KeyValuePairContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#IdentifierPrimary.
    def visitIdentifierPrimary(self, ctx:PythonParser.IdentifierPrimaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#NumberLiteralPrimary.
    def visitNumberLiteralPrimary(self, ctx:PythonParser.NumberLiteralPrimaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#StringLiteralPrimary.
    def visitStringLiteralPrimary(self, ctx:PythonParser.StringLiteralPrimaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#ParenExprPrimary.
    def visitParenExprPrimary(self, ctx:PythonParser.ParenExprPrimaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#DictAccessPrimary.
    def visitDictAccessPrimary(self, ctx:PythonParser.DictAccessPrimaryContext):
        return self.visitChildren(ctx)



del PythonParser