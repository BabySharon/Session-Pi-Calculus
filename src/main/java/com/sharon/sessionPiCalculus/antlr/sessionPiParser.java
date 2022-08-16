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
			null, "'['", "']'", "'{'", "','", "'}'", "'<'", "'>'", "'('", "')'", 
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
		public TerminalNode IDENTIFIER() { return getToken(sessionPiParser.IDENTIFIER, 0); }
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
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
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
				process(5);
				}
				break;
			case 6:
				{
				_localctx = new BranchProcessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(VAR);
				setState(44);
				match(BRANCH);
				setState(45);
				match(T__2);
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(46);
						branch();
						setState(47);
						match(T__3);
						}
						} 
					}
					setState(53);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(54);
				branch();
				setState(55);
				match(T__4);
				}
				break;
			case 7:
				{
				_localctx = new ScopeSessionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				scopeSession();
				setState(58);
				process(2);
				}
				break;
			case 8:
				{
				_localctx = new InactionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
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
					setState(63);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(64);
					match(PARALLEL);
					setState(65);
					process(4);
					}
					} 
				}
				setState(70);
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
			setState(71);
			match(NEW);
			setState(72);
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
			setState(74);
			((SendContext)_localctx).channel = match(VAR);
			setState(75);
			match(T__5);
			setState(76);
			payload();
			setState(77);
			match(T__6);
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
			setState(79);
			((ReceiveContext)_localctx).channel = match(VAR);
			setState(80);
			match(T__7);
			setState(81);
			payload();
			setState(82);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitVarPayload(this);
			else return visitor.visitChildren(this);
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

	public final PayloadContext payload() throws RecognitionException {
		PayloadContext _localctx = new PayloadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_payload);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ExprPayloadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				expr(0);
				}
				break;
			case 2:
				_localctx = new StringPayloadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				values();
				}
				break;
			case 3:
				_localctx = new VarPayloadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
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
			setState(89);
			match(NEW);
			setState(90);
			((ScopeSessionContext)_localctx).x = match(VAR);
			setState(91);
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
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sessionPiVisitor ) return ((sessionPiVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IDENTIFIER);
			setState(94);
			match(T__9);
			setState(95);
			process(0);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(98);
				match(INT);
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				{
				setState(99);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(103);
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
						setState(104);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(106);
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
						setState(107);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(109);
						((ExprContext)_localctx).op = match(T__14);
						setState(110);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(115);
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
		enterRule(_localctx, 16, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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
		enterRule(_localctx, 18, RULE_values);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(STRING);
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\177\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\64\n\2\f\2\16"+
		"\2\67\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2@\n\2\3\2\3\2\3\2\7\2E\n\2\f"+
		"\2\16\2H\13\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\5\6Z\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\tg\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tr\n\t\f\t\16\tu\13\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\5\13}\n\13\3\13\2\4\2\20\f\2\4\6\b\n\f\16\20\22\24"+
		"\2\5\3\2\r\16\3\2\17\20\3\2\22\25\2\u0087\2?\3\2\2\2\4I\3\2\2\2\6L\3\2"+
		"\2\2\bQ\3\2\2\2\nY\3\2\2\2\f[\3\2\2\2\16_\3\2\2\2\20f\3\2\2\2\22v\3\2"+
		"\2\2\24|\3\2\2\2\26\27\b\2\1\2\27\30\7\37\2\2\30\31\7\3\2\2\31\36\5\2"+
		"\2\2\32\33\7\32\2\2\33\35\5\2\2\2\34\32\3\2\2\2\35 \3\2\2\2\36\34\3\2"+
		"\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\7\4\2\2\"@\3\2\2\2#$\5\4"+
		"\3\2$%\5\2\2\n%@\3\2\2\2&@\5\6\4\2\'@\5\b\5\2()\7\34\2\2)*\7\30\2\2*+"+
		"\7 \2\2+,\7\32\2\2,@\5\2\2\7-.\7\34\2\2./\7\31\2\2/\65\7\5\2\2\60\61\5"+
		"\16\b\2\61\62\7\6\2\2\62\64\3\2\2\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63"+
		"\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\5\16\b\29:\7\7\2\2"+
		":@\3\2\2\2;<\5\f\7\2<=\5\2\2\4=@\3\2\2\2>@\7\26\2\2?\26\3\2\2\2?#\3\2"+
		"\2\2?&\3\2\2\2?\'\3\2\2\2?(\3\2\2\2?-\3\2\2\2?;\3\2\2\2?>\3\2\2\2@F\3"+
		"\2\2\2AB\f\5\2\2BC\7\27\2\2CE\5\2\2\6DA\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG"+
		"\3\2\2\2G\3\3\2\2\2HF\3\2\2\2IJ\7\33\2\2JK\7\34\2\2K\5\3\2\2\2LM\7\34"+
		"\2\2MN\7\b\2\2NO\5\n\6\2OP\7\t\2\2P\7\3\2\2\2QR\7\34\2\2RS\7\n\2\2ST\5"+
		"\n\6\2TU\7\13\2\2U\t\3\2\2\2VZ\5\20\t\2WZ\5\24\13\2XZ\7\34\2\2YV\3\2\2"+
		"\2YW\3\2\2\2YX\3\2\2\2Z\13\3\2\2\2[\\\7\33\2\2\\]\7\34\2\2]^\7\34\2\2"+
		"^\r\3\2\2\2_`\7 \2\2`a\7\f\2\2ab\5\2\2\2b\17\3\2\2\2cd\b\t\1\2dg\7\35"+
		"\2\2eg\5\22\n\2fc\3\2\2\2fe\3\2\2\2gs\3\2\2\2hi\f\7\2\2ij\t\2\2\2jr\5"+
		"\20\t\bkl\f\6\2\2lm\t\3\2\2mr\5\20\t\7no\f\5\2\2op\7\21\2\2pr\5\20\t\6"+
		"qh\3\2\2\2qk\3\2\2\2qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\21\3\2\2"+
		"\2us\3\2\2\2vw\t\4\2\2w\23\3\2\2\2x}\7\35\2\2y}\7\36\2\2z}\7!\2\2{}\5"+
		"\22\n\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\25\3\2\2\2\13\36\65?"+
		"FYfqs|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}