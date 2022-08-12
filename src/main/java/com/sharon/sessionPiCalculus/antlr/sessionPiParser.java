// Generated from sessionPi.g4 by ANTLR 4.7.2
package com.sharon.sessionPiCalculus.antlr;

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NULL=16, PARALLEL=17, 
		SEQ=18, NEW=19, VAR=20, INT=21, STRING=22, FLOAT=23, CAPS=24, WS=25;
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
			null, "'['", "']'", "'<'", "'>'", "'('", "')'", "'*'", "'/'", "'+'", 
			"'-'", "'=='", "'TRUE'", "'FALSE'", "'true'", "'false'", "'0'", "'|'", 
			"'.'", "'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "NULL", "PARALLEL", "SEQ", "NEW", "VAR",
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
		public String toString() {
			return "ScopeSessionLabelContext";
		}

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
		public String toString() {
			return "InactionContext";
		}

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
		public ReceiveProcessContext(ProcessContext ctx) { copyFrom(ctx); }

		@Override
		public String toString() {
			return "ReceiveProcessContext";
		}

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
		public String toString() {
			return "ParallelContext";
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterParallel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitParallel(this);
		}

		public List<String> getProcessNames(){
			List<String> names = new ArrayList<>();
			for (ProcessContext context:process()) {
				if(context.toString().equals("SequentialProcessContext"))
					names.add(((SequentialProcessContext)context).CAPS().getText());
			}
			return names;
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
		public String toString() {
			return "ScopeRestrictionContext";
		}

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
		@Override
		public String toString() {
			return "SequentialProcessContext";
		}

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
	}
	public static class SendProcessContext extends ProcessContext {
		public SendContext send() {
			return getRuleContext(SendContext.class,0);
		}
		public SendProcessContext(ProcessContext ctx) { copyFrom(ctx); }

		@Override
		public String toString() {
			return "SendProcessContext";
		}

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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
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
				process(6);
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
				_localctx = new ScopeSessionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				scopeSession();
				setState(37);
				process(2);
				}
				break;
			case 6:
				{
				_localctx = new InactionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
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
					setState(42);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(43);
					match(PARALLEL);
					setState(44);
					process(4);
					}
					} 
				}
				setState(49);
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
		public TerminalNode VAR() { return getToken(sessionPiParser.VAR, 0); }
		public ScopeRestrictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public String toString() {
			return "ScopeRestrictContext";
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
			setState(50);
			match(NEW);
			setState(51);
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
		public Token VAR;
		public PayloadContext payload() {
			return getRuleContext(PayloadContext.class,0);
		}
		public TerminalNode VAR() { return getToken(sessionPiParser.VAR, 0); }
		public SendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public String toString() {
			return "SendContext";
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
			setState(53);
			((SendContext)_localctx).VAR = match(VAR);
			setState(54);
			match(T__2);
			setState(55);
			payload();
			setState(56);
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
		public Token VAR;
		public PayloadContext payload() {
			return getRuleContext(PayloadContext.class,0);
		}
		public TerminalNode VAR() { return getToken(sessionPiParser.VAR, 0); }
		public ReceiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public String toString() {
			return "ReceiveContext";
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
			setState(58);
			((ReceiveContext)_localctx).VAR = match(VAR);
			setState(59);
			match(T__4);
			setState(60);
			payload();
			setState(61);
			match(T__5);
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

		@Override
		public String toString() {
			return "PayloadContext";
		}

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
		public String toString() {
			return "StringPayloadContext{}";
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
		public String toString() {
			return "ExprPayloadContext";
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitExprPayload(this);
		}
	}
	public static class VarPayloadContext extends PayloadContext {
		public TerminalNode VAR() { return getToken(sessionPiParser.VAR, 0); }
		public VarPayloadContext(PayloadContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterVarPayload(this);
		}

		@Override
		public String toString() {
			return "VAR";
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitVarPayload(this);
		}
	}

	public final PayloadContext payload() throws RecognitionException {
		PayloadContext _localctx = new PayloadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_payload);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ExprPayloadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				expr(0);
				}
				break;
			case 2:
				_localctx = new StringPayloadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				values();
				}
				break;
			case 3:
				_localctx = new VarPayloadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
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
		public String toString() {
			return "ScopeSessionContext";
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
			setState(68);
			match(NEW);
			setState(69);
			((ScopeSessionContext)_localctx).x = match(VAR);
			setState(70);
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

		@Override
		public String toString() {
			return "ExprContext";
		}

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
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(73);
				match(INT);
				}
				break;
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				{
				setState(74);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(86);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(77);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(78);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(79);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(80);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(81);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(82);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(83);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(84);
						((ExprContext)_localctx).op = match(T__10);
						setState(85);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(90);
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
		public String toString() {
			return "BoolContext{}";
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
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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
		public String toString() {
			return "ValuesContext{}";
		}

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
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(STRING);
				}
				break;
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33f\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2+\n\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2\63\13\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6E\n\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bN\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\bY\n\b\f\b\16\b\\\13\b\3\t\3\t\3\n\3\n\3\n\3\n\5\nd\n\n\3\n\2\4\2"+
		"\16\13\2\4\6\b\n\f\16\20\22\2\5\3\2\t\n\3\2\13\f\3\2\16\21\2l\2*\3\2\2"+
		"\2\4\64\3\2\2\2\6\67\3\2\2\2\b<\3\2\2\2\nD\3\2\2\2\fF\3\2\2\2\16M\3\2"+
		"\2\2\20]\3\2\2\2\22c\3\2\2\2\24\25\b\2\1\2\25\26\7\32\2\2\26\27\7\3\2"+
		"\2\27\34\5\2\2\2\30\31\7\24\2\2\31\33\5\2\2\2\32\30\3\2\2\2\33\36\3\2"+
		"\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\4\2"+
		"\2 +\3\2\2\2!\"\5\4\3\2\"#\5\2\2\b#+\3\2\2\2$+\5\6\4\2%+\5\b\5\2&\'\5"+
		"\f\7\2\'(\5\2\2\4(+\3\2\2\2)+\7\22\2\2*\24\3\2\2\2*!\3\2\2\2*$\3\2\2\2"+
		"*%\3\2\2\2*&\3\2\2\2*)\3\2\2\2+\61\3\2\2\2,-\f\5\2\2-.\7\23\2\2.\60\5"+
		"\2\2\6/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2"+
		"\63\61\3\2\2\2\64\65\7\25\2\2\65\66\7\26\2\2\66\5\3\2\2\2\678\7\26\2\2"+
		"89\7\5\2\29:\5\n\6\2:;\7\6\2\2;\7\3\2\2\2<=\7\26\2\2=>\7\7\2\2>?\5\n\6"+
		"\2?@\7\b\2\2@\t\3\2\2\2AE\5\16\b\2BE\5\22\n\2CE\7\26\2\2DA\3\2\2\2DB\3"+
		"\2\2\2DC\3\2\2\2E\13\3\2\2\2FG\7\25\2\2GH\7\26\2\2HI\7\26\2\2I\r\3\2\2"+
		"\2JK\b\b\1\2KN\7\27\2\2LN\5\20\t\2MJ\3\2\2\2ML\3\2\2\2NZ\3\2\2\2OP\f\7"+
		"\2\2PQ\t\2\2\2QY\5\16\b\bRS\f\6\2\2ST\t\3\2\2TY\5\16\b\7UV\f\5\2\2VW\7"+
		"\r\2\2WY\5\16\b\6XO\3\2\2\2XR\3\2\2\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z"+
		"[\3\2\2\2[\17\3\2\2\2\\Z\3\2\2\2]^\t\4\2\2^\21\3\2\2\2_d\7\27\2\2`d\7"+
		"\31\2\2ad\7\30\2\2bd\5\20\t\2c_\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2"+
		"d\23\3\2\2\2\n\34*\61DMXZc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}