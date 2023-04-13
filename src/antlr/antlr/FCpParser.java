// Generated from C:/Users/JRafael/IdeaProjects/CompiladoresTeste/src/antlr\FCp.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FCpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, RESERVED_WORDS=7, INT_TYPE=8, 
		FLOAT_TYPE=9, BOOLEAN_TYPE=10, STRING_TYPE=11, END=12, SEMICOLON=13, OP_PAR=14, 
		CL_PAR=15, OP_BRA=16, CL_BRA=17, BOOLEAN_VALUES=18, IDENTIFIER=19, ASSIGNMENT_OP=20, 
		ADD_OP=21, MULT_OP=22, REL_OP=23, EQU_OP=24, LOGICAL_OP=25, SINAL=26, 
		INT_VALUES=27, FLOAT_VALUES=28, STRING_VALUES=29, WS=30, LINE_COMMENT=31, 
		BLOCK_COMMENT=32;
	public static final int
		RULE_start = 0, RULE_cmdList = 1, RULE_declaration = 2, RULE_mathExp = 3, 
		RULE_mathTerm = 4, RULE_relExp = 5, RULE_relTerm = 6, RULE_assignment = 7, 
		RULE_exeCmd = 8, RULE_inputCmd = 9, RULE_outputCmd = 10, RULE_whileCmd = 11, 
		RULE_ifCmd = 12, RULE_elseCmd = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "cmdList", "declaration", "mathExp", "mathTerm", "relExp", "relTerm", 
			"assignment", "exeCmd", "inputCmd", "outputCmd", "whileCmd", "ifCmd", 
			"elseCmd"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'START'", "'INPUT'", "'OUTPUT'", "'WHILE'", "'IF'", "'ELSE'", 
			null, "'INT'", "'FLOAT'", "'BOOL'", "'STRING'", "'END'", "';'", "'('", 
			"')'", "'{'", "'}'", null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "RESERVED_WORDS", "INT_TYPE", 
			"FLOAT_TYPE", "BOOLEAN_TYPE", "STRING_TYPE", "END", "SEMICOLON", "OP_PAR", 
			"CL_PAR", "OP_BRA", "CL_BRA", "BOOLEAN_VALUES", "IDENTIFIER", "ASSIGNMENT_OP", 
			"ADD_OP", "MULT_OP", "REL_OP", "EQU_OP", "LOGICAL_OP", "SINAL", "INT_VALUES", 
			"FLOAT_VALUES", "STRING_VALUES", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FCp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FCpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(FCpParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FCpParser.SEMICOLON, i);
		}
		public TerminalNode END() { return getToken(FCpParser.END, 0); }
		public TerminalNode EOF() { return getToken(FCpParser.EOF, 0); }
		public List<CmdListContext> cmdList() {
			return getRuleContexts(CmdListContext.class);
		}
		public CmdListContext cmdList(int i) {
			return getRuleContext(CmdListContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCpVisitor ) return ((FCpVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			match(SEMICOLON);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 528188L) != 0)) {
				{
				{
				setState(30);
				cmdList();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(END);
			setState(37);
			match(SEMICOLON);
			setState(38);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdListContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExeCmdContext exeCmd() {
			return getRuleContext(ExeCmdContext.class,0);
		}
		public CmdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).enterCmdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).exitCmdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCpVisitor ) return ((FCpVisitor<? extends T>)visitor).visitCmdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdListContext cmdList() throws RecognitionException {
		CmdListContext _localctx = new CmdListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cmdList);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case BOOLEAN_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				declaration();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				assignment();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				exeCmd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(FCpParser.INT_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FCpParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(FCpParser.SEMICOLON, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(FCpParser.FLOAT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(FCpParser.STRING_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(FCpParser.BOOLEAN_TYPE, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(FCpParser.ASSIGNMENT_OP, 0); }
		public MathExpContext mathExp() {
			return getRuleContext(MathExpContext.class,0);
		}
		public TerminalNode STRING_VALUES() { return getToken(FCpParser.STRING_VALUES, 0); }
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCpVisitor ) return ((FCpVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(45);
				match(INT_TYPE);
				setState(46);
				match(IDENTIFIER);
				setState(47);
				match(SEMICOLON);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(48);
				match(FLOAT_TYPE);
				setState(49);
				match(IDENTIFIER);
				setState(50);
				match(SEMICOLON);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(51);
				match(STRING_TYPE);
				setState(52);
				match(IDENTIFIER);
				setState(53);
				match(SEMICOLON);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(54);
				match(BOOLEAN_TYPE);
				setState(55);
				match(IDENTIFIER);
				setState(56);
				match(SEMICOLON);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(57);
				match(INT_TYPE);
				setState(58);
				match(IDENTIFIER);
				setState(59);
				match(ASSIGNMENT_OP);
				setState(60);
				mathExp();
				setState(61);
				match(SEMICOLON);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(63);
				match(FLOAT_TYPE);
				setState(64);
				match(IDENTIFIER);
				setState(65);
				match(ASSIGNMENT_OP);
				setState(66);
				mathExp();
				setState(67);
				match(SEMICOLON);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(69);
				match(STRING_TYPE);
				setState(70);
				match(IDENTIFIER);
				setState(71);
				match(ASSIGNMENT_OP);
				setState(72);
				match(STRING_VALUES);
				setState(73);
				match(SEMICOLON);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(74);
				match(BOOLEAN_TYPE);
				setState(75);
				match(IDENTIFIER);
				setState(76);
				match(ASSIGNMENT_OP);
				setState(77);
				relExp();
				setState(78);
				match(SEMICOLON);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MathExpContext extends ParserRuleContext {
		public List<MathTermContext> mathTerm() {
			return getRuleContexts(MathTermContext.class);
		}
		public MathTermContext mathTerm(int i) {
			return getRuleContext(MathTermContext.class,i);
		}
		public List<TerminalNode> ADD_OP() { return getTokens(FCpParser.ADD_OP); }
		public TerminalNode ADD_OP(int i) {
			return getToken(FCpParser.ADD_OP, i);
		}
		public List<TerminalNode> MULT_OP() { return getTokens(FCpParser.MULT_OP); }
		public TerminalNode MULT_OP(int i) {
			return getToken(FCpParser.MULT_OP, i);
		}
		public MathExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).enterMathExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).exitMathExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCpVisitor ) return ((FCpVisitor<? extends T>)visitor).visitMathExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExpContext mathExp() throws RecognitionException {
		MathExpContext _localctx = new MathExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mathExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			mathTerm();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD_OP || _la==MULT_OP) {
				{
				{
				setState(83);
				_la = _input.LA(1);
				if ( !(_la==ADD_OP || _la==MULT_OP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(84);
				mathTerm();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MathTermContext extends ParserRuleContext {
		public TerminalNode INT_VALUES() { return getToken(FCpParser.INT_VALUES, 0); }
		public TerminalNode FLOAT_VALUES() { return getToken(FCpParser.FLOAT_VALUES, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FCpParser.IDENTIFIER, 0); }
		public TerminalNode OP_PAR() { return getToken(FCpParser.OP_PAR, 0); }
		public MathExpContext mathExp() {
			return getRuleContext(MathExpContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(FCpParser.CL_PAR, 0); }
		public MathTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).enterMathTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).exitMathTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCpVisitor ) return ((FCpVisitor<? extends T>)visitor).visitMathTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathTermContext mathTerm() throws RecognitionException {
		MathTermContext _localctx = new MathTermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mathTerm);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUES:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(INT_VALUES);
				}
				break;
			case FLOAT_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(FLOAT_VALUES);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(IDENTIFIER);
				}
				break;
			case OP_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(OP_PAR);
				setState(94);
				mathExp();
				setState(95);
				match(CL_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelExpContext extends ParserRuleContext {
		public List<RelTermContext> relTerm() {
			return getRuleContexts(RelTermContext.class);
		}
		public RelTermContext relTerm(int i) {
			return getRuleContext(RelTermContext.class,i);
		}
		public List<TerminalNode> LOGICAL_OP() { return getTokens(FCpParser.LOGICAL_OP); }
		public TerminalNode LOGICAL_OP(int i) {
			return getToken(FCpParser.LOGICAL_OP, i);
		}
		public List<TerminalNode> EQU_OP() { return getTokens(FCpParser.EQU_OP); }
		public TerminalNode EQU_OP(int i) {
			return getToken(FCpParser.EQU_OP, i);
		}
		public List<TerminalNode> REL_OP() { return getTokens(FCpParser.REL_OP); }
		public TerminalNode REL_OP(int i) {
			return getToken(FCpParser.REL_OP, i);
		}
		public RelExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).enterRelExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).exitRelExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCpVisitor ) return ((FCpVisitor<? extends T>)visitor).visitRelExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExpContext relExp() throws RecognitionException {
		RelExpContext _localctx = new RelExpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			relTerm();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) {
				{
				{
				setState(100);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(101);
				relTerm();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelTermContext extends ParserRuleContext {
		public MathExpContext mathExp() {
			return getRuleContext(MathExpContext.class,0);
		}
		public TerminalNode BOOLEAN_VALUES() { return getToken(FCpParser.BOOLEAN_VALUES, 0); }
		public TerminalNode OP_PAR() { return getToken(FCpParser.OP_PAR, 0); }
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(FCpParser.CL_PAR, 0); }
		public RelTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).enterRelTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).exitRelTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCpVisitor ) return ((FCpVisitor<? extends T>)visitor).visitRelTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelTermContext relTerm() throws RecognitionException {
		RelTermContext _localctx = new RelTermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relTerm);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				mathExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(BOOLEAN_VALUES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(OP_PAR);
				setState(110);
				relExp();
				setState(111);
				match(CL_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FCpParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(FCpParser.ASSIGNMENT_OP, 0); }
		public TerminalNode SEMICOLON() { return getToken(FCpParser.SEMICOLON, 0); }
		public MathExpContext mathExp() {
			return getRuleContext(MathExpContext.class,0);
		}
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public TerminalNode STRING_VALUES() { return getToken(FCpParser.STRING_VALUES, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCpVisitor ) return ((FCpVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IDENTIFIER);
			setState(116);
			match(ASSIGNMENT_OP);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(117);
				mathExp();
				}
				break;
			case 2:
				{
				setState(118);
				relExp();
				}
				break;
			case 3:
				{
				setState(119);
				match(STRING_VALUES);
				}
				break;
			}
			setState(122);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExeCmdContext extends ParserRuleContext {
		public InputCmdContext inputCmd() {
			return getRuleContext(InputCmdContext.class,0);
		}
		public OutputCmdContext outputCmd() {
			return getRuleContext(OutputCmdContext.class,0);
		}
		public WhileCmdContext whileCmd() {
			return getRuleContext(WhileCmdContext.class,0);
		}
		public IfCmdContext ifCmd() {
			return getRuleContext(IfCmdContext.class,0);
		}
		public ExeCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exeCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).enterExeCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).exitExeCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCpVisitor ) return ((FCpVisitor<? extends T>)visitor).visitExeCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExeCmdContext exeCmd() throws RecognitionException {
		ExeCmdContext _localctx = new ExeCmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exeCmd);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				inputCmd();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				outputCmd();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				whileCmd();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				ifCmd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputCmdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FCpParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(FCpParser.SEMICOLON, 0); }
		public InputCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).enterInputCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).exitInputCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCpVisitor ) return ((FCpVisitor<? extends T>)visitor).visitInputCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputCmdContext inputCmd() throws RecognitionException {
		InputCmdContext _localctx = new InputCmdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inputCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__1);
			setState(131);
			match(IDENTIFIER);
			setState(132);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputCmdContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(FCpParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FCpParser.IDENTIFIER, 0); }
		public TerminalNode STRING_VALUES() { return getToken(FCpParser.STRING_VALUES, 0); }
		public OutputCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).enterOutputCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).exitOutputCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCpVisitor ) return ((FCpVisitor<? extends T>)visitor).visitOutputCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputCmdContext outputCmd() throws RecognitionException {
		OutputCmdContext _localctx = new OutputCmdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_outputCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__2);
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_VALUES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(136);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileCmdContext extends ParserRuleContext {
		public TerminalNode OP_PAR() { return getToken(FCpParser.OP_PAR, 0); }
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(FCpParser.CL_PAR, 0); }
		public TerminalNode OP_BRA() { return getToken(FCpParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(FCpParser.CL_BRA, 0); }
		public List<CmdListContext> cmdList() {
			return getRuleContexts(CmdListContext.class);
		}
		public CmdListContext cmdList(int i) {
			return getRuleContext(CmdListContext.class,i);
		}
		public WhileCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).enterWhileCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).exitWhileCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCpVisitor ) return ((FCpVisitor<? extends T>)visitor).visitWhileCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileCmdContext whileCmd() throws RecognitionException {
		WhileCmdContext _localctx = new WhileCmdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__3);
			setState(139);
			match(OP_PAR);
			setState(140);
			relExp();
			setState(141);
			match(CL_PAR);
			setState(142);
			match(OP_BRA);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 528188L) != 0)) {
				{
				{
				setState(143);
				cmdList();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(CL_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfCmdContext extends ParserRuleContext {
		public TerminalNode OP_PAR() { return getToken(FCpParser.OP_PAR, 0); }
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(FCpParser.CL_PAR, 0); }
		public TerminalNode OP_BRA() { return getToken(FCpParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(FCpParser.CL_BRA, 0); }
		public List<CmdListContext> cmdList() {
			return getRuleContexts(CmdListContext.class);
		}
		public CmdListContext cmdList(int i) {
			return getRuleContext(CmdListContext.class,i);
		}
		public ElseCmdContext elseCmd() {
			return getRuleContext(ElseCmdContext.class,0);
		}
		public IfCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).enterIfCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).exitIfCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCpVisitor ) return ((FCpVisitor<? extends T>)visitor).visitIfCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfCmdContext ifCmd() throws RecognitionException {
		IfCmdContext _localctx = new IfCmdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__4);
			setState(152);
			match(OP_PAR);
			setState(153);
			relExp();
			setState(154);
			match(CL_PAR);
			setState(155);
			match(OP_BRA);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 528188L) != 0)) {
				{
				{
				setState(156);
				cmdList();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(CL_BRA);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(163);
				elseCmd();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseCmdContext extends ParserRuleContext {
		public TerminalNode OP_BRA() { return getToken(FCpParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(FCpParser.CL_BRA, 0); }
		public List<CmdListContext> cmdList() {
			return getRuleContexts(CmdListContext.class);
		}
		public CmdListContext cmdList(int i) {
			return getRuleContext(CmdListContext.class,i);
		}
		public ElseCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).enterElseCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCpListener ) ((FCpListener)listener).exitElseCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCpVisitor ) return ((FCpVisitor<? extends T>)visitor).visitElseCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseCmdContext elseCmd() throws RecognitionException {
		ElseCmdContext _localctx = new ElseCmdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elseCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__5);
			setState(167);
			match(OP_BRA);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 528188L) != 0)) {
				{
				{
				setState(168);
				cmdList();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(CL_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001 \u00b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001,\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"Q\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003V\b\u0003\n\u0003"+
		"\f\u0003Y\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004b\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005g\b\u0005\n\u0005\f\u0005j\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006r\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007y\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0081\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0091\b\u000b\n\u000b\f\u000b\u0094\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u009e\b\f\n\f\f\f\u00a1\t\f\u0001\f\u0001\f\u0003\f\u00a5\b"+
		"\f\u0001\r\u0001\r\u0001\r\u0005\r\u00aa\b\r\n\r\f\r\u00ad\t\r\u0001\r"+
		"\u0001\r\u0001\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0003\u0001\u0000\u0015\u0016"+
		"\u0001\u0000\u0017\u0019\u0002\u0000\u0013\u0013\u001d\u001d\u00bc\u0000"+
		"\u001c\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004P\u0001"+
		"\u0000\u0000\u0000\u0006R\u0001\u0000\u0000\u0000\ba\u0001\u0000\u0000"+
		"\u0000\nc\u0001\u0000\u0000\u0000\fq\u0001\u0000\u0000\u0000\u000es\u0001"+
		"\u0000\u0000\u0000\u0010\u0080\u0001\u0000\u0000\u0000\u0012\u0082\u0001"+
		"\u0000\u0000\u0000\u0014\u0086\u0001\u0000\u0000\u0000\u0016\u008a\u0001"+
		"\u0000\u0000\u0000\u0018\u0097\u0001\u0000\u0000\u0000\u001a\u00a6\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0005\u0001\u0000\u0000\u001d!\u0005\r"+
		"\u0000\u0000\u001e \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000\u0000"+
		"\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001"+
		"\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000"+
		"$%\u0005\f\u0000\u0000%&\u0005\r\u0000\u0000&\'\u0005\u0000\u0000\u0001"+
		"\'\u0001\u0001\u0000\u0000\u0000(,\u0003\u0004\u0002\u0000),\u0003\u000e"+
		"\u0007\u0000*,\u0003\u0010\b\u0000+(\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000+*\u0001\u0000\u0000\u0000,\u0003\u0001\u0000\u0000\u0000"+
		"-.\u0005\b\u0000\u0000./\u0005\u0013\u0000\u0000/Q\u0005\r\u0000\u0000"+
		"01\u0005\t\u0000\u000012\u0005\u0013\u0000\u00002Q\u0005\r\u0000\u0000"+
		"34\u0005\u000b\u0000\u000045\u0005\u0013\u0000\u00005Q\u0005\r\u0000\u0000"+
		"67\u0005\n\u0000\u000078\u0005\u0013\u0000\u00008Q\u0005\r\u0000\u0000"+
		"9:\u0005\b\u0000\u0000:;\u0005\u0013\u0000\u0000;<\u0005\u0014\u0000\u0000"+
		"<=\u0003\u0006\u0003\u0000=>\u0005\r\u0000\u0000>Q\u0001\u0000\u0000\u0000"+
		"?@\u0005\t\u0000\u0000@A\u0005\u0013\u0000\u0000AB\u0005\u0014\u0000\u0000"+
		"BC\u0003\u0006\u0003\u0000CD\u0005\r\u0000\u0000DQ\u0001\u0000\u0000\u0000"+
		"EF\u0005\u000b\u0000\u0000FG\u0005\u0013\u0000\u0000GH\u0005\u0014\u0000"+
		"\u0000HI\u0005\u001d\u0000\u0000IQ\u0005\r\u0000\u0000JK\u0005\n\u0000"+
		"\u0000KL\u0005\u0013\u0000\u0000LM\u0005\u0014\u0000\u0000MN\u0003\n\u0005"+
		"\u0000NO\u0005\r\u0000\u0000OQ\u0001\u0000\u0000\u0000P-\u0001\u0000\u0000"+
		"\u0000P0\u0001\u0000\u0000\u0000P3\u0001\u0000\u0000\u0000P6\u0001\u0000"+
		"\u0000\u0000P9\u0001\u0000\u0000\u0000P?\u0001\u0000\u0000\u0000PE\u0001"+
		"\u0000\u0000\u0000PJ\u0001\u0000\u0000\u0000Q\u0005\u0001\u0000\u0000"+
		"\u0000RW\u0003\b\u0004\u0000ST\u0007\u0000\u0000\u0000TV\u0003\b\u0004"+
		"\u0000US\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000X\u0007\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000Zb\u0005\u001b\u0000\u0000[b\u0005\u001c\u0000"+
		"\u0000\\b\u0005\u0013\u0000\u0000]^\u0005\u000e\u0000\u0000^_\u0003\u0006"+
		"\u0003\u0000_`\u0005\u000f\u0000\u0000`b\u0001\u0000\u0000\u0000aZ\u0001"+
		"\u0000\u0000\u0000a[\u0001\u0000\u0000\u0000a\\\u0001\u0000\u0000\u0000"+
		"a]\u0001\u0000\u0000\u0000b\t\u0001\u0000\u0000\u0000ch\u0003\f\u0006"+
		"\u0000de\u0007\u0001\u0000\u0000eg\u0003\f\u0006\u0000fd\u0001\u0000\u0000"+
		"\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000i\u000b\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"kr\u0003\u0006\u0003\u0000lr\u0005\u0012\u0000\u0000mn\u0005\u000e\u0000"+
		"\u0000no\u0003\n\u0005\u0000op\u0005\u000f\u0000\u0000pr\u0001\u0000\u0000"+
		"\u0000qk\u0001\u0000\u0000\u0000ql\u0001\u0000\u0000\u0000qm\u0001\u0000"+
		"\u0000\u0000r\r\u0001\u0000\u0000\u0000st\u0005\u0013\u0000\u0000tx\u0005"+
		"\u0014\u0000\u0000uy\u0003\u0006\u0003\u0000vy\u0003\n\u0005\u0000wy\u0005"+
		"\u001d\u0000\u0000xu\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005\r\u0000\u0000"+
		"{\u000f\u0001\u0000\u0000\u0000|\u0081\u0003\u0012\t\u0000}\u0081\u0003"+
		"\u0014\n\u0000~\u0081\u0003\u0016\u000b\u0000\u007f\u0081\u0003\u0018"+
		"\f\u0000\u0080|\u0001\u0000\u0000\u0000\u0080}\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0011\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0002\u0000\u0000\u0083"+
		"\u0084\u0005\u0013\u0000\u0000\u0084\u0085\u0005\r\u0000\u0000\u0085\u0013"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0003\u0000\u0000\u0087\u0088"+
		"\u0007\u0002\u0000\u0000\u0088\u0089\u0005\r\u0000\u0000\u0089\u0015\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005\u0004\u0000\u0000\u008b\u008c\u0005"+
		"\u000e\u0000\u0000\u008c\u008d\u0003\n\u0005\u0000\u008d\u008e\u0005\u000f"+
		"\u0000\u0000\u008e\u0092\u0005\u0010\u0000\u0000\u008f\u0091\u0003\u0002"+
		"\u0001\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000"+
		"\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005\u0011\u0000\u0000\u0096\u0017\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\u0005\u0000\u0000\u0098\u0099\u0005\u000e"+
		"\u0000\u0000\u0099\u009a\u0003\n\u0005\u0000\u009a\u009b\u0005\u000f\u0000"+
		"\u0000\u009b\u009f\u0005\u0010\u0000\u0000\u009c\u009e\u0003\u0002\u0001"+
		"\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a4\u0005\u0011\u0000\u0000\u00a3\u00a5\u0003\u001a\r\u0000"+
		"\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u0019\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0006\u0000\u0000"+
		"\u00a7\u00ab\u0005\u0010\u0000\u0000\u00a8\u00aa\u0003\u0002\u0001\u0000"+
		"\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005\u0011\u0000\u0000\u00af\u001b\u0001\u0000\u0000\u0000"+
		"\r!+PWahqx\u0080\u0092\u009f\u00a4\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}