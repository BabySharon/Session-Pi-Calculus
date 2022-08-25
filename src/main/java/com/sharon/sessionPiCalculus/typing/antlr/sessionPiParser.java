// Generated from sessionPi.g4 by ANTLR 4.7.2
package com.sharon.sessionPiCalculus.typing.antlr;

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
		NEW=25, VAR=26, INT=27, FLOAT=28, CAPS=29, IDENTIFIER=30, STRING=31, WS=32;
	public static final int
		RULE_process = 0, RULE_scopeRestrict = 1, RULE_send = 2, RULE_receive = 3, 
		RULE_payload = 4, RULE_scopeSession = 5, RULE_branch = 6, RULE_expr = 7, 
		RULE_bool = 8, RULE_values = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"process", "scopeRestrict", "send", "receive", "payload", "scopeSession", 
			"branch", "expr", "bool", "values"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'('", "')'", "'{'", "','", "'}'", "'<'", "'>'", 
			"':'", "'*'", "'/'", "'+'", "'-'", "'=='", "'TRUE'", "'FALSE'", "'true'", 
			"'false'", "'zero'", "'|'", "'select'", "'branch'", "'.'", "'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NULL", "PARALLEL", "SELECT", 
			"BRANCH", "SEQ", "NEW", "VAR", "INT", "FLOAT", "CAPS", "IDENTIFIER", 
			"STRING", "WS"
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

		@Override
		public String toString() {
			return "ProcessContext";
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
		public String toString() {
			return "ScopeSessionLabelContext";
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
		public String toString() {
			return "InactionContext";
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
		public String toString() {
			return "ReceiveProcessContext";
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
		public String toString() {
			return "ParallelContext";
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
		public String toString() {
			return "ScopeRestrictionContext";
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
		public String toString() {
			return "SequentialProcessContext";
		}
	}
	public static class BranchProcessContext extends ProcessContext {
		public TerminalNode VAR() { return getToken(sessionPiParser.VAR, 0); }
		public TerminalNode BRANCH() { return getToken(sessionPiParser.BRANCH, 0); }
		public List<BranchContext> branch() {
			return getRuleContexts(BranchContext.class);
		}
		public BranchContext branch(int i) {
			return getRuleContext(BranchContext.class,i);
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
		public String toString() {
			return "BranchProcessContext";
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
		public String toString() {
			return "SendProcessContext";
		}
	}
	public static class SelectProcessContext extends ProcessContext {
		public TerminalNode VAR() { return getToken(sessionPiParser.VAR, 0); }
		public TerminalNode SELECT() { return getToken(sessionPiParser.SELECT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(sessionPiParser.IDENTIFIER, 0); }
		public List<TerminalNode> SEQ() { return getTokens(sessionPiParser.SEQ); }
		public TerminalNode SEQ(int i) {
			return getToken(sessionPiParser.SEQ, i);
		}
		public List<ProcessContext> process() {
			return getRuleContexts(ProcessContext.class);
		}
		public ProcessContext process(int i) {
			return getRuleContext(ProcessContext.class,i);
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
		public String toString() {
			return "SelectProcessContext";
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
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new SequentialProcessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(21);
				match(CAPS);
				setState(22);
				match(T__0);
				setState(23);
				process(0);
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEQ) {
					{
					{
					setState(24);
					match(SEQ);
					setState(25);
					process(0);
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(31);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new ScopeRestrictionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				scopeRestrict();
				setState(34);
				process(8);
				}
				break;
			case 3:
				{
				_localctx = new SendProcessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				send();
				}
				break;
			case 4:
				{
				_localctx = new ReceiveProcessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				receive();
				}
				break;
			case 5:
				{
				_localctx = new SelectProcessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(VAR);
				setState(39);
				match(SELECT);
				setState(40);
				match(IDENTIFIER);
				setState(41);
				match(SEQ);
				setState(42);
				match(T__2);
				setState(43);
				process(0);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEQ) {
					{
					{
					setState(44);
					match(SEQ);
					setState(45);
					process(0);
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new BranchProcessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(VAR);
				setState(54);
				match(BRANCH);
				setState(55);
				match(T__4);
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(56);
						branch();
						setState(57);
						match(T__5);
						}
						} 
					}
					setState(63);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(64);
				branch();
				setState(65);
				match(T__6);
				}
				break;
			case 7:
				{
				_localctx = new ScopeSessionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				scopeSession();
				setState(68);
				process(2);
				}
				break;
			case 8:
				{
				_localctx = new InactionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParallelContext(new ProcessContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_process);
					setState(73);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(74);
					match(PARALLEL);
					setState(75);
					process(4);
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public String toString() {
			return "ScopeRestrictContext";
		}
	}

	public final ScopeRestrictContext scopeRestrict() throws RecognitionException {
		ScopeRestrictContext _localctx = new ScopeRestrictContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scopeRestrict);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(NEW);
			setState(82);
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
		public String toString() {
			return "SendContext";
		}
	}

	public final SendContext send() throws RecognitionException {
		SendContext _localctx = new SendContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_send);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((SendContext)_localctx).channel = match(VAR);
			setState(85);
			match(T__7);
			setState(86);
			payload();
			setState(87);
			match(T__8);
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
		public String toString() {
			return "ReceiveContext";
		}
	}

	public final ReceiveContext receive() throws RecognitionException {
		ReceiveContext _localctx = new ReceiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_receive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((ReceiveContext)_localctx).channel = match(VAR);
			setState(90);
			match(T__2);
			setState(91);
			payload();
			setState(92);
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

	public static class PayloadContext extends ParserRuleContext {
		public PayloadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_payload; }
	 
		public PayloadContext() { }
		public void copyFrom(PayloadContext ctx) {
			super.copyFrom(ctx);
		}

		@Override
		public String toString() {
			return "PayloadContext";
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
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitVarPayload(this);
		}

		@Override
		public String toString() {
			return "VarPayloadContext";
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
		public String toString() {
			return "StringPayloadContext";
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
		public String toString() {
			return "ExprPayloadContext";
		}
	}

	public final PayloadContext payload() throws RecognitionException {
		PayloadContext _localctx = new PayloadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_payload);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ExprPayloadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				expr(0);
				}
				break;
			case 2:
				_localctx = new StringPayloadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				values();
				}
				break;
			case 3:
				_localctx = new VarPayloadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
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
		public String toString() {
			return "ScopeSessionContext";
		}
	}

	public final ScopeSessionContext scopeSession() throws RecognitionException {
		ScopeSessionContext _localctx = new ScopeSessionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scopeSession);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(NEW);
			setState(100);
			((ScopeSessionContext)_localctx).x = match(VAR);
			setState(101);
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

	public static class BranchContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(sessionPiParser.IDENTIFIER, 0); }
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
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sessionPiListener ) ((sessionPiListener)listener).exitBranch(this);
		}

		@Override
		public String toString() {
			return "BranchContext";
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(IDENTIFIER);
			setState(104);
			match(T__9);
			setState(105);
			process(0);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEQ) {
				{
				{
				setState(106);
				match(SEQ);
				setState(107);
				process(0);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		public String toString() {
			return "ExprContext";
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(114);
				match(INT);
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				{
				setState(115);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(118);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(119);
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
						setState(120);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(121);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(122);
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
						setState(123);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(124);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(125);
						((ExprContext)_localctx).op = match(T__14);
						setState(126);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public String toString() {
			return "BoolContext";
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_values);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(STRING);
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
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
		case 7:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u008f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\61\n\2\f\2\16\2\64\13"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2>\n\2\f\2\16\2A\13\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\5\2J\n\2\3\2\3\2\3\2\7\2O\n\2\f\2\16\2R\13\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6d\n\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bo\n\b\f\b\16\br\13\b\3\t\3\t\3\t\5"+
		"\tw\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0082\n\t\f\t\16\t\u0085"+
		"\13\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u008d\n\13\3\13\2\4\2\20\f\2\4"+
		"\6\b\n\f\16\20\22\24\2\5\3\2\r\16\3\2\17\20\3\2\22\25\2\u0099\2I\3\2\2"+
		"\2\4S\3\2\2\2\6V\3\2\2\2\b[\3\2\2\2\nc\3\2\2\2\fe\3\2\2\2\16i\3\2\2\2"+
		"\20v\3\2\2\2\22\u0086\3\2\2\2\24\u008c\3\2\2\2\26\27\b\2\1\2\27\30\7\37"+
		"\2\2\30\31\7\3\2\2\31\36\5\2\2\2\32\33\7\32\2\2\33\35\5\2\2\2\34\32\3"+
		"\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2"+
		"!\"\7\4\2\2\"J\3\2\2\2#$\5\4\3\2$%\5\2\2\n%J\3\2\2\2&J\5\6\4\2\'J\5\b"+
		"\5\2()\7\34\2\2)*\7\30\2\2*+\7 \2\2+,\7\32\2\2,-\7\5\2\2-\62\5\2\2\2."+
		"/\7\32\2\2/\61\5\2\2\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3"+
		"\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\6\2\2\66J\3\2\2\2\678\7\34"+
		"\2\289\7\31\2\29?\7\7\2\2:;\5\16\b\2;<\7\b\2\2<>\3\2\2\2=:\3\2\2\2>A\3"+
		"\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\5\16\b\2CD\7\t\2\2DJ"+
		"\3\2\2\2EF\5\f\7\2FG\5\2\2\4GJ\3\2\2\2HJ\7\26\2\2I\26\3\2\2\2I#\3\2\2"+
		"\2I&\3\2\2\2I\'\3\2\2\2I(\3\2\2\2I\67\3\2\2\2IE\3\2\2\2IH\3\2\2\2JP\3"+
		"\2\2\2KL\f\5\2\2LM\7\27\2\2MO\5\2\2\6NK\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ"+
		"\3\2\2\2Q\3\3\2\2\2RP\3\2\2\2ST\7\33\2\2TU\7\34\2\2U\5\3\2\2\2VW\7\34"+
		"\2\2WX\7\n\2\2XY\5\n\6\2YZ\7\13\2\2Z\7\3\2\2\2[\\\7\34\2\2\\]\7\5\2\2"+
		"]^\5\n\6\2^_\7\6\2\2_\t\3\2\2\2`d\5\20\t\2ad\5\24\13\2bd\7\34\2\2c`\3"+
		"\2\2\2ca\3\2\2\2cb\3\2\2\2d\13\3\2\2\2ef\7\33\2\2fg\7\34\2\2gh\7\34\2"+
		"\2h\r\3\2\2\2ij\7 \2\2jk\7\f\2\2kp\5\2\2\2lm\7\32\2\2mo\5\2\2\2nl\3\2"+
		"\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\17\3\2\2\2rp\3\2\2\2st\b\t\1\2tw\7"+
		"\35\2\2uw\5\22\n\2vs\3\2\2\2vu\3\2\2\2w\u0083\3\2\2\2xy\f\7\2\2yz\t\2"+
		"\2\2z\u0082\5\20\t\b{|\f\6\2\2|}\t\3\2\2}\u0082\5\20\t\7~\177\f\5\2\2"+
		"\177\u0080\7\21\2\2\u0080\u0082\5\20\t\6\u0081x\3\2\2\2\u0081{\3\2\2\2"+
		"\u0081~\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3"+
		"\2\2\2\u0084\21\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\t\4\2\2\u0087"+
		"\23\3\2\2\2\u0088\u008d\7\35\2\2\u0089\u008d\7\36\2\2\u008a\u008d\7!\2"+
		"\2\u008b\u008d\5\22\n\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\25\3\2\2\2\r\36\62?IPcpv\u0081"+
		"\u0083\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}