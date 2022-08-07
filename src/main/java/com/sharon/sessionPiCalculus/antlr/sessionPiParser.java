package com.sharon.sessionPiCalculus.antlr;

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NULL=15, PARALLEL=16, 
		SEQ=17, NEW=18, CHANNEL=19, INT=20, STRING=21, FLOAT=22, WS=23;
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
	}
	public static class ReceiveProcessContext extends ProcessContext {
		public ReceiveContext receive() {
			return getRuleContext(ReceiveContext.class,0);
		}
		public TerminalNode SEQ() { return getToken(sessionPiParser.SEQ, 0); }
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
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
	}
	public static class SequentialProcessContext extends ProcessContext {
		public List<ProcessContext> process() {
			return getRuleContexts(ProcessContext.class);
		}
		public ProcessContext process(int i) {
			return getRuleContext(ProcessContext.class,i);
		}
		public TerminalNode SEQ() { return getToken(sessionPiParser.SEQ, 0); }
		public SequentialProcessContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterSequentialProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitSequentialProcess(this);
		}
	}
	public static class SendProcessContext extends ProcessContext {
		public SendContext send() {
			return getRuleContext(SendContext.class,0);
		}
		public TerminalNode SEQ() { return getToken(sessionPiParser.SEQ, 0); }
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new SequentialProcessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19);
				match(T__0);
				setState(20);
				process(0);
				setState(21);
				match(T__1);
				setState(24);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(22);
					match(SEQ);
					setState(23);
					process(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new ScopeRestrictionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				scopeRestrict();
				setState(27);
				process(6);
				}
				break;
			case 3:
				{
				_localctx = new SendProcessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				send();
				setState(30);
				match(SEQ);
				setState(31);
				process(5);
				}
				break;
			case 4:
				{
				_localctx = new ReceiveProcessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				receive();
				setState(34);
				match(SEQ);
				setState(35);
				process(4);
				}
				break;
			case 5:
				{
				_localctx = new ScopeSessionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				scopeSession();
				setState(38);
				process(2);
				}
				break;
			case 6:
				{
				_localctx = new InactionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParallelContext(new ProcessContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_process);
					setState(43);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(44);
					match(PARALLEL);
					setState(45);
					process(4);
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public TerminalNode CHANNEL() { return getToken(sessionPiParser.CHANNEL, 0); }
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
	}

	public final ScopeRestrictContext scopeRestrict() throws RecognitionException {
		ScopeRestrictContext _localctx = new ScopeRestrictContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scopeRestrict);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(NEW);
			setState(52);
			((ScopeRestrictContext)_localctx).c = match(CHANNEL);
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
		public TerminalNode CHANNEL() { return getToken(sessionPiParser.CHANNEL, 0); }
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
	}

	public final SendContext send() throws RecognitionException {
		SendContext _localctx = new SendContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_send);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			((SendContext)_localctx).channel = match(CHANNEL);
			setState(55);
			match(T__2);
			setState(56);
			payload();
			setState(57);
			match(T__3);
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
		public TerminalNode CHANNEL() { return getToken(sessionPiParser.CHANNEL, 0); }
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
	}

	public final ReceiveContext receive() throws RecognitionException {
		ReceiveContext _localctx = new ReceiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_receive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((ReceiveContext)_localctx).channel = match(CHANNEL);
			setState(60);
			match(T__4);
			setState(61);
			payload();
			setState(62);
			match(T__1);
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
	}
	public static class ChannelPayloadContext extends PayloadContext {
		public TerminalNode CHANNEL() { return getToken(sessionPiParser.CHANNEL, 0); }
		public ChannelPayloadContext(PayloadContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterChannelPayload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitChannelPayload(this);
		}
	}

	public final PayloadContext payload() throws RecognitionException {
		PayloadContext _localctx = new PayloadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_payload);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ExprPayloadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				expr(0);
				}
				break;
			case 2:
				_localctx = new StringPayloadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				values();
				}
				break;
			case 3:
				_localctx = new ChannelPayloadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(CHANNEL);
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
		public List<TerminalNode> CHANNEL() { return getTokens(sessionPiParser.CHANNEL); }
		public TerminalNode CHANNEL(int i) {
			return getToken(sessionPiParser.CHANNEL, i);
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
	}

	public final ScopeSessionContext scopeSession() throws RecognitionException {
		ScopeSessionContext _localctx = new ScopeSessionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scopeSession);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(NEW);
			setState(70);
			((ScopeSessionContext)_localctx).x = match(CHANNEL);
			setState(71);
			((ScopeSessionContext)_localctx).y = match(CHANNEL);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(74);
				match(INT);
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case T__13:
				{
				setState(75);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(87);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(78);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(79);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(80);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(81);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(82);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(83);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(84);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(85);
						((ExprContext)_localctx).op = match(T__9);
						setState(86);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_values);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(STRING);
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31g\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2\33\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2,\n\2\3\2\3\2\3\2\7\2\61\n\2\f\2\16\2\64\13\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6F\n\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bO\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\bZ\n\b\f\b\16\b]\13\b\3\t\3\t\3\n\3\n\3\n\3\n\5\ne\n\n\3\n\2\4\2"+
		"\16\13\2\4\6\b\n\f\16\20\22\2\5\3\2\b\t\3\2\n\13\3\2\r\20\2m\2+\3\2\2"+
		"\2\4\65\3\2\2\2\68\3\2\2\2\b=\3\2\2\2\nE\3\2\2\2\fG\3\2\2\2\16N\3\2\2"+
		"\2\20^\3\2\2\2\22d\3\2\2\2\24\25\b\2\1\2\25\26\7\3\2\2\26\27\5\2\2\2\27"+
		"\32\7\4\2\2\30\31\7\23\2\2\31\33\5\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33"+
		",\3\2\2\2\34\35\5\4\3\2\35\36\5\2\2\b\36,\3\2\2\2\37 \5\6\4\2 !\7\23\2"+
		"\2!\"\5\2\2\7\",\3\2\2\2#$\5\b\5\2$%\7\23\2\2%&\5\2\2\6&,\3\2\2\2\'(\5"+
		"\f\7\2()\5\2\2\4),\3\2\2\2*,\7\21\2\2+\24\3\2\2\2+\34\3\2\2\2+\37\3\2"+
		"\2\2+#\3\2\2\2+\'\3\2\2\2+*\3\2\2\2,\62\3\2\2\2-.\f\5\2\2./\7\22\2\2/"+
		"\61\5\2\2\6\60-\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\3"+
		"\3\2\2\2\64\62\3\2\2\2\65\66\7\24\2\2\66\67\7\25\2\2\67\5\3\2\2\289\7"+
		"\25\2\29:\7\5\2\2:;\5\n\6\2;<\7\6\2\2<\7\3\2\2\2=>\7\25\2\2>?\7\7\2\2"+
		"?@\5\n\6\2@A\7\4\2\2A\t\3\2\2\2BF\5\16\b\2CF\5\22\n\2DF\7\25\2\2EB\3\2"+
		"\2\2EC\3\2\2\2ED\3\2\2\2F\13\3\2\2\2GH\7\24\2\2HI\7\25\2\2IJ\7\25\2\2"+
		"J\r\3\2\2\2KL\b\b\1\2LO\7\26\2\2MO\5\20\t\2NK\3\2\2\2NM\3\2\2\2O[\3\2"+
		"\2\2PQ\f\7\2\2QR\t\2\2\2RZ\5\16\b\bST\f\6\2\2TU\t\3\2\2UZ\5\16\b\7VW\f"+
		"\5\2\2WX\7\f\2\2XZ\5\16\b\6YP\3\2\2\2YS\3\2\2\2YV\3\2\2\2Z]\3\2\2\2[Y"+
		"\3\2\2\2[\\\3\2\2\2\\\17\3\2\2\2][\3\2\2\2^_\t\4\2\2_\21\3\2\2\2`e\7\26"+
		"\2\2ae\7\30\2\2be\7\27\2\2ce\5\20\t\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2dc"+
		"\3\2\2\2e\23\3\2\2\2\n\32+\62ENY[d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}