// Generated from IDKeyword.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IDKeywordParser}.
 */
public interface IDKeywordListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IDKeywordParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(IDKeywordParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDKeywordParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(IDKeywordParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDKeywordParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(IDKeywordParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDKeywordParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(IDKeywordParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDKeywordParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(IDKeywordParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDKeywordParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(IDKeywordParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IDKeywordParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(IDKeywordParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link IDKeywordParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(IDKeywordParser.IdContext ctx);
}