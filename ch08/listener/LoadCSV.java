import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 * Terence Parr, The Definitive ANTLR4 Reference, Chapter 8
 */
public class LoadCSV {

    public static class Loader extends CSVBaseListener {

        public static final String EMPTY = "";

        /**
         * Load a list of row maps that map field name to value
         */
        List<Map<String, String>> rows = new ArrayList<Map<String, String>>();

        /**
         * List of column names
         */
        List<String> header;

        /**
         * Buildup a list fields in current row
         */
        List<String> currentRowFieldValues;

        public void exitString(CSVParser.StringContext ctx) {
            currentRowFieldValues.add(ctx.STRING().getText());
        }

        public void exitText(CSVParser.TextContext ctx) {
            currentRowFieldValues.add(ctx.TEXT().getText());
        }

        public void exitEmpty(CSVParser.EmptyContext ctx) {
            currentRowFieldValues.add(EMPTY);
        }

        public void exitHdr(CSVParser.HdrContext ctx) {
            header = new ArrayList<String>();
            header.addAll(currentRowFieldValues);
        }

        public void enterRow(CSVParser.RowContext ctx) {
            currentRowFieldValues = new ArrayList<String>();
        }

        public void exitRow(CSVParser.RowContext ctx) {
            // If this is the header row, do nothing
            //if (ctx.parent instanceof CSVParser.HdrContext) return; OR:
            if (ctx.getParent().getRuleIndex() == CSVParser.RULE_hdr) return;
            // It's a data row
            Map<String, String> m = new LinkedHashMap<String, String>();
            int i = 0;
            for (String v : currentRowFieldValues) {
                m.put(header.get(i), v);
                i++;
            }
            rows.add(m);
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is, StandardCharsets.UTF_8);
        CSVLexer lexer = new CSVLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSVParser parser = new CSVParser(tokens);
        ParseTree tree = parser.file();
        //System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        Loader loader = new Loader();
        walker.walk(loader, tree);
        System.out.println(loader.rows);
    }
}
