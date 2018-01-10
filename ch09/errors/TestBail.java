import org.antlr.v4.runtime.*;
import java.nio.charset.StandardCharsets;
import java.io.InputStream;

public class TestBail {
    public static class BailSimpleLexer extends SimpleLexer {
        public BailSimpleLexer(CharStream input) { super(input); }
        public void recover(LexerNoViableAltException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        CharStream input = CharStreams.fromStream(is, StandardCharsets.UTF_8);
        BailSimpleLexer lexer = new BailSimpleLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleParser parser = new SimpleParser(tokens);
        parser.setErrorHandler(new BailErrorStrategy());
        parser.prog();
    }
}
