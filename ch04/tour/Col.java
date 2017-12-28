import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Col {

    public static void main(String[] args) throws Exception {
        String colStr = "1";
        if (args.length > 0) {
            colStr = args[0];
        }
        InputStream is = System.in;
        CharStream input = CharStreams.fromStream(is, StandardCharsets.UTF_8);

        // create a lexer that feeds off of input
        RowsLexer lexer = new RowsLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        int col = Integer.valueOf(colStr);

        // create a parser that feeds off the tokens buffer
        RowsParser parser = new RowsParser(tokens, col);
        parser.setBuildParseTree(false);   // don't waste time building a tree
        parser.file();
    }
}
