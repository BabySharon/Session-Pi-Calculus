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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, NULL=20, PARALLEL=21, SELECT=22, BRANCH=23, SEQ=24, 
		NEW=25, VAR=26, INT=27, STRING=28, FLOAT=29, CAPS=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "NULL", "PARALLEL", "SELECT", "BRANCH", "SEQ", "NEW", 
			"VAR", "INT", "STRING", "FLOAT", "CAPS", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'{'", "':'", "','", "'}'", "'<'", "'>'", "'('", 
			"')'", "'*'", "'/'", "'+'", "'-'", "'=='", "'TRUE'", "'FALSE'", "'true'", 
			"'false'", "'0'", "'|'", "'select'", "'branch'", "'.'", "'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NULL", "PARALLEL", "SELECT", 
			"BRANCH", "SEQ", "NEW", "VAR", "INT", "STRING", "FLOAT", "CAPS", "WS"
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
		case 25:
			VAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			CAPS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void VAR_action(RuleContext _localctx, int actionIndex) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00b4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\6\34\u0093\n\34\r\34\16\34\u0094\3\35\3"+
		"\35\7\35\u0099\n\35\f\35\16\35\u009c\13\35\3\35\3\35\3\36\6\36\u00a1\n"+
		"\36\r\36\16\36\u00a2\3\36\3\36\6\36\u00a7\n\36\r\36\16\36\u00a8\3\37\3"+
		"\37\3\37\3 \6 \u00af\n \r \16 \u00b0\3 \3 \3\u009a\2!\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\6\3\2c|"+
		"\3\2\62;\3\2C\\\5\2\13\f\17\17\"\"\2\u00b8\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17"+
		"M\3\2\2\2\21O\3\2\2\2\23Q\3\2\2\2\25S\3\2\2\2\27U\3\2\2\2\31W\3\2\2\2"+
		"\33Y\3\2\2\2\35[\3\2\2\2\37]\3\2\2\2!`\3\2\2\2#e\3\2\2\2%k\3\2\2\2\'p"+
		"\3\2\2\2)v\3\2\2\2+x\3\2\2\2-z\3\2\2\2/\u0081\3\2\2\2\61\u0088\3\2\2\2"+
		"\63\u008a\3\2\2\2\65\u008e\3\2\2\2\67\u0092\3\2\2\29\u0096\3\2\2\2;\u00a0"+
		"\3\2\2\2=\u00aa\3\2\2\2?\u00ae\3\2\2\2AB\7]\2\2B\4\3\2\2\2CD\7_\2\2D\6"+
		"\3\2\2\2EF\7}\2\2F\b\3\2\2\2GH\7<\2\2H\n\3\2\2\2IJ\7.\2\2J\f\3\2\2\2K"+
		"L\7\177\2\2L\16\3\2\2\2MN\7>\2\2N\20\3\2\2\2OP\7@\2\2P\22\3\2\2\2QR\7"+
		"*\2\2R\24\3\2\2\2ST\7+\2\2T\26\3\2\2\2UV\7,\2\2V\30\3\2\2\2WX\7\61\2\2"+
		"X\32\3\2\2\2YZ\7-\2\2Z\34\3\2\2\2[\\\7/\2\2\\\36\3\2\2\2]^\7?\2\2^_\7"+
		"?\2\2_ \3\2\2\2`a\7V\2\2ab\7T\2\2bc\7W\2\2cd\7G\2\2d\"\3\2\2\2ef\7H\2"+
		"\2fg\7C\2\2gh\7N\2\2hi\7U\2\2ij\7G\2\2j$\3\2\2\2kl\7v\2\2lm\7t\2\2mn\7"+
		"w\2\2no\7g\2\2o&\3\2\2\2pq\7h\2\2qr\7c\2\2rs\7n\2\2st\7u\2\2tu\7g\2\2"+
		"u(\3\2\2\2vw\7\62\2\2w*\3\2\2\2xy\7~\2\2y,\3\2\2\2z{\7u\2\2{|\7g\2\2|"+
		"}\7n\2\2}~\7g\2\2~\177\7e\2\2\177\u0080\7v\2\2\u0080.\3\2\2\2\u0081\u0082"+
		"\7d\2\2\u0082\u0083\7t\2\2\u0083\u0084\7c\2\2\u0084\u0085\7p\2\2\u0085"+
		"\u0086\7e\2\2\u0086\u0087\7j\2\2\u0087\60\3\2\2\2\u0088\u0089\7\60\2\2"+
		"\u0089\62\3\2\2\2\u008a\u008b\7p\2\2\u008b\u008c\7g\2\2\u008c\u008d\7"+
		"y\2\2\u008d\64\3\2\2\2\u008e\u008f\t\2\2\2\u008f\u0090\b\33\2\2\u0090"+
		"\66\3\2\2\2\u0091\u0093\t\3\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2"+
		"\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u00958\3\2\2\2\u0096\u009a"+
		"\7$\2\2\u0097\u0099\13\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u009e\7$\2\2\u009e:\3\2\2\2\u009f\u00a1\t\3\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a6\7\60\2\2\u00a5\u00a7\t\3\2\2\u00a6\u00a5\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"<\3\2\2\2\u00aa\u00ab\t\4\2\2\u00ab\u00ac\b\37\3\2\u00ac>\3\2\2\2\u00ad"+
		"\u00af\t\5\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\b \4\2\u00b3"+
		"@\3\2\2\2\b\2\u0094\u009a\u00a2\u00a8\u00b0\5\3\33\2\3\37\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}