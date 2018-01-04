import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class TestLEvaluatorWithProps {

    /** Sample "calculator" */
    public static class EvaluatorWithProps extends LExprBaseListener {

        /**
         * maps nodes to integers with Map<ParseTree,Integer>
         */
        ParseTreeProperty<Integer> values = new ParseTreeProperty<Integer>();

        public void setValue(ParseTree node, int value) {
            values.put(node, value);
        }

        public int getValue(ParseTree node) {
            return values.get(node);
        }

        public void exitMult(LExprParser.MultContext ctx) {
            int left = getValue(ctx.e(0));
            int right = getValue(ctx.e(1));
            setValue(ctx, left * right);
        }

        public void exitAdd(LExprParser.AddContext ctx) {
            int left = getValue(ctx.e(0));
            int right = getValue(ctx.e(1));
            setValue(ctx, left + right);
        }

        public void exitInt(LExprParser.IntContext ctx) {
            String intText = ctx.INT().getText();  // INT   # Int
            setValue(ctx, Integer.valueOf(intText));
        }

        public void exitS(LExprParser.SContext ctx) {
            setValue(ctx, getValue(ctx.e()));
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
        EvaluatorWithProps evalProp = new EvaluatorWithProps();
        walker.walk(evalProp, tree);
        System.out.println("properties result = " + evalProp.getValue(tree));
    }
}
