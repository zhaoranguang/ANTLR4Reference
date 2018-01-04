import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class TestLEvaluator {

    /** Sample "calculator" */
    public static class Evaluator extends LExprBaseListener {
        Stack<Integer> stack = new Stack<Integer>();

        public void exitMult(LExprParser.MultContext ctx) {
            int right = stack.pop();
            int left  = stack.pop();
            stack.push(left * right);
        }

        public void exitAdd(LExprParser.AddContext ctx) {
            int right = stack.pop();
            int left  = stack.pop();
            stack.push(left + right);
        }

        public void exitInt(LExprParser.IntContext ctx) {
            stack.push(Integer.valueOf(ctx.INT().getText()));
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is, StandardCharsets.UTF_8);
        LExprLexer lexer = new LExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LExprParser parser = new LExprParser(tokens);
        ParseTree tree = parser.s();
        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        Evaluator eval = new Evaluator();
        walker.walk(eval, tree);
        System.out.println("stack result = " + eval.stack.pop());
    }
}
