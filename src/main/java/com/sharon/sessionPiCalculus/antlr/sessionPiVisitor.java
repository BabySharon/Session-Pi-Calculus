// Generated from sessionPi.g4 by ANTLR 4.7.2
package com.sharon.sessionPiCalculus.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link sessionPiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface sessionPiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code scopeSessionLabel}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeSessionLabel(sessionPiParser.ScopeSessionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inaction}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInaction(sessionPiParser.InactionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code receiveProcess}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveProcess(sessionPiParser.ReceiveProcessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parallel}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel(sessionPiParser.ParallelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scopeRestriction}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeRestriction(sessionPiParser.ScopeRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sequentialProcess}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequentialProcess(sessionPiParser.SequentialProcessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code branchProcess}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranchProcess(sessionPiParser.BranchProcessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sendProcess}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendProcess(sessionPiParser.SendProcessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectProcess}
	 * labeled alternative in {@link sessionPiParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectProcess(sessionPiParser.SelectProcessContext ctx);
	/**
	 * Visit a parse tree produced by {@link sessionPiParser#scopeRestrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeRestrict(sessionPiParser.ScopeRestrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link sessionPiParser#send}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSend(sessionPiParser.SendContext ctx);
	/**
	 * Visit a parse tree produced by {@link sessionPiParser#receive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceive(sessionPiParser.ReceiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPayload}
	 * labeled alternative in {@link sessionPiParser#payload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPayload(sessionPiParser.ExprPayloadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringPayload}
	 * labeled alternative in {@link sessionPiParser#payload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringPayload(sessionPiParser.StringPayloadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code channelPayload}
	 * labeled alternative in {@link sessionPiParser#payload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarPayload(sessionPiParser.VarPayloadContext ctx);
	/**
	 * Visit a parse tree produced by {@link sessionPiParser#scopeSession}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeSession(sessionPiParser.ScopeSessionContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link sessionPiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(sessionPiParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link sessionPiParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(sessionPiParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code values}
	 * labeled alternative in {@link sessionPiParser#processprocessprocessprocessprocessprocessprocessprocessprocesspayloadpayloadpayload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(sessionPiParser.ValuesContext ctx);
}