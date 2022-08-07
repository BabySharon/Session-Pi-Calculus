package com.sharon.sessionPiCalculus.antlr;

// Generated from sessionPi.g4 by ANTLR 4.7.2
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NULL=15, PARALLEL=16, 
		SEQ=17, NEW=18, CHANNEL=19, INT=20, STRING=21, FLOAT=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "NULL", "PARALLEL", "SEQ", 
			"NEW", "CHANNEL", "INT", "STRING", "FLOAT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'!<'", "'>'", "'?('", "'*'", "'/'", "'+'", "'-'", 
			"'=='", "'TRUE'", "'FALSE'", "'true'", "'false'", "'0'", "'|'", "'.'", 
			"'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NULL", "PARALLEL", "SEQ", "NEW", "CHANNEL", "INT", 
			"STRING", "FLOAT", "WS"
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
		case 18:
			CHANNEL_action((RuleContext)_localctx, actionIndex);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\6\25m\n\25\r\25\16"+
		"\25n\3\26\3\26\7\26s\n\26\f\26\16\26v\13\26\3\26\3\26\3\27\6\27{\n\27"+
		"\r\27\16\27|\3\27\3\27\6\27\u0081\n\27\r\27\16\27\u0082\3\30\6\30\u0086"+
		"\n\30\r\30\16\30\u0087\3\30\3\30\3t\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u008f\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2"+
		"\2\5\63\3\2\2\2\7\65\3\2\2\2\t8\3\2\2\2\13:\3\2\2\2\r=\3\2\2\2\17?\3\2"+
		"\2\2\21A\3\2\2\2\23C\3\2\2\2\25E\3\2\2\2\27H\3\2\2\2\31M\3\2\2\2\33S\3"+
		"\2\2\2\35X\3\2\2\2\37^\3\2\2\2!`\3\2\2\2#b\3\2\2\2%d\3\2\2\2\'h\3\2\2"+
		"\2)l\3\2\2\2+p\3\2\2\2-z\3\2\2\2/\u0085\3\2\2\2\61\62\7*\2\2\62\4\3\2"+
		"\2\2\63\64\7+\2\2\64\6\3\2\2\2\65\66\7#\2\2\66\67\7>\2\2\67\b\3\2\2\2"+
		"89\7@\2\29\n\3\2\2\2:;\7A\2\2;<\7*\2\2<\f\3\2\2\2=>\7,\2\2>\16\3\2\2\2"+
		"?@\7\61\2\2@\20\3\2\2\2AB\7-\2\2B\22\3\2\2\2CD\7/\2\2D\24\3\2\2\2EF\7"+
		"?\2\2FG\7?\2\2G\26\3\2\2\2HI\7V\2\2IJ\7T\2\2JK\7W\2\2KL\7G\2\2L\30\3\2"+
		"\2\2MN\7H\2\2NO\7C\2\2OP\7N\2\2PQ\7U\2\2QR\7G\2\2R\32\3\2\2\2ST\7v\2\2"+
		"TU\7t\2\2UV\7w\2\2VW\7g\2\2W\34\3\2\2\2XY\7h\2\2YZ\7c\2\2Z[\7n\2\2[\\"+
		"\7u\2\2\\]\7g\2\2]\36\3\2\2\2^_\7\62\2\2_ \3\2\2\2`a\7~\2\2a\"\3\2\2\2"+
		"bc\7\60\2\2c$\3\2\2\2de\7p\2\2ef\7g\2\2fg\7y\2\2g&\3\2\2\2hi\t\2\2\2i"+
		"j\b\24\2\2j(\3\2\2\2km\t\3\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2"+
		"o*\3\2\2\2pt\7$\2\2qs\13\2\2\2rq\3\2\2\2sv\3\2\2\2tu\3\2\2\2tr\3\2\2\2"+
		"uw\3\2\2\2vt\3\2\2\2wx\7$\2\2x,\3\2\2\2y{\t\3\2\2zy\3\2\2\2{|\3\2\2\2"+
		"|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0080\7\60\2\2\177\u0081\t\3\2\2\u0080"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083.\3\2\2\2\u0084\u0086\t\4\2\2\u0085\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\b\30\3\2\u008a\60\3\2\2\2\b\2nt|\u0082\u0087\4\3\24\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}