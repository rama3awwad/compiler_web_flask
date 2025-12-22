
package antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws Exception {

     // String path = "test/view_product/view_product.html.txt";
String path = "test/add_product/add_product.html.txt";
 // String path = "test/detailes_product/details_product.html.txt";
       // String path = "test/detailes_product/details_product.html.txt";
        //css
      //   String path = "test/style.css.txt;
        String code = Files.readString(Path.of(path));
        CharStream cs = CharStreams.fromString(code);
        antlr.JinjaLexer lexer = new antlr.JinjaLexer(cs);
        // lexer.removeErrorListeners();
        // lexer.addErrorListener(new BaseErrorListener());
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        antlr.JinjaParser parser = new antlr.JinjaParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener());
        antlr.JinjaParser.FileContext tree = parser.file();

        tokens.fill();
        System.out.println("----------------- LEXER OUTPUT -----------------");
        for (Token t : tokens.getTokens()) {
            String name = antlr.JinjaLexer.VOCABULARY.getSymbolicName(t.getType());
            if (t.getType() != Token.EOF) {
                System.out.printf("TOKEN: %-20s LINE: %-5d TEXT: %s%n", name, t.getLine(), t.getText().replace("\n", "\\n"));
            }
        }
        System.out.println("------------------------------------------------\n");
        System.out.println("----------------- PARSE TREE OUTPUT -----------------");
        System.out.println(tree.toStringTree(parser));
        System.out.println("-----------------------------------------------------\n");

        // ParseTreeWalker walker = new ParseTreeWalker();
        // CustomVisitor visitor = new CustomVisitor();
        // visitor.visit(tree);
    }
}

