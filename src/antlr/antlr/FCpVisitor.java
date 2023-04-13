// Generated from C:/Users/JRafael/IdeaProjects/CompiladoresTeste/src/antlr\FCp.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FCpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FCpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FCpParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(FCpParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCpParser#cmdList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdList(FCpParser.CmdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCpParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(FCpParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCpParser#mathExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExp(FCpParser.MathExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCpParser#mathTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathTerm(FCpParser.MathTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCpParser#relExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExp(FCpParser.RelExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCpParser#relTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelTerm(FCpParser.RelTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCpParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FCpParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCpParser#exeCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExeCmd(FCpParser.ExeCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCpParser#inputCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputCmd(FCpParser.InputCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCpParser#outputCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputCmd(FCpParser.OutputCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCpParser#whileCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCmd(FCpParser.WhileCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCpParser#ifCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCmd(FCpParser.IfCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCpParser#elseCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseCmd(FCpParser.ElseCmdContext ctx);
}