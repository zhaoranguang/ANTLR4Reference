// Generated from SimplePy.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SymplePyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, IGNORE_NEWLINE=5, NEWLINE=6, WS=7, COMMENT=8, 
		LINE_ESCAPE=9, LPAREN=10, RPAREN=11, LBRACK=12, RBRACK=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "ID", "IGNORE_NEWLINE", "NEWLINE", "WS", "COMMENT", 
		"LINE_ESCAPE", "LPAREN", "RPAREN", "LBRACK", "RBRACK"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'+'", "','", null, null, null, null, null, null, "'('", 
		"')'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ID", "IGNORE_NEWLINE", "NEWLINE", "WS", "COMMENT", 
		"LINE_ESCAPE", "LPAREN", "RPAREN", "LBRACK", "RBRACK"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    int nesting = 0;


	public SymplePyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimplePy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 9:
			LPAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			RPAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			LBRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			RBRACK_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			nesting++;
			break;
		}
	}
	private void RPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			nesting--;
			break;
		}
	}
	private void LBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			nesting++;
			break;
		}
	}
	private void RBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			nesting--;
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return IGNORE_NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean IGNORE_NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return nesting > 0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17X\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\7\5&\n\5"+
		"\f\5\16\5)\13\5\3\6\5\6,\n\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7\64\n\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\7\t>\n\t\f\t\16\tA\13\t\3\t\3\t\3\n\3\n\5\n"+
		"G\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\2\\"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2"+
		"\2\2\13+\3\2\2\2\r\63\3\2\2\2\17\67\3\2\2\2\21;\3\2\2\2\23D\3\2\2\2\25"+
		"L\3\2\2\2\27O\3\2\2\2\31R\3\2\2\2\33U\3\2\2\2\35\36\7?\2\2\36\4\3\2\2"+
		"\2\37 \7-\2\2 \6\3\2\2\2!\"\7.\2\2\"\b\3\2\2\2#\'\t\2\2\2$&\t\3\2\2%$"+
		"\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\n\3\2\2\2)\'\3\2\2\2*,\7\17"+
		"\2\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7\f\2\2./\6\6\2\2/\60\3\2\2\2\60"+
		"\61\b\6\2\2\61\f\3\2\2\2\62\64\7\17\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64"+
		"\65\3\2\2\2\65\66\7\f\2\2\66\16\3\2\2\2\678\t\4\2\289\3\2\2\29:\b\b\2"+
		"\2:\20\3\2\2\2;?\7%\2\2<>\n\5\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2"+
		"\2\2@B\3\2\2\2A?\3\2\2\2BC\b\t\2\2C\22\3\2\2\2DF\7^\2\2EG\7\17\2\2FE\3"+
		"\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\f\2\2IJ\3\2\2\2JK\b\n\2\2K\24\3\2\2\2L"+
		"M\7*\2\2MN\b\13\3\2N\26\3\2\2\2OP\7+\2\2PQ\b\f\4\2Q\30\3\2\2\2RS\7]\2"+
		"\2ST\b\r\5\2T\32\3\2\2\2UV\7_\2\2VW\b\16\6\2W\34\3\2\2\2\b\2\'+\63?F\7"+
		"\b\2\2\3\13\2\3\f\3\3\r\4\3\16\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}