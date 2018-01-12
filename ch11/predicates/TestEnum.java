import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.Trees;
import java.io.FileInputStream;
import java.io.InputStream;

public class TestEnum2 {
    public static void main(String[] args) throws Exception {
        int i = 0;
        Enum2Parser.java5 = false;   // here we assume non-Java5 mode by default
        if (args.length > 0 && args[i].equals("-java5")) {
            Enum2Parser.java5 = true;
            i++;
        }
        String inputFile = null;
        if (args.length > i) inputFile = args[i];
        InputStream is = System.in;
        if (inputFile != null) {
            is= new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        Enum2Lexer lexer = new Enum2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Enum2Parser parser = new Enum2Parser(tokens);
        parser.prog();
    }
}

