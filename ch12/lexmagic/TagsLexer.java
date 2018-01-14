// Generated from Tags.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TagsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, CDATA=2, TAG=3, ENTITY=4, TEXT=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMENT", "CDATA", "TAG", "ENTITY", "TEXT"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "CDATA", "TAG", "ENTITY", "TEXT"
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


	public TagsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tags.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7I\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4\65\n"+
		"\4\f\4\16\48\13\4\3\4\3\4\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\5\3\5\3\6"+
		"\6\6F\n\6\r\6\16\6G\6\25+\66?\2\7\3\3\5\4\7\5\t\6\13\7\3\2\3\4\2((>>\2"+
		"M\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\r\3\2"+
		"\2\2\5\36\3\2\2\2\7\62\3\2\2\2\t;\3\2\2\2\13E\3\2\2\2\r\16\7>\2\2\16\17"+
		"\7#\2\2\17\20\7/\2\2\20\21\7/\2\2\21\25\3\2\2\2\22\24\13\2\2\2\23\22\3"+
		"\2\2\2\24\27\3\2\2\2\25\26\3\2\2\2\25\23\3\2\2\2\26\30\3\2\2\2\27\25\3"+
		"\2\2\2\30\31\7/\2\2\31\32\7/\2\2\32\33\7@\2\2\33\34\3\2\2\2\34\35\b\2"+
		"\2\2\35\4\3\2\2\2\36\37\7>\2\2\37 \7#\2\2 !\7]\2\2!\"\7E\2\2\"#\7F\2\2"+
		"#$\7C\2\2$%\7V\2\2%&\7C\2\2&\'\7]\2\2\'+\3\2\2\2(*\13\2\2\2)(\3\2\2\2"+
		"*-\3\2\2\2+,\3\2\2\2+)\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7_\2\2/\60\7_\2\2"+
		"\60\61\7@\2\2\61\6\3\2\2\2\62\66\7>\2\2\63\65\13\2\2\2\64\63\3\2\2\2\65"+
		"8\3\2\2\2\66\67\3\2\2\2\66\64\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7@\2\2"+
		":\b\3\2\2\2;?\7(\2\2<>\13\2\2\2=<\3\2\2\2>A\3\2\2\2?@\3\2\2\2?=\3\2\2"+
		"\2@B\3\2\2\2A?\3\2\2\2BC\7=\2\2C\n\3\2\2\2DF\n\2\2\2ED\3\2\2\2FG\3\2\2"+
		"\2GE\3\2\2\2GH\3\2\2\2H\f\3\2\2\2\b\2\25+\66?G\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}