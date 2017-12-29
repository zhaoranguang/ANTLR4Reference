import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TestPropertyFile {
    public static class PropertyFileLoader extends PropertyFileBaseListener {
        Map<String,String> props = new OrderedHashMap<String,String>();
        /**
         *
         */
        @Override
        public void exitProp(PropertyFileParser.PropContext ctx) {
            String id = ctx.ID().getText();  // prop : ID '=' STRING '\n'
            String value = ctx.STRING().getText();
            props.put(id, value);
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is, StandardCharsets.UTF_8);
        PropertyFileLexer lexer = new PropertyFileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PropertyFileParser parser = new PropertyFileParser(tokens);
        ParseTree tree = parser.file();

        // create a standard ANTLR parse tree walker
        ParseTreeWalker walker = new ParseTreeWalker();
        // create listener then feed to walker
        PropertyFileLoader loader = new PropertyFileLoader();
        walker.walk(loader, tree);
        System.out.println(loader.props);
    }
}

