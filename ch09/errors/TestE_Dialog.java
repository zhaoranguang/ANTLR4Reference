import org.antlr.v4.runtime.*;

import java.io.InputStream;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Container;


public class TestE_Dialog {
    public static class DialogListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line, int charPositionInLine,
                                String msg,
                                RecognitionException e) {
            List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
            Collections.reverse(stack);
            StringBuilder buf = new StringBuilder();
            buf.append("rule stack: " + stack + " ");
            buf.append("line " + line + ":" + charPositionInLine + " at " + offendingSymbol + ": " + msg);
            JDialog dialog = new JDialog();
            Container contentPane = dialog.getContentPane();
            contentPane.add(new JLabel(buf.toString()));
            contentPane.setBackground(Color.white);
            dialog.setTitle("Syntax error");
            dialog.pack();
            dialog.setLocationRelativeTo(null);
            dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
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
        parser.addErrorListener(new DialogListener());  // add ours
        parser.prog();
    }
}
