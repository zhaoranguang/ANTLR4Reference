// Generated from Ambig.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AmbigParser}.
 */
public interface AmbigListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AmbigParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(AmbigParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmbigParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(AmbigParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmbigParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AmbigParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmbigParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AmbigParser.ExprContext ctx);
}