// Generated from Vec.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VecParser}.
 */
public interface VecListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VecParser#vec4}.
	 * @param ctx the parse tree
	 */
	void enterVec4(VecParser.Vec4Context ctx);
	/**
	 * Exit a parse tree produced by {@link VecParser#vec4}.
	 * @param ctx the parse tree
	 */
	void exitVec4(VecParser.Vec4Context ctx);
	/**
	 * Enter a parse tree produced by {@link VecParser#ints}.
	 * @param ctx the parse tree
	 */
	void enterInts(VecParser.IntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VecParser#ints}.
	 * @param ctx the parse tree
	 */
	void exitInts(VecParser.IntsContext ctx);
}