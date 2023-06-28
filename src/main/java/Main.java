import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String className = "Person";
        FileInputStream inputStream = new FileInputStream(String.format("src/main/java/test/%s.dart", className));

        CharStream input = CharStreams.fromStream(inputStream);

        BaseDartLexer lexer = new BaseDartLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DartFuncGrammaParser parser = new DartFuncGrammaParser(tokens);

        ParseTree tree = parser.topLavelStatement();
        ParseTreeWalker walker = new ParseTreeWalker();
        String outputPath = String.format("src/main/java/test/%s", className);
        walker.walk(new DartWalker(new File(outputPath)), tree);



    }

}
