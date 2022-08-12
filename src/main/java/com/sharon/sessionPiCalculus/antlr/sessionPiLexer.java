// Generated from sessionPi.g4 by ANTLR 4.7.2
package com.sharon.sessionPiCalculus.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sessionPiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NULL=16, PARALLEL=17, 
		SEQ=18, NEW=19, CHANNEL=20, INT=21, STRING=22, FLOAT=23, CAPS=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "NULL", "PARALLEL", 
			"SEQ", "NEW", "CHANNEL", "INT", "STRING", "FLOAT", "CAPS", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'<'", "'>'", "'('", "')'", "'*'", "'/'", "'+'", 
			"'-'", "'=='", "'TRUE'", "'FALSE'", "'true'", "'false'", "'0'", "'|'", 
			"'.'", "'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "NULL", "PARALLEL", "SEQ", "NEW", "CHANNEL", 
			"INT", "STRING", "FLOAT", "CAPS", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public sessionPiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sessionPi.g4"; }

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
		case 19:
			CHANNEL_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			CAPS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void CHANNEL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
//			1
			break;
		}
	}
	private void CAPS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
//			1
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\6\26q\n\26\r\26\16\26r\3\27\3\27\7\27w\n\27\f\27\16\27z\13\27\3"+
		"\27\3\27\3\30\6\30\177\n\30\r\30\16\30\u0080\3\30\3\30\6\30\u0085\n\30"+
		"\r\30\16\30\u0086\3\31\3\31\3\31\3\32\6\32\u008d\n\32\r\32\16\32\u008e"+
		"\3\32\3\32\3x\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\3\2\6\3\2c|\3\2\62;\3\2C\\\5\2\13\f\17\17\"\"\2\u0096\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t;\3\2\2\2\13=\3\2\2"+
		"\2\r?\3\2\2\2\17A\3\2\2\2\21C\3\2\2\2\23E\3\2\2\2\25G\3\2\2\2\27I\3\2"+
		"\2\2\31L\3\2\2\2\33Q\3\2\2\2\35W\3\2\2\2\37\\\3\2\2\2!b\3\2\2\2#d\3\2"+
		"\2\2%f\3\2\2\2\'h\3\2\2\2)l\3\2\2\2+p\3\2\2\2-t\3\2\2\2/~\3\2\2\2\61\u0088"+
		"\3\2\2\2\63\u008c\3\2\2\2\65\66\7]\2\2\66\4\3\2\2\2\678\7_\2\28\6\3\2"+
		"\2\29:\7>\2\2:\b\3\2\2\2;<\7@\2\2<\n\3\2\2\2=>\7*\2\2>\f\3\2\2\2?@\7+"+
		"\2\2@\16\3\2\2\2AB\7,\2\2B\20\3\2\2\2CD\7\61\2\2D\22\3\2\2\2EF\7-\2\2"+
		"F\24\3\2\2\2GH\7/\2\2H\26\3\2\2\2IJ\7?\2\2JK\7?\2\2K\30\3\2\2\2LM\7V\2"+
		"\2MN\7T\2\2NO\7W\2\2OP\7G\2\2P\32\3\2\2\2QR\7H\2\2RS\7C\2\2ST\7N\2\2T"+
		"U\7U\2\2UV\7G\2\2V\34\3\2\2\2WX\7v\2\2XY\7t\2\2YZ\7w\2\2Z[\7g\2\2[\36"+
		"\3\2\2\2\\]\7h\2\2]^\7c\2\2^_\7n\2\2_`\7u\2\2`a\7g\2\2a \3\2\2\2bc\7\62"+
		"\2\2c\"\3\2\2\2de\7~\2\2e$\3\2\2\2fg\7\60\2\2g&\3\2\2\2hi\7p\2\2ij\7g"+
		"\2\2jk\7y\2\2k(\3\2\2\2lm\t\2\2\2mn\b\25\2\2n*\3\2\2\2oq\t\3\2\2po\3\2"+
		"\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s,\3\2\2\2tx\7$\2\2uw\13\2\2\2vu\3\2"+
		"\2\2wz\3\2\2\2xy\3\2\2\2xv\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7$\2\2|.\3\2"+
		"\2\2}\177\t\3\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\7\60\2\2\u0083\u0085\t\3\2\2"+
		"\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\60\3\2\2\2\u0088\u0089\t\4\2\2\u0089\u008a\b\31\3\2\u008a"+
		"\62\3\2\2\2\u008b\u008d\t\5\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2"+
		"\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091"+
		"\b\32\4\2\u0091\64\3\2\2\2\b\2rx\u0080\u0086\u008e\5\3\25\2\3\31\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}