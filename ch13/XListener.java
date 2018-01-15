// Generated from X.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XParser}.
 */
public interface XListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(XParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link XParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(XParser.SContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link XParser#e}.
	 * @param ctx the parse tree
	 */
	void enterAdd(XParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link XParser#e}.
	 * @param ctx the parse tree
	 */
	void exitAdd(XParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link XParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMult(XParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link XParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMult(XParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link XParser#e}.
	 * @param ctx the parse tree
	 */
	void enterInt(XParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link XParser#e}.
	 * @param ctx the parse tree
	 */
	void exitInt(XParser.IntContext ctx);
}