// Generated from Simple.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimpleParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimpleParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(SimpleParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(SimpleParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(SimpleParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(SimpleParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SimpleParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SimpleParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleParser.ExprContext ctx);
}