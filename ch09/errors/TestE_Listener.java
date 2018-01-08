import org.antlr.v4.runtime.*;

import java.io.InputStream;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;


public class TestE_Listener {
    public static class VerboseListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line, int charPositionInLine,
                                String msg,
                                RecognitionException e) {
            List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
            Collections.reverse(stack);
            System.err.println("rule stack:" + stack);
            System.err.println("line " + line + ":" + charPositionInLine + " at " + offendingSymbol + ": " + msg);
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is, StandardCharsets.UTF_8);
        SimpleLexer lexer = new SimpleLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleParser parser = new SimpleParser(tokens);
        parser.removeErrorListeners();   // remove ConsoleErrorListener
        parser.addErrorListener(new VerboseListener());  // add ours
        parser.prog();
    }
}
