import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Stack;

public class TestX {

    public static class MyListener extends XBaseListener {
        Stack<Integer> stack = new Stack<Integer>();
        public void exitMult(XParser.MultContext ctx) {
            int right = stack.pop();
            int left  = stack.pop();
            stack.push(left * right);
        }
        public void exitAdd(XParser.AddContext ctx) {
            int right = stack.pop();
            int left  = stack.pop();
            stack.push(left + right);
        }
        public void exitInt(XParser.IntContext ctx) {
            stack.push(Integer.valueOf(ctx.INT().getText()));
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }
        CharStream input = CharStreams.fromStream(is, StandardCharsets.UTF_8);
        XLexer lexer = new XLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XParser parser = new XParser(tokens);
        ParseTree tree = parser.XstartRule();

        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener listener = new MyListener();
        walker.walk(listener, tree);
    }

}
