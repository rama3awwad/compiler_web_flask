package main;

import org.antlr.v4.runtime.*;
import antlr.*;
import astHtml.AstNode;
import astPython.*;
import astCss.*;
import visitor.html.HtmlVisitor;
import visitor.python.PythonVisitor;
import visitor.CssVisitor;
import visitor.python.PythonSymbolTableVisitor;
import visitor.html.JinjaSymbolTableVisitor;
import visitor.CssSymbolTableVisitor;
import symbolTable.SymbolTable;

import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws Exception {


        // ===================== Jinja/HTML =====================
        String jinjaPath = "test/detailes_product/details_product.html.txt"; // أو أي test
        String jinjaCode = Files.readString(Paths.get(jinjaPath));

        CharStream jinjaInput = CharStreams.fromString(jinjaCode);
        JinjaLexer jinjaLexer = new JinjaLexer(jinjaInput);
        CommonTokenStream jinjaTokens = new CommonTokenStream(jinjaLexer);
        JinjaParser jinjaParser = new JinjaParser(jinjaTokens);
        JinjaParser.FileContext jinjaTree = jinjaParser.file();

        HtmlVisitor jinjaVisitor = new HtmlVisitor();
        astHtml.AstNode jinjaAst = jinjaVisitor.visit(jinjaTree);

        System.out.println("\n=== Jinja/HTML Abstract Syntax Tree ===");
        jinjaAst.print(0);

        JinjaSymbolTableVisitor jinjaSym = new JinjaSymbolTableVisitor();
        jinjaSym.visit(jinjaAst);
        jinjaSym.getSymbolTable().print();

        // ===================== CSS =====================
        String cssPath = "test/testing/style.css.txt";
        String cssCode = Files.readString(Paths.get(cssPath));

        CharStream cssInput = CharStreams.fromString(cssCode);
        CssLexer cssLexer = new CssLexer(cssInput);
        CommonTokenStream cssTokens = new CommonTokenStream(cssLexer);
        CssParser cssParser = new CssParser(cssTokens);
        CssParser.StylesheetContext cssTree = cssParser.stylesheet();

        CssVisitor cssVisitor = new CssVisitor();
        astCss.AstNode cssAst = cssVisitor.visit(cssTree);

        System.out.println("\n=== CSS Abstract Syntax Tree ===");
        cssAst.print(0);

        CssSymbolTableVisitor cssSym = new CssSymbolTableVisitor();
        cssSym.visit(cssAst);
        cssSym.getSymbolTable().print();

        // ===================== Python =====================
        String pythonPath = "test/testing/python_test.python.txt";
        String pythonCode = Files.readString(Paths.get(pythonPath));

        CharStream pythonInput = CharStreams.fromString(pythonCode);
        PythonLexer pythonLexer = new PythonLexer(pythonInput);
        CommonTokenStream pythonTokens = new CommonTokenStream(pythonLexer);
        PythonParser pythonParser = new PythonParser(pythonTokens);
        PythonParser.ProgramContext pythonTree = pythonParser.program();

        PythonVisitor pythonVisitor = new PythonVisitor();
        astPython.AstNode pythonAst = pythonVisitor.visit(pythonTree);

        System.out.println("\n=== Python Abstract Syntax Tree ===");
        pythonAst.print(0);

        PythonSymbolTableVisitor pythonSym = new PythonSymbolTableVisitor();
        pythonSym.visit(pythonAst);
        pythonSym.getSymbolTable().print();
    }
}