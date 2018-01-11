// Generated from Keywords.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KeywordsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ID=3, INT=4, CHAR=5, WS=6, BEGIN=7, END=8, IF=9, THEN=10, 
		WHILE=11;
	public static final int
		RULE_stat = 0, RULE_expr = 1;
	public static final String[] ruleNames = {
		"stat", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ID", "INT", "CHAR", "WS", "BEGIN", "END", "IF", "THEN", 
		"WHILE"
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

	@Override
	public String getGrammarFileName() { return "Keywords.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KeywordsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(KeywordsParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(KeywordsParser.END, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode IF() { return getToken(KeywordsParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(KeywordsParser.THEN, 0); }
		public TerminalNode WHILE() { return getToken(KeywordsParser.WHILE, 0); }
		public TerminalNode ID() { return getToken(KeywordsParser.ID, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KeywordsListener ) ((KeywordsListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KeywordsListener ) ((KeywordsListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		int _la;
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(4);
				match(BEGIN);
				setState(8);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << BEGIN) | (1L << IF) | (1L << WHILE))) != 0)) {
					{
					{
					setState(5);
					stat();
					}
					}
					setState(10);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(11);
				match(END);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(IF);
				setState(13);
				expr();
				setState(14);
				match(THEN);
				setState(15);
				stat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(17);
				match(WHILE);
				setState(18);
				expr();
				setState(19);
				stat();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
				match(ID);
				setState(22);
				match(T__0);
				setState(23);
				expr();
				setState(24);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(KeywordsParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(KeywordsParser.CHAR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KeywordsListener ) ((KeywordsListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KeywordsListener ) ((KeywordsListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==CHAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r!\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\7\2\t\n\2\f\2\16\2\f\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\35\n\2\3\3\3\3\3\3\2\2\4\2\4\2\3\3\2\6"+
		"\7\2\"\2\34\3\2\2\2\4\36\3\2\2\2\6\n\7\t\2\2\7\t\5\2\2\2\b\7\3\2\2\2\t"+
		"\f\3\2\2\2\n\b\3\2\2\2\n\13\3\2\2\2\13\r\3\2\2\2\f\n\3\2\2\2\r\35\7\n"+
		"\2\2\16\17\7\13\2\2\17\20\5\4\3\2\20\21\7\f\2\2\21\22\5\2\2\2\22\35\3"+
		"\2\2\2\23\24\7\r\2\2\24\25\5\4\3\2\25\26\5\2\2\2\26\35\3\2\2\2\27\30\7"+
		"\5\2\2\30\31\7\3\2\2\31\32\5\4\3\2\32\33\7\4\2\2\33\35\3\2\2\2\34\6\3"+
		"\2\2\2\34\16\3\2\2\2\34\23\3\2\2\2\34\27\3\2\2\2\35\3\3\2\2\2\36\37\t"+
		"\2\2\2\37\5\3\2\2\2\4\n\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}