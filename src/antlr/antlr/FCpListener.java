// Generated from C:/Users/JRafael/IdeaProjects/CompiladoresTeste/src/antlr\FCp.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FCpParser}.
 */
public interface FCpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FCpParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(FCpParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCpParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(FCpParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCpParser#cmdList}.
	 * @param ctx the parse tree
	 */
	void enterCmdList(FCpParser.CmdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCpParser#cmdList}.
	 * @param ctx the parse tree
	 */
	void exitCmdList(FCpParser.CmdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCpParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(FCpParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCpParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(FCpParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCpParser#mathExp}.
	 * @param ctx the parse tree
	 */
	void enterMathExp(FCpParser.MathExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCpParser#mathExp}.
	 * @param ctx the parse tree
	 */
	void exitMathExp(FCpParser.MathExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCpParser#mathTerm}.
	 * @param ctx the parse tree
	 */
	void enterMathTerm(FCpParser.MathTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCpParser#mathTerm}.
	 * @param ctx the parse tree
	 */
	void exitMathTerm(FCpParser.MathTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCpParser#relExp}.
	 * @param ctx the parse tree
	 */
	void enterRelExp(FCpParser.RelExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCpParser#relExp}.
	 * @param ctx the parse tree
	 */
	void exitRelExp(FCpParser.RelExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCpParser#relTerm}.
	 * @param ctx the parse tree
	 */
	void enterRelTerm(FCpParser.RelTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCpParser#relTerm}.
	 * @param ctx the parse tree
	 */
	void exitRelTerm(FCpParser.RelTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCpParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FCpParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCpParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FCpParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCpParser#exeCmd}.
	 * @param ctx the parse tree
	 */
	void enterExeCmd(FCpParser.ExeCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCpParser#exeCmd}.
	 * @param ctx the parse tree
	 */
	void exitExeCmd(FCpParser.ExeCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCpParser#inputCmd}.
	 * @param ctx the parse tree
	 */
	void enterInputCmd(FCpParser.InputCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCpParser#inputCmd}.
	 * @param ctx the parse tree
	 */
	void exitInputCmd(FCpParser.InputCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCpParser#outputCmd}.
	 * @param ctx the parse tree
	 */
	void enterOutputCmd(FCpParser.OutputCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCpParser#outputCmd}.
	 * @param ctx the parse tree
	 */
	void exitOutputCmd(FCpParser.OutputCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCpParser#whileCmd}.
	 * @param ctx the parse tree
	 */
	void enterWhileCmd(FCpParser.WhileCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCpParser#whileCmd}.
	 * @param ctx the parse tree
	 */
	void exitWhileCmd(FCpParser.WhileCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCpParser#ifCmd}.
	 * @param ctx the parse tree
	 */
	void enterIfCmd(FCpParser.IfCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCpParser#ifCmd}.
	 * @param ctx the parse tree
	 */
	void exitIfCmd(FCpParser.IfCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCpParser#elseCmd}.
	 * @param ctx the parse tree
	 */
	void enterElseCmd(FCpParser.ElseCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCpParser#elseCmd}.
	 * @param ctx the parse tree
	 */
	void exitElseCmd(FCpParser.ElseCmdContext ctx);
}