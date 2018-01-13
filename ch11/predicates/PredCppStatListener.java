// Generated from PredCppStat.g4 by ANTLR 4.7.1

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PredCppStatParser}.
 */
public interface PredCppStatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PredCppStatParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(PredCppStatParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredCppStatParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(PredCppStatParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PredCppStatParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(PredCppStatParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredCppStatParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(PredCppStatParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PredCppStatParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PredCppStatParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredCppStatParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PredCppStatParser.ExprContext ctx);
}