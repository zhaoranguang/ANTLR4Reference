// Generated from Enum2.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Enum2Parser}.
 */
public interface Enum2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Enum2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Enum2Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Enum2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Enum2Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Enum2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Enum2Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Enum2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Enum2Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Enum2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Enum2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Enum2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Enum2Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Enum2Parser#enumDecl}.
	 * @param ctx the parse tree
	 */
	void enterEnumDecl(Enum2Parser.EnumDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Enum2Parser#enumDecl}.
	 * @param ctx the parse tree
	 */
	void exitEnumDecl(Enum2Parser.EnumDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Enum2Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(Enum2Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Enum2Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(Enum2Parser.IdContext ctx);
}