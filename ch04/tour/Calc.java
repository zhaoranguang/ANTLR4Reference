import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Calc {

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        }
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }
        //ANTLRInputStream input = new ANTLRInputStream(is);

        CharStreams input = CharStreams.fromStream(is, StandardCharsets.UTF_8);
        // create a lexer that feeds off of input
        LabeledExprLexer lexer = new LabeledExprLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        LabeledExprParser parser = new LabeledExprParser(tokens);
        ParseTree tree = parser.prog();  // parse; start at prog

        //
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}
