// Generated from Keywords.g4 by ANTLR 4.7.1

import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KeywordsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ID=3, INT=4, CHAR=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "ID", "INT", "CHAR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ID", "INT", "CHAR", "WS"
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


	Map<String,Integer> keywords = new HashMap<String,Integer>() {{
	        put("begin", KeywordsParser.BEGIN);
	        put("end",   KeywordsParser.END);
	        put("if",    KeywordsParser.IF);
	        put("then",  KeywordsParser.THEN);
	        put("while", KeywordsParser.WHILE);
	    }};


	public KeywordsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Keywords.g4"; }

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
		case 2:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			            if (keywords.containsKey(getText())) {
			                setType(keywords.get(getText()));    // reset token type
			            }
			        
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 setText(String.valueOf(getText().charAt(1))); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b+\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\6\4\25\n\4"+
		"\r\4\16\4\26\3\4\3\4\3\5\6\5\34\n\5\r\5\16\5\35\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\6\7&\n\7\r\7\16\7\'\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\5\4"+
		"\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2-\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\5\21\3\2\2\2\7"+
		"\24\3\2\2\2\t\33\3\2\2\2\13\37\3\2\2\2\r%\3\2\2\2\17\20\7?\2\2\20\4\3"+
		"\2\2\2\21\22\7=\2\2\22\6\3\2\2\2\23\25\t\2\2\2\24\23\3\2\2\2\25\26\3\2"+
		"\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\b\4\2\2\31\b\3\2"+
		"\2\2\32\34\t\3\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2"+
		"\2\2\36\n\3\2\2\2\37 \7)\2\2 !\13\2\2\2!\"\7)\2\2\"#\b\6\3\2#\f\3\2\2"+
		"\2$&\t\4\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\b"+
		"\7\4\2*\16\3\2\2\2\6\2\26\35\'\5\3\4\2\3\6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}