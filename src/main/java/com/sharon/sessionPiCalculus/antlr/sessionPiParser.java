// Generated from sessionPi.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sessionPiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, NULL=20, PARALLEL=21, SELECT=22, BRANCH=23, SEQ=24, 
		NEW=25, VAR=26, INT=27, STRING=28, FLOAT=29, CAPS=30, WS=31;
	public static final int
		RULE_process = 0, RULE_scopeRestrict = 1, RULE_send = 2, RULE_receive = 3, 
		RULE_payload = 4, RULE_scopeSession = 5, RULE_expr = 6, RULE_bool = 7, 
		RULE_values = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"process", "scopeRestrict", "send", "receive", "payload", "scopeSession", 
			"expr", "bool", "values"
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

	@Override
	public String getGrammarFileName() { return "sessionPi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sessionPiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProcessContext extends ParserRuleContext {
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
	 
		public ProcessContext() { }
		public void copyFrom(ProcessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ScopeSessionLabelContext extends ProcessContext {
		public ScopeSessionContext scopeSession() {
			return getRuleContext(ScopeSessionContext.class,0);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public ScopeSessionLabelContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterScopeSessionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitScopeSessionLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitScopeSessionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InactionContext extends ProcessContext {
		public TerminalNode NULL() { return getToken(sessionPiParser.NULL, 0); }
		public InactionContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterInaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitInaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitInaction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReceiveProcessContext extends ProcessContext {
		public ReceiveContext receive() {
			return getRuleContext(ReceiveContext.class,0);
		}
		public ReceiveProcessContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterReceiveProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitReceiveProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitReceiveProcess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParallelContext extends ProcessContext {
		public List<ProcessContext> process() {
			return getRuleContexts(ProcessContext.class);
		}
		public ProcessContext process(int i) {
			return getRuleContext(ProcessContext.class,i);
		}
		public TerminalNode PARALLEL() { return getToken(sessionPiParser.PARALLEL, 0); }
		public ParallelContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterParallel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitParallel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitParallel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScopeRestrictionContext extends ProcessContext {
		public ScopeRestrictContext scopeRestrict() {
			return getRuleContext(ScopeRestrictContext.class,0);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public ScopeRestrictionContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterScopeRestriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitScopeRestriction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitScopeRestriction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SequentialProcessContext extends ProcessContext {
		public TerminalNode CAPS() { return getToken(sessionPiParser.CAPS, 0); }
		public List<ProcessContext> process() {
			return getRuleContexts(ProcessContext.class);
		}
		public ProcessContext process(int i) {
			return getRuleContext(ProcessContext.class,i);
		}
		public List<TerminalNode> SEQ() { return getTokens(sessionPiParser.SEQ); }
		public TerminalNode SEQ(int i) {
			return getToken(sessionPiParser.SEQ, i);
		}
		public SequentialProcessContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterSequentialProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitSequentialProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitSequentialProcess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BranchProcessContext extends ProcessContext {
		public TerminalNode VAR() { return getToken(sessionPiParser.VAR, 0); }
		public TerminalNode BRANCH() { return getToken(sessionPiParser.BRANCH, 0); }
		public List<TerminalNode> STRING() { return getTokens(sessionPiParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(sessionPiParser.STRING, i);
		}
		public List<ProcessContext> process() {
			return getRuleContexts(ProcessContext.class);
		}
		public ProcessContext process(int i) {
			return getRuleContext(ProcessContext.class,i);
		}
		public BranchProcessContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterBranchProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitBranchProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitBranchProcess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SendProcessContext extends ProcessContext {
		public SendContext send() {
			return getRuleContext(SendContext.class,0);
		}
		public SendProcessContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterSendProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitSendProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitSendProcess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectProcessContext extends ProcessContext {
		public TerminalNode VAR() { return getToken(sessionPiParser.VAR, 0); }
		public TerminalNode SELECT() { return getToken(sessionPiParser.SELECT, 0); }
		public TerminalNode STRING() { return getToken(sessionPiParser.STRING, 0); }
		public TerminalNode SEQ() { return getToken(sessionPiParser.SEQ, 0); }
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public SelectProcessContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterSelectProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitSelectProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitSelectProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessContext process() throws RecognitionException {
		return process(0);
	}

	private ProcessContext process(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProcessContext _localctx = new ProcessContext(_ctx, _parentState);
		ProcessContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_process, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new SequentialProcessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19);
				match(CAPS);
				setState(20);
				match(T__0);
				setState(21);
				process(0);
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEQ) {
					{
					{
					setState(22);
					match(SEQ);
					setState(23);
					process(0);
					}
					}
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(29);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new ScopeRestrictionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				scopeRestrict();
				setState(32);
				process(8);
				}
				break;
			case 3:
				{
				_localctx = new SendProcessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				send();
				}
				break;
			case 4:
				{
				_localctx = new ReceiveProcessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				receive();
				}
				break;
			case 5:
				{
				_localctx = new SelectProcessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(VAR);
				setState(37);
				match(SELECT);
				setState(38);
				match(STRING);
				setState(39);
				match(SEQ);
				setState(40);
				process(5);
				}
				break;
			case 6:
				{
				_localctx = new BranchProcessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(VAR);
				setState(42);
				match(BRANCH);
				setState(43);
				match(T__2);
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(44);
						match(STRING);
						setState(45);
						match(T__3);
						setState(46);
						process(0);
						setState(47);
						match(T__4);
						}
						} 
					}
					setState(53);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(54);
				match(STRING);
				setState(55);
				match(T__3);
				setState(56);
				process(0);
				setState(57);
				match(T__5);
				}
				break;
			case 7:
				{
				_localctx = new ScopeSessionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				scopeSession();
				setState(60);
				process(2);
				}
				break;
			case 8:
				{
				_localctx = new InactionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParallelContext(new ProcessContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_process);
					setState(65);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(66);
					match(PARALLEL);
					setState(67);
					process(4);
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ScopeRestrictContext extends ParserRuleContext {
		public Token c;
		public TerminalNode NEW() { return getToken(sessionPiParser.NEW, 0); }
		public TerminalNode VAR() { return getToken(sessionPiParser.VAR, 0); }
		public ScopeRestrictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeRestrict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterScopeRestrict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitScopeRestrict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitScopeRestrict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeRestrictContext scopeRestrict() throws RecognitionException {
		ScopeRestrictContext _localctx = new ScopeRestrictContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scopeRestrict);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(NEW);
			setState(74);
			((ScopeRestrictContext)_localctx).c = match(VAR);
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

	public static class SendContext extends ParserRuleContext {
		public Token channel;
		public PayloadContext payload() {
			return getRuleContext(PayloadContext.class,0);
		}
		public TerminalNode VAR() { return getToken(sessionPiParser.VAR, 0); }
		public SendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_send; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterSend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitSend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitSend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SendContext send() throws RecognitionException {
		SendContext _localctx = new SendContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_send);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((SendContext)_localctx).channel = match(VAR);
			setState(77);
			match(T__6);
			setState(78);
			payload();
			setState(79);
			match(T__7);
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

	public static class ReceiveContext extends ParserRuleContext {
		public Token channel;
		public PayloadContext payload() {
			return getRuleContext(PayloadContext.class,0);
		}
		public TerminalNode VAR() { return getToken(sessionPiParser.VAR, 0); }
		public ReceiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterReceive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitReceive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitReceive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiveContext receive() throws RecognitionException {
		ReceiveContext _localctx = new ReceiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_receive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			((ReceiveContext)_localctx).channel = match(VAR);
			setState(82);
			match(T__8);
			setState(83);
			payload();
			setState(84);
			match(T__9);
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

	public static class PayloadContext extends ParserRuleContext {
		public PayloadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_payload; }
	 
		public PayloadContext() { }
		public void copyFrom(PayloadContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringPayloadContext extends PayloadContext {
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public StringPayloadContext(PayloadContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterStringPayload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitStringPayload(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitStringPayload(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPayloadContext extends PayloadContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprPayloadContext(PayloadContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterExprPayload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitExprPayload(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitExprPayload(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChannelPayloadContext extends PayloadContext {
		public TerminalNode VAR() { return getToken(sessionPiParser.VAR, 0); }
		public ChannelPayloadContext(PayloadContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterChannelPayload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitChannelPayload(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitChannelPayload(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PayloadContext payload() throws RecognitionException {
		PayloadContext _localctx = new PayloadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_payload);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ExprPayloadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				expr(0);
				}
				break;
			case 2:
				_localctx = new StringPayloadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				values();
				}
				break;
			case 3:
				_localctx = new ChannelPayloadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(VAR);
				}
				break;
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

	public static class ScopeSessionContext extends ParserRuleContext {
		public Token x;
		public Token y;
		public TerminalNode NEW() { return getToken(sessionPiParser.NEW, 0); }
		public List<TerminalNode> VAR() { return getTokens(sessionPiParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(sessionPiParser.VAR, i);
		}
		public ScopeSessionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeSession; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterScopeSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitScopeSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitScopeSession(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeSessionContext scopeSession() throws RecognitionException {
		ScopeSessionContext _localctx = new ScopeSessionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scopeSession);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(NEW);
			setState(92);
			((ScopeSessionContext)_localctx).x = match(VAR);
			setState(93);
			((ScopeSessionContext)_localctx).y = match(VAR);
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
		public Token op;
		public TerminalNode INT() { return getToken(sessionPiParser.INT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(96);
				match(INT);
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				{
				setState(97);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(101);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(102);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(104);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(105);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(107);
						((ExprContext)_localctx).op = match(T__14);
						setState(108);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
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

	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(sessionPiParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(sessionPiParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(sessionPiParser.STRING, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_values);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(STRING);
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				bool();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return process_sempred((ProcessContext)_localctx, predIndex);
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean process_sempred(ProcessContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!}\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\64\n\2\f\2\16\2\67"+
		"\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2B\n\2\3\2\3\2\3\2\7\2G\n"+
		"\2\f\2\16\2J\13\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\be\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bp\n\b\f\b\16\bs\13\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\5\n{\n\n\3\n\2\4\2\16\13\2\4\6\b\n\f\16\20\22\2\5\3\2\r\16\3\2\17"+
		"\20\3\2\22\25\2\u0086\2A\3\2\2\2\4K\3\2\2\2\6N\3\2\2\2\bS\3\2\2\2\n[\3"+
		"\2\2\2\f]\3\2\2\2\16d\3\2\2\2\20t\3\2\2\2\22z\3\2\2\2\24\25\b\2\1\2\25"+
		"\26\7 \2\2\26\27\7\3\2\2\27\34\5\2\2\2\30\31\7\32\2\2\31\33\5\2\2\2\32"+
		"\30\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36"+
		"\34\3\2\2\2\37 \7\4\2\2 B\3\2\2\2!\"\5\4\3\2\"#\5\2\2\n#B\3\2\2\2$B\5"+
		"\6\4\2%B\5\b\5\2&\'\7\34\2\2\'(\7\30\2\2()\7\36\2\2)*\7\32\2\2*B\5\2\2"+
		"\7+,\7\34\2\2,-\7\31\2\2-\65\7\5\2\2./\7\36\2\2/\60\7\6\2\2\60\61\5\2"+
		"\2\2\61\62\7\7\2\2\62\64\3\2\2\2\63.\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2"+
		"\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\36\2\29:\7\6\2\2:;\5\2"+
		"\2\2;<\7\b\2\2<B\3\2\2\2=>\5\f\7\2>?\5\2\2\4?B\3\2\2\2@B\7\26\2\2A\24"+
		"\3\2\2\2A!\3\2\2\2A$\3\2\2\2A%\3\2\2\2A&\3\2\2\2A+\3\2\2\2A=\3\2\2\2A"+
		"@\3\2\2\2BH\3\2\2\2CD\f\5\2\2DE\7\27\2\2EG\5\2\2\6FC\3\2\2\2GJ\3\2\2\2"+
		"HF\3\2\2\2HI\3\2\2\2I\3\3\2\2\2JH\3\2\2\2KL\7\33\2\2LM\7\34\2\2M\5\3\2"+
		"\2\2NO\7\34\2\2OP\7\t\2\2PQ\5\n\6\2QR\7\n\2\2R\7\3\2\2\2ST\7\34\2\2TU"+
		"\7\13\2\2UV\5\n\6\2VW\7\f\2\2W\t\3\2\2\2X\\\5\16\b\2Y\\\5\22\n\2Z\\\7"+
		"\34\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\13\3\2\2\2]^\7\33\2\2^_\7\34\2"+
		"\2_`\7\34\2\2`\r\3\2\2\2ab\b\b\1\2be\7\35\2\2ce\5\20\t\2da\3\2\2\2dc\3"+
		"\2\2\2eq\3\2\2\2fg\f\7\2\2gh\t\2\2\2hp\5\16\b\bij\f\6\2\2jk\t\3\2\2kp"+
		"\5\16\b\7lm\f\5\2\2mn\7\21\2\2np\5\16\b\6of\3\2\2\2oi\3\2\2\2ol\3\2\2"+
		"\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\17\3\2\2\2sq\3\2\2\2tu\t\4\2\2u\21\3"+
		"\2\2\2v{\7\35\2\2w{\7\37\2\2x{\7\36\2\2y{\5\20\t\2zv\3\2\2\2zw\3\2\2\2"+
		"zx\3\2\2\2zy\3\2\2\2{\23\3\2\2\2\13\34\65AH[doqz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}