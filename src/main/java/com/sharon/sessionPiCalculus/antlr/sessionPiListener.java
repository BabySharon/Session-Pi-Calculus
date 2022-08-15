// Generated from sessionPi.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sessionPiParser}.
 */
public interface sessionPiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code scopeSessionLabel}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void enterScopeSessionLabel(sessionPiParser.ScopeSessionLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scopeSessionLabel}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void exitScopeSessionLabel(sessionPiParser.ScopeSessionLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inaction}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void enterInaction(sessionPiParser.InactionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inaction}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void exitInaction(sessionPiParser.InactionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code receiveProcess}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void enterReceiveProcess(sessionPiParser.ReceiveProcessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code receiveProcess}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void exitReceiveProcess(sessionPiParser.ReceiveProcessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parallel}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void enterParallel(sessionPiParser.ParallelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parallel}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void exitParallel(sessionPiParser.ParallelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scopeRestriction}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void enterScopeRestriction(sessionPiParser.ScopeRestrictionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scopeRestriction}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void exitScopeRestriction(sessionPiParser.ScopeRestrictionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sequentialProcess}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void enterSequentialProcess(sessionPiParser.SequentialProcessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sequentialProcess}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void exitSequentialProcess(sessionPiParser.SequentialProcessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code branchProcess}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void enterBranchProcess(sessionPiParser.BranchProcessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code branchProcess}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void exitBranchProcess(sessionPiParser.BranchProcessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sendProcess}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void enterSendProcess(sessionPiParser.SendProcessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sendProcess}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void exitSendProcess(sessionPiParser.SendProcessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectProcess}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void enterSelectProcess(sessionPiParser.SelectProcessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectProcess}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 */
	void exitSelectProcess(sessionPiParser.SelectProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link sessionPiParser#scopeRestrict}.
	 * @param ctx the parse tree
	 */
	void enterScopeRestrict(sessionPiParser.ScopeRestrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link sessionPiParser#scopeRestrict}.
	 * @param ctx the parse tree
	 */
	void exitScopeRestrict(sessionPiParser.ScopeRestrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link sessionPiParser#send}.
	 * @param ctx the parse tree
	 */
	void enterSend(sessionPiParser.SendContext ctx);
	/**
	 * Exit a parse tree produced by {@link sessionPiParser#send}.
	 * @param ctx the parse tree
	 */
	void exitSend(sessionPiParser.SendContext ctx);
	/**
	 * Enter a parse tree produced by {@link sessionPiParser#receive}.
	 * @param ctx the parse tree
	 */
	void enterReceive(sessionPiParser.ReceiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link sessionPiParser#receive}.
	 * @param ctx the parse tree
	 */
	void exitReceive(sessionPiParser.ReceiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPayload}
	 * labeled alternative in {@link sessionPiParser#payload}.
	 * @param ctx the parse tree
	 */
	void enterExprPayload(sessionPiParser.ExprPayloadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPayload}
	 * labeled alternative in {@link sessionPiParser#payload}.
	 * @param ctx the parse tree
	 */
	void exitExprPayload(sessionPiParser.ExprPayloadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringPayload}
	 * labeled alternative in {@link sessionPiParser#payload}.
	 * @param ctx the parse tree
	 */
	void enterStringPayload(sessionPiParser.StringPayloadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringPayload}
	 * labeled alternative in {@link sessionPiParser#payload}.
	 * @param ctx the parse tree
	 */
	void exitStringPayload(sessionPiParser.StringPayloadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varPayload}
	 * labeled alternative in {@link sessionPiParser#payload}.
	 * @param ctx the parse tree
	 */
	void enterVarPayload(sessionPiParser.VarPayloadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varPayload}
	 * labeled alternative in {@link sessionPiParser#payload}.
	 * @param ctx the parse tree
	 */
	void exitVarPayload(sessionPiParser.VarPayloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link sessionPiParser#scopeSession}.
	 * @param ctx the parse tree
	 */
	void enterScopeSession(sessionPiParser.ScopeSessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sessionPiParser#scopeSession}.
	 * @param ctx the parse tree
	 */
	void exitScopeSession(sessionPiParser.ScopeSessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sessionPiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(sessionPiParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sessionPiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(sessionPiParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sessionPiParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(sessionPiParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link sessionPiParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(sessionPiParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code values}
	 * labeled alternative in {@link sessionPiParser#processprocessprocessprocessprocessprocessprocessprocessprocesspayloadpayloadpayload}.
	 * @param ctx the parse tree
	 */
	void enterValues(sessionPiParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code values}
	 * labeled alternative in {@link sessionPiParser#processprocessprocessprocessprocessprocessprocessprocessprocesspayloadpayloadpayload}.
	 * @param ctx the parse tree
	 */
	void exitValues(sessionPiParser.ValuesContext ctx);
}