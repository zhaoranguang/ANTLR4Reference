// Generated from CppStat.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CppStatParser}.
 */
public interface CppStatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CppStatParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CppStatParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppStatParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CppStatParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppStatParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CppStatParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppStatParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CppStatParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppStatParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CppStatParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppStatParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CppStatParser.ExprContext ctx);
}