import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Set;

public class CallGraph {

    public static class Graph {
        // I'm using org.antlr.v4.runtime.misc: OrderedHashSet, MultiMap
        Set<String>nodes = new OrderedHashSet<String>();
        MultiMap<String, String> edges =
            new MultiMap<String, String>();

        public void edge(String source, String target) {
            edges.map(source, target);
        }

        public String toDOT() {
            StringBuffer buf = new StringBuffer();
            buf.append("digraph G {\n");
            buf.append("    ranksep=.25\n");
            buf.append("    edge [arrowsize=.5]\n");
            buf.append("    node [shape=circle, fontname=\"ArialNarrow\",\n");
            buf.append("          fontsize=12, fixedsize=true, height=.45];\n");
            buf.append("    ");
            for (String node : nodes) { // print all nodes first
                buf.append(node);
                buf.append("; ");
            }
            buf.append("\n");
            for (String src : edges.keySet()) {
                for (String trg : edges.get(src)) {
                    buf.append("    ");
                    buf.append(src);
                    buf.append(" -> ");
                    buf.append(trg);
                    buf.append(";\n");
                }
            }
            buf.append("}\n");
            return buf.toString();
        }
    }


    static class FunctionListener extends CymbolBaseListener {
        Graph graph = new Graph();
        String currentFunctionName = null;

        public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
            currentFunctionName = ctx.ID().getText();
            graph.nodes.add(currentFunctionName);
        }

        public void exitCall(CymbolParser.CallContext ctx) {
            String funcName = ctx.ID().getText();
            // map current function to the callee
            graph.edge(currentFunctionName, funcName);
        }
    }


    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is, StandardCharsets.UTF_8);
        CymbolLexer lexer = new CymbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymbolParser parser = new CymbolParser(tokens);
        ParseTree tree = parser.file();
        //System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        FunctionListener collector = new FunctionListener();
        walker.walk(collector, tree);
        System.out.println(collector.graph.toString());
        System.out.println(collector.graph.toDOT());
    }
}
