// Generated from SimplePy.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimplePyParser}.
 */
public interface SimplePyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimplePyParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(SimplePyParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePyParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(SimplePyParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SimplePyParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SimplePyParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePyParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(SimplePyParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePyParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(SimplePyParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimplePyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimplePyParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePyParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(SimplePyParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePyParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(SimplePyParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePyParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(SimplePyParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePyParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(SimplePyParser.ListContext ctx);
}