// Generated from F.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FParser}.
 */
public interface FListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(FParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(FParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(FParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(FParser.AtomContext ctx);
}