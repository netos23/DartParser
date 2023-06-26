// Generated from /Users/nikitamorozov/IdeaProjects/prodaction/DartParser/src/main/java/DartFuncGrammaParser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DartFuncGrammaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL_LITERAL=1, ABSTRACT_=2, AS_=3, ASSERT_=4, ASYNC_=5, AWAIT_=6, BREAK_=7, 
		CASE_=8, CATCH_=9, CLASS_=10, CONST_=11, CONTINUE_=12, COVARIANT_=13, 
		DEFAULT_=14, DEFERRED_=15, DO_=16, DYNAMIC_=17, ELSE_=18, ENUM_=19, EXPORT_=20, 
		EXTENDS_=21, EXTENSION_=22, EXTERNAL_=23, FACTORY_=24, FALSE_=25, FINAL_=26, 
		FINALLY_=27, FOR_=28, FUNCTION_=29, GET_=30, GTILDE_=31, HIDE_=32, IF_=33, 
		IMPLEMENTS_=34, IMPORT_=35, IN_=36, INTERFACE_=37, IS_=38, LATE_=39, LET_=40, 
		LIBRARY_=41, MIXIN_=42, NATIVE_=43, NEW_=44, NULL_=45, OF_=46, ON_=47, 
		OPERATOR_=48, PART_=49, REQUIRED_=50, RETHROW_=51, RETURN_=52, SET_=53, 
		SHOW_=54, STATIC_=55, SUPER_=56, SWITCH_=57, SYNC_=58, THIS_=59, THROW_=60, 
		TRUE_=61, TRY_=62, TYPEDEF_=63, VAR_=64, VOID_=65, WHILE_=66, WITH_=67, 
		YIELD_=68, SC=69, CO=70, A=71, AA=72, AE=73, AT=74, C=75, CIR=76, CIRE=77, 
		ME=78, MINUS=79, MM=80, NE=81, NOT=82, P=83, PC=84, PE=85, PL=86, PLE=87, 
		PLPL=88, PO=89, POE=90, PP=91, QU=92, QUD=93, QUDD=94, QUQU=95, QUQUEQ=96, 
		SE=97, SL=98, SQS=99, SQSE=100, SQUIG=101, ST=102, STE=103, D=104, DD=105, 
		DDD=106, DDDQ=107, VALUE=108, NUMBER=109, EQ=110, EG=111, CP=112, OP=113, 
		OBC=114, CBC=115, OB=116, CB=117, CMP=118, WS=119, SINGLE_LINE_COMMENT=120, 
		MULTI_LINE_COMMENT=121, IDENTIFIER=122;
	public static final int
		RULE_type = 0, RULE_parameter = 1, RULE_optionalParametr = 2, RULE_optionalParametrs = 3, 
		RULE_parameters = 4, RULE_function = 5, RULE_constructor = 6, RULE_namedConstructor = 7, 
		RULE_functionalCall = 8, RULE_statement = 9, RULE_loop = 10, RULE_if = 11, 
		RULE_block = 12, RULE_condition = 13, RULE_typeDeclaration = 14, RULE_declaration = 15, 
		RULE_assignment = 16, RULE_expression = 17, RULE_increment = 18, RULE_term = 19, 
		RULE_factor = 20, RULE_values = 21, RULE_field = 22, RULE_getter = 23, 
		RULE_setter = 24, RULE_class = 25, RULE_classBody = 26, RULE_import_ = 27, 
		RULE_topLavelStatement = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"type", "parameter", "optionalParametr", "optionalParametrs", "parameters", 
			"function", "constructor", "namedConstructor", "functionalCall", "statement", 
			"loop", "if", "block", "condition", "typeDeclaration", "declaration", 
			"assignment", "expression", "increment", "term", "factor", "values", 
			"field", "getter", "setter", "class", "classBody", "import_", "topLavelStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'abstract'", "'as'", "'assert'", "'async'", "'await'", "'break'", 
			"'case'", "'catch'", "'class'", "'const'", "'continue'", "'covariant'", 
			"'default'", "'deferred'", "'do'", "'dynamic'", "'else'", "'enum'", "'export'", 
			"'extends'", "'extension'", "'external'", "'factory'", "'false'", "'final'", 
			"'finally'", "'for'", "'Function'", "'get'", "'gtilde'", "'hide'", "'if'", 
			"'implements'", "'import'", "'in'", "'interface'", "'is'", "'late'", 
			"'let'", "'library'", "'mixin'", "'native'", "'new'", "'null'", "'of'", 
			"'on'", "'operator'", "'part'", "'required'", "'rethrow'", "'return'", 
			"'set'", "'show'", "'static'", "'super'", "'switch'", "'sync'", "'this'", 
			"'throw'", "'true'", "'try'", "'typedef'", "'var'", "'void'", "'while'", 
			"'with'", "'yield'", "';'", "':'", "'&'", "'&&'", "'&='", "'@'", "','", 
			"'^'", "'^='", "'-='", "'-'", "'--'", "'!='", "'!'", "'|'", "'%'", "'%='", 
			"'+'", "'+='", "'++'", "'#'", "'|='", "'||'", "'?'", "'?.'", "'?..'", 
			"'??'", "'??='", "'/='", "'/'", "'~/'", "'~/='", "'~'", "'*'", "'*='", 
			"'.'", "'..'", "'...'", "'...?'", null, null, "'='", "'=>'", "')'", "'('", 
			"'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL_LITERAL", "ABSTRACT_", "AS_", "ASSERT_", "ASYNC_", "AWAIT_", 
			"BREAK_", "CASE_", "CATCH_", "CLASS_", "CONST_", "CONTINUE_", "COVARIANT_", 
			"DEFAULT_", "DEFERRED_", "DO_", "DYNAMIC_", "ELSE_", "ENUM_", "EXPORT_", 
			"EXTENDS_", "EXTENSION_", "EXTERNAL_", "FACTORY_", "FALSE_", "FINAL_", 
			"FINALLY_", "FOR_", "FUNCTION_", "GET_", "GTILDE_", "HIDE_", "IF_", "IMPLEMENTS_", 
			"IMPORT_", "IN_", "INTERFACE_", "IS_", "LATE_", "LET_", "LIBRARY_", "MIXIN_", 
			"NATIVE_", "NEW_", "NULL_", "OF_", "ON_", "OPERATOR_", "PART_", "REQUIRED_", 
			"RETHROW_", "RETURN_", "SET_", "SHOW_", "STATIC_", "SUPER_", "SWITCH_", 
			"SYNC_", "THIS_", "THROW_", "TRUE_", "TRY_", "TYPEDEF_", "VAR_", "VOID_", 
			"WHILE_", "WITH_", "YIELD_", "SC", "CO", "A", "AA", "AE", "AT", "C", 
			"CIR", "CIRE", "ME", "MINUS", "MM", "NE", "NOT", "P", "PC", "PE", "PL", 
			"PLE", "PLPL", "PO", "POE", "PP", "QU", "QUD", "QUDD", "QUQU", "QUQUEQ", 
			"SE", "SL", "SQS", "SQSE", "SQUIG", "ST", "STE", "D", "DD", "DDD", "DDDQ", 
			"VALUE", "NUMBER", "EQ", "EG", "CP", "OP", "OBC", "CBC", "OB", "CB", 
			"CMP", "WS", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "IDENTIFIER"
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
	public String getGrammarFileName() { return "DartFuncGrammaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DartFuncGrammaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DartFuncGrammaParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(IDENTIFIER);
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
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(DartFuncGrammaParser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			type();
			setState(61);
			match(IDENTIFIER);
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
	public static class OptionalParametrContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(DartFuncGrammaParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(DartFuncGrammaParser.EQ, 0); }
		public TerminalNode VALUE() { return getToken(DartFuncGrammaParser.VALUE, 0); }
		public OptionalParametrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalParametr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterOptionalParametr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitOptionalParametr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitOptionalParametr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalParametrContext optionalParametr() throws RecognitionException {
		OptionalParametrContext _localctx = new OptionalParametrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_optionalParametr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			type();
			setState(64);
			match(IDENTIFIER);
			setState(65);
			match(EQ);
			setState(66);
			match(VALUE);
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
	public static class OptionalParametrsContext extends ParserRuleContext {
		public List<OptionalParametrContext> optionalParametr() {
			return getRuleContexts(OptionalParametrContext.class);
		}
		public OptionalParametrContext optionalParametr(int i) {
			return getRuleContext(OptionalParametrContext.class,i);
		}
		public List<TerminalNode> C() { return getTokens(DartFuncGrammaParser.C); }
		public TerminalNode C(int i) {
			return getToken(DartFuncGrammaParser.C, i);
		}
		public OptionalParametrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalParametrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterOptionalParametrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitOptionalParametrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitOptionalParametrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalParametrsContext optionalParametrs() throws RecognitionException {
		OptionalParametrsContext _localctx = new OptionalParametrsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_optionalParametrs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			optionalParametr();
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(69);
						match(C);
						setState(70);
						optionalParametr();
						}
						} 
					}
					setState(75);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				break;
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
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> C() { return getTokens(DartFuncGrammaParser.C); }
		public TerminalNode C(int i) {
			return getToken(DartFuncGrammaParser.C, i);
		}
		public TerminalNode OB() { return getToken(DartFuncGrammaParser.OB, 0); }
		public OptionalParametrsContext optionalParametrs() {
			return getRuleContext(OptionalParametrsContext.class,0);
		}
		public TerminalNode CB() { return getToken(DartFuncGrammaParser.CB, 0); }
		public TerminalNode OBC() { return getToken(DartFuncGrammaParser.OBC, 0); }
		public TerminalNode CBC() { return getToken(DartFuncGrammaParser.CBC, 0); }
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			parameter();
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(79);
						match(C);
						setState(80);
						parameter();
						}
						} 
					}
					setState(85);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			}
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==C) {
					{
					setState(88);
					match(C);
					}
				}

				}
				break;
			case 2:
				{
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					{
					setState(91);
					match(C);
					setState(92);
					match(OB);
					setState(93);
					optionalParametrs();
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==C) {
						{
						setState(94);
						match(C);
						}
					}

					setState(97);
					match(CB);
					}
					}
					break;
				case 2:
					{
					{
					setState(99);
					match(C);
					setState(100);
					match(OBC);
					setState(101);
					optionalParametrs();
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==C) {
						{
						setState(102);
						match(C);
						}
					}

					setState(105);
					match(CBC);
					}
					}
					break;
				}
				}
				break;
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DartFuncGrammaParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(DartFuncGrammaParser.OP, 0); }
		public TerminalNode CP() { return getToken(DartFuncGrammaParser.CP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode VOID_() { return getToken(DartFuncGrammaParser.VOID_, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID_:
				{
				setState(111);
				match(VOID_);
				}
				break;
			case IDENTIFIER:
				{
				setState(112);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(115);
			match(IDENTIFIER);
			setState(116);
			match(OP);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(117);
				parameters();
				}
			}

			setState(120);
			match(CP);
			setState(121);
			block();
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
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DartFuncGrammaParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(DartFuncGrammaParser.OP, 0); }
		public TerminalNode CP() { return getToken(DartFuncGrammaParser.CP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SC() { return getToken(DartFuncGrammaParser.SC, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IDENTIFIER);
			setState(124);
			match(OP);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(125);
				parameters();
				}
			}

			setState(128);
			match(CP);
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBC:
				{
				setState(129);
				block();
				}
				break;
			case SC:
				{
				setState(130);
				match(SC);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class NamedConstructorContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartFuncGrammaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartFuncGrammaParser.IDENTIFIER, i);
		}
		public TerminalNode D() { return getToken(DartFuncGrammaParser.D, 0); }
		public TerminalNode OP() { return getToken(DartFuncGrammaParser.OP, 0); }
		public TerminalNode CP() { return getToken(DartFuncGrammaParser.CP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SC() { return getToken(DartFuncGrammaParser.SC, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public NamedConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterNamedConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitNamedConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitNamedConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedConstructorContext namedConstructor() throws RecognitionException {
		NamedConstructorContext _localctx = new NamedConstructorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_namedConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(IDENTIFIER);
			setState(134);
			match(D);
			setState(135);
			match(IDENTIFIER);
			setState(136);
			match(OP);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(137);
				parameters();
				}
			}

			setState(140);
			match(CP);
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBC:
				{
				setState(141);
				block();
				}
				break;
			case SC:
				{
				setState(142);
				match(SC);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class FunctionalCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DartFuncGrammaParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(DartFuncGrammaParser.OP, 0); }
		public TerminalNode CP() { return getToken(DartFuncGrammaParser.CP, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public FunctionalCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterFunctionalCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitFunctionalCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitFunctionalCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalCallContext functionalCall() throws RecognitionException {
		FunctionalCallContext _localctx = new FunctionalCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionalCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(IDENTIFIER);
			setState(146);
			match(OP);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUE || _la==IDENTIFIER) {
				{
				setState(147);
				values();
				}
			}

			setState(150);
			match(CP);
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
	public static class StatementContext extends ParserRuleContext {
		public FunctionalCallContext functionalCall() {
			return getRuleContext(FunctionalCallContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(152);
				functionalCall();
				}
				break;
			case 2:
				{
				setState(153);
				assignment();
				}
				break;
			case 3:
				{
				setState(154);
				loop();
				}
				break;
			case 4:
				{
				setState(155);
				declaration();
				}
				break;
			case 5:
				{
				setState(156);
				if_();
				}
				break;
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
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode FOR_() { return getToken(DartFuncGrammaParser.FOR_, 0); }
		public TerminalNode OP() { return getToken(DartFuncGrammaParser.OP, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<TerminalNode> SC() { return getTokens(DartFuncGrammaParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(DartFuncGrammaParser.SC, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartFuncGrammaParser.CP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE_() { return getToken(DartFuncGrammaParser.WHILE_, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_loop);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR_:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(159);
				match(FOR_);
				setState(160);
				match(OP);
				setState(161);
				declaration();
				setState(162);
				match(SC);
				setState(163);
				condition();
				setState(164);
				match(SC);
				setState(165);
				expression();
				setState(166);
				match(CP);
				setState(167);
				block();
				}
				}
				break;
			case WHILE_:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(169);
				match(WHILE_);
				setState(170);
				match(OP);
				setState(171);
				condition();
				setState(172);
				match(CP);
				setState(173);
				block();
				}
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF_() { return getToken(DartFuncGrammaParser.IF_, 0); }
		public TerminalNode OP() { return getToken(DartFuncGrammaParser.OP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartFuncGrammaParser.CP, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE_() { return getToken(DartFuncGrammaParser.ELSE_, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode SC() { return getToken(DartFuncGrammaParser.SC, 0); }
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(IF_);
			setState(178);
			match(OP);
			setState(179);
			condition();
			setState(180);
			match(CP);
			setState(181);
			block();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_) {
				{
				setState(182);
				match(ELSE_);
				setState(187);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DYNAMIC_:
				case FINAL_:
				case FOR_:
				case IF_:
				case LATE_:
				case VAR_:
				case WHILE_:
				case IDENTIFIER:
					{
					setState(183);
					statement();
					setState(184);
					match(SC);
					}
					break;
				case OBC:
					{
					setState(186);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OBC() { return getToken(DartFuncGrammaParser.OBC, 0); }
		public TerminalNode CBC() { return getToken(DartFuncGrammaParser.CBC, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SC() { return getTokens(DartFuncGrammaParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(DartFuncGrammaParser.SC, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(OBC);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558681423872L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 288230376151711749L) != 0)) {
				{
				{
				setState(192);
				statement();
				setState(193);
				match(SC);
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(CBC);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CMP() { return getToken(DartFuncGrammaParser.CMP, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(DartFuncGrammaParser.BOOL_LITERAL, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MM:
			case PLPL:
			case VALUE:
			case NUMBER:
			case OP:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(202);
				expression();
				setState(203);
				match(CMP);
				setState(204);
				expression();
				}
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(BOOL_LITERAL);
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
	public static class TypeDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode FINAL_() { return getToken(DartFuncGrammaParser.FINAL_, 0); }
		public TerminalNode VAR_() { return getToken(DartFuncGrammaParser.VAR_, 0); }
		public TerminalNode DYNAMIC_() { return getToken(DartFuncGrammaParser.DYNAMIC_, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeDeclaration);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(FINAL_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(VAR_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				match(DYNAMIC_);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(213);
				match(FINAL_);
				setState(214);
				type();
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
	public static class DeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode LATE_() { return getToken(DartFuncGrammaParser.LATE_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartFuncGrammaParser.IDENTIFIER, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaration);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LATE_) {
					{
					setState(217);
					match(LATE_);
					}
				}

				setState(220);
				typeDeclaration();
				setState(221);
				assignment();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LATE_) {
					{
					setState(223);
					match(LATE_);
					}
				}

				setState(226);
				typeDeclaration();
				setState(227);
				match(IDENTIFIER);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DartFuncGrammaParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(DartFuncGrammaParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(IDENTIFIER);
			setState(232);
			match(EQ);
			setState(233);
			expression();
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PL() { return getTokens(DartFuncGrammaParser.PL); }
		public TerminalNode PL(int i) {
			return getToken(DartFuncGrammaParser.PL, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(DartFuncGrammaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(DartFuncGrammaParser.MINUS, i);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				term();
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS || _la==PL) {
					{
					{
					setState(236);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(237);
					term();
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				increment();
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
	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DartFuncGrammaParser.IDENTIFIER, 0); }
		public TerminalNode MM() { return getToken(DartFuncGrammaParser.MM, 0); }
		public TerminalNode PLPL() { return getToken(DartFuncGrammaParser.PLPL, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_increment);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(246);
				match(IDENTIFIER);
				setState(247);
				match(MM);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(248);
				match(MM);
				setState(249);
				match(IDENTIFIER);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(250);
				match(IDENTIFIER);
				setState(251);
				match(PLPL);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(252);
				match(PLPL);
				setState(253);
				match(IDENTIFIER);
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> ST() { return getTokens(DartFuncGrammaParser.ST); }
		public TerminalNode ST(int i) {
			return getToken(DartFuncGrammaParser.ST, i);
		}
		public List<TerminalNode> SL() { return getTokens(DartFuncGrammaParser.SL); }
		public TerminalNode SL(int i) {
			return getToken(DartFuncGrammaParser.SL, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			factor();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SL || _la==ST) {
				{
				{
				setState(257);
				_la = _input.LA(1);
				if ( !(_la==SL || _la==ST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(258);
				factor();
				}
				}
				setState(263);
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
	public static class FactorContext extends ParserRuleContext {
		public FunctionalCallContext functionalCall() {
			return getRuleContext(FunctionalCallContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(DartFuncGrammaParser.NUMBER, 0); }
		public TerminalNode VALUE() { return getToken(DartFuncGrammaParser.VALUE, 0); }
		public TerminalNode OP() { return getToken(DartFuncGrammaParser.OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartFuncGrammaParser.CP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartFuncGrammaParser.IDENTIFIER, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				functionalCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(VALUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(267);
				match(OP);
				setState(268);
				expression();
				setState(269);
				match(CP);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				match(IDENTIFIER);
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
	public static class ValuesContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartFuncGrammaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartFuncGrammaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(DartFuncGrammaParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(DartFuncGrammaParser.VALUE, i);
		}
		public List<TerminalNode> C() { return getTokens(DartFuncGrammaParser.C); }
		public TerminalNode C(int i) {
			return getToken(DartFuncGrammaParser.C, i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !(_la==VALUE || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(275);
					match(C);
					setState(276);
					_la = _input.LA(1);
					if ( !(_la==VALUE || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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
	public static class FieldContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SC() { return getToken(DartFuncGrammaParser.SC, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			declaration();
			setState(285);
			match(SC);
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
	public static class GetterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GET_() { return getToken(DartFuncGrammaParser.GET_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartFuncGrammaParser.IDENTIFIER, 0); }
		public TerminalNode EG() { return getToken(DartFuncGrammaParser.EG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SC() { return getToken(DartFuncGrammaParser.SC, 0); }
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitGetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitGetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_getter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			type();
			setState(288);
			match(GET_);
			setState(289);
			match(IDENTIFIER);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EG) {
				{
				setState(290);
				match(EG);
				setState(291);
				expression();
				setState(292);
				match(SC);
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
	public static class SetterContext extends ParserRuleContext {
		public TerminalNode SET_() { return getToken(DartFuncGrammaParser.SET_, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartFuncGrammaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartFuncGrammaParser.IDENTIFIER, i);
		}
		public TerminalNode OP() { return getToken(DartFuncGrammaParser.OP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartFuncGrammaParser.CP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EG() { return getToken(DartFuncGrammaParser.EG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SC() { return getToken(DartFuncGrammaParser.SC, 0); }
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitSetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitSetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(SET_);
			setState(297);
			match(IDENTIFIER);
			setState(298);
			match(OP);
			setState(299);
			type();
			setState(300);
			match(IDENTIFIER);
			setState(301);
			match(CP);
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EG:
				{
				{
				setState(302);
				match(EG);
				setState(303);
				expression();
				setState(304);
				match(SC);
				}
				}
				break;
			case OBC:
				{
				setState(306);
				block();
				}
				break;
			case DYNAMIC_:
			case FINAL_:
			case LATE_:
			case SET_:
			case VAR_:
			case VOID_:
			case CBC:
			case IDENTIFIER:
				break;
			default:
				break;
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
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS_() { return getToken(DartFuncGrammaParser.CLASS_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartFuncGrammaParser.IDENTIFIER, 0); }
		public TerminalNode OBC() { return getToken(DartFuncGrammaParser.OBC, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CBC() { return getToken(DartFuncGrammaParser.CBC, 0); }
		public TerminalNode ABSTRACT_() { return getToken(DartFuncGrammaParser.ABSTRACT_, 0); }
		public TerminalNode EXTENDS_() { return getToken(DartFuncGrammaParser.EXTENDS_, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode WITH_() { return getToken(DartFuncGrammaParser.WITH_, 0); }
		public TerminalNode IMPLEMENTS_() { return getToken(DartFuncGrammaParser.IMPLEMENTS_, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT_) {
				{
				setState(309);
				match(ABSTRACT_);
				}
			}

			setState(312);
			match(CLASS_);
			setState(313);
			match(IDENTIFIER);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS_) {
				{
				setState(314);
				match(EXTENDS_);
				setState(315);
				type();
				}
			}

			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(318);
				match(WITH_);
				setState(319);
				type();
				}
			}

			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS_) {
				{
				setState(322);
				match(IMPLEMENTS_);
				setState(323);
				type();
				}
			}

			setState(326);
			match(OBC);
			setState(327);
			classBody();
			setState(328);
			match(CBC);
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
	public static class ClassBodyContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
		}
		public List<NamedConstructorContext> namedConstructor() {
			return getRuleContexts(NamedConstructorContext.class);
		}
		public NamedConstructorContext namedConstructor(int i) {
			return getRuleContext(NamedConstructorContext.class,i);
		}
		public List<GetterContext> getter() {
			return getRuleContexts(GetterContext.class);
		}
		public GetterContext getter(int i) {
			return getRuleContext(GetterContext.class,i);
		}
		public List<SetterContext> setter() {
			return getRuleContexts(SetterContext.class);
		}
		public SetterContext setter(int i) {
			return getRuleContext(SetterContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007749077794816L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 288230376151711747L) != 0)) {
				{
				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(330);
					function();
					}
					break;
				case 2:
					{
					setState(331);
					field();
					}
					break;
				case 3:
					{
					setState(332);
					constructor();
					}
					break;
				case 4:
					{
					setState(333);
					namedConstructor();
					}
					break;
				case 5:
					{
					setState(334);
					getter();
					}
					break;
				case 6:
					{
					setState(335);
					setter();
					}
					break;
				}
				}
				setState(340);
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
	public static class Import_Context extends ParserRuleContext {
		public TerminalNode IMPORT_() { return getToken(DartFuncGrammaParser.IMPORT_, 0); }
		public TerminalNode VALUE() { return getToken(DartFuncGrammaParser.VALUE, 0); }
		public Import_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterImport_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitImport_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitImport_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_Context import_() throws RecognitionException {
		Import_Context _localctx = new Import_Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_import_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(IMPORT_);
			setState(342);
			match(VALUE);
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
	public static class TopLavelStatementContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public TopLavelStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLavelStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterTopLavelStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitTopLavelStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitTopLavelStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLavelStatementContext topLavelStatement() throws RecognitionException {
		TopLavelStatementContext _localctx = new TopLavelStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_topLavelStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549823054852L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 288230376151711747L) != 0)) {
				{
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(344);
					function();
					}
					break;
				case 2:
					{
					setState(345);
					declaration();
					}
					break;
				case 3:
					{
					setState(346);
					class_();
					}
					break;
				}
				}
				setState(351);
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

	public static final String _serializedATN =
		"\u0004\u0001z\u0161\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003H\b\u0003\n\u0003\f\u0003"+
		"K\t\u0003\u0003\u0003M\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004R\b\u0004\n\u0004\f\u0004U\t\u0004\u0003\u0004W\b\u0004\u0001\u0004"+
		"\u0003\u0004Z\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004`\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004h\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004l\b\u0004\u0003\u0004n\b\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005r\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005w\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u007f\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0084\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u008b\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0090\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u0095\b\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u009e\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b0\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00bc\b\u000b\u0003\u000b"+
		"\u00be\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00c4\b\f\n\f\f"+
		"\f\u00c7\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00d0\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00d8\b\u000e\u0001\u000f\u0003\u000f\u00db\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00e1"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00e6\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00ef\b\u0011\n\u0011\f\u0011\u00f2\t\u0011\u0001"+
		"\u0011\u0003\u0011\u00f5\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ff"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0104\b\u0013"+
		"\n\u0013\f\u0013\u0107\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0111"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0116\b\u0015"+
		"\n\u0015\f\u0015\u0119\t\u0015\u0003\u0015\u011b\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0127\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0134\b\u0018\u0001"+
		"\u0019\u0003\u0019\u0137\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u013d\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0141"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0145\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0151\b\u001a\n\u001a"+
		"\f\u001a\u0154\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u015c\b\u001c\n\u001c\f\u001c\u015f"+
		"\t\u001c\u0001\u001c\u0000\u0000\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0003"+
		"\u0002\u0000OOVV\u0002\u0000bbff\u0002\u0000llzz\u0180\u0000:\u0001\u0000"+
		"\u0000\u0000\u0002<\u0001\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000"+
		"\u0006D\u0001\u0000\u0000\u0000\bN\u0001\u0000\u0000\u0000\nq\u0001\u0000"+
		"\u0000\u0000\f{\u0001\u0000\u0000\u0000\u000e\u0085\u0001\u0000\u0000"+
		"\u0000\u0010\u0091\u0001\u0000\u0000\u0000\u0012\u009d\u0001\u0000\u0000"+
		"\u0000\u0014\u00af\u0001\u0000\u0000\u0000\u0016\u00b1\u0001\u0000\u0000"+
		"\u0000\u0018\u00bf\u0001\u0000\u0000\u0000\u001a\u00cf\u0001\u0000\u0000"+
		"\u0000\u001c\u00d7\u0001\u0000\u0000\u0000\u001e\u00e5\u0001\u0000\u0000"+
		"\u0000 \u00e7\u0001\u0000\u0000\u0000\"\u00f4\u0001\u0000\u0000\u0000"+
		"$\u00fe\u0001\u0000\u0000\u0000&\u0100\u0001\u0000\u0000\u0000(\u0110"+
		"\u0001\u0000\u0000\u0000*\u0112\u0001\u0000\u0000\u0000,\u011c\u0001\u0000"+
		"\u0000\u0000.\u011f\u0001\u0000\u0000\u00000\u0128\u0001\u0000\u0000\u0000"+
		"2\u0136\u0001\u0000\u0000\u00004\u0152\u0001\u0000\u0000\u00006\u0155"+
		"\u0001\u0000\u0000\u00008\u015d\u0001\u0000\u0000\u0000:;\u0005z\u0000"+
		"\u0000;\u0001\u0001\u0000\u0000\u0000<=\u0003\u0000\u0000\u0000=>\u0005"+
		"z\u0000\u0000>\u0003\u0001\u0000\u0000\u0000?@\u0003\u0000\u0000\u0000"+
		"@A\u0005z\u0000\u0000AB\u0005n\u0000\u0000BC\u0005l\u0000\u0000C\u0005"+
		"\u0001\u0000\u0000\u0000DL\u0003\u0004\u0002\u0000EF\u0005K\u0000\u0000"+
		"FH\u0003\u0004\u0002\u0000GE\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JM\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000LI\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000M\u0007\u0001\u0000\u0000\u0000NV\u0003\u0002\u0001"+
		"\u0000OP\u0005K\u0000\u0000PR\u0003\u0002\u0001\u0000QO\u0001\u0000\u0000"+
		"\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VS\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000Wm\u0001\u0000\u0000\u0000"+
		"XZ\u0005K\u0000\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Zn\u0001\u0000\u0000\u0000[\\\u0005K\u0000\u0000\\]\u0005t\u0000\u0000"+
		"]_\u0003\u0006\u0003\u0000^`\u0005K\u0000\u0000_^\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0005u\u0000\u0000"+
		"bl\u0001\u0000\u0000\u0000cd\u0005K\u0000\u0000de\u0005r\u0000\u0000e"+
		"g\u0003\u0006\u0003\u0000fh\u0005K\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005s\u0000\u0000"+
		"jl\u0001\u0000\u0000\u0000k[\u0001\u0000\u0000\u0000kc\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mY\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000n\t\u0001\u0000\u0000\u0000or\u0005"+
		"A\u0000\u0000pr\u0003\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005z\u0000\u0000tv\u0005"+
		"q\u0000\u0000uw\u0003\b\u0004\u0000vu\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005p\u0000\u0000yz\u0003"+
		"\u0018\f\u0000z\u000b\u0001\u0000\u0000\u0000{|\u0005z\u0000\u0000|~\u0005"+
		"q\u0000\u0000}\u007f\u0003\b\u0004\u0000~}\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0083"+
		"\u0005p\u0000\u0000\u0081\u0084\u0003\u0018\f\u0000\u0082\u0084\u0005"+
		"E\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\r\u0001\u0000\u0000\u0000\u0085\u0086\u0005z\u0000"+
		"\u0000\u0086\u0087\u0005h\u0000\u0000\u0087\u0088\u0005z\u0000\u0000\u0088"+
		"\u008a\u0005q\u0000\u0000\u0089\u008b\u0003\b\u0004\u0000\u008a\u0089"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u008f\u0005p\u0000\u0000\u008d\u0090\u0003"+
		"\u0018\f\u0000\u008e\u0090\u0005E\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u000f\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0005z\u0000\u0000\u0092\u0094\u0005q\u0000\u0000"+
		"\u0093\u0095\u0003*\u0015\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005p\u0000\u0000\u0097\u0011\u0001\u0000\u0000\u0000\u0098\u009e"+
		"\u0003\u0010\b\u0000\u0099\u009e\u0003 \u0010\u0000\u009a\u009e\u0003"+
		"\u0014\n\u0000\u009b\u009e\u0003\u001e\u000f\u0000\u009c\u009e\u0003\u0016"+
		"\u000b\u0000\u009d\u0098\u0001\u0000\u0000\u0000\u009d\u0099\u0001\u0000"+
		"\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u0013\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0005\u001c\u0000\u0000\u00a0\u00a1\u0005q\u0000"+
		"\u0000\u00a1\u00a2\u0003\u001e\u000f\u0000\u00a2\u00a3\u0005E\u0000\u0000"+
		"\u00a3\u00a4\u0003\u001a\r\u0000\u00a4\u00a5\u0005E\u0000\u0000\u00a5"+
		"\u00a6\u0003\"\u0011\u0000\u00a6\u00a7\u0005p\u0000\u0000\u00a7\u00a8"+
		"\u0003\u0018\f\u0000\u00a8\u00b0\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"B\u0000\u0000\u00aa\u00ab\u0005q\u0000\u0000\u00ab\u00ac\u0003\u001a\r"+
		"\u0000\u00ac\u00ad\u0005p\u0000\u0000\u00ad\u00ae\u0003\u0018\f\u0000"+
		"\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u009f\u0001\u0000\u0000\u0000"+
		"\u00af\u00a9\u0001\u0000\u0000\u0000\u00b0\u0015\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0005!\u0000\u0000\u00b2\u00b3\u0005q\u0000\u0000\u00b3\u00b4"+
		"\u0003\u001a\r\u0000\u00b4\u00b5\u0005p\u0000\u0000\u00b5\u00bd\u0003"+
		"\u0018\f\u0000\u00b6\u00bb\u0005\u0012\u0000\u0000\u00b7\u00b8\u0003\u0012"+
		"\t\u0000\u00b8\u00b9\u0005E\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bc\u0003\u0018\f\u0000\u00bb\u00b7\u0001\u0000\u0000\u0000"+
		"\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000"+
		"\u00bd\u00b6\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u0017\u0001\u0000\u0000\u0000\u00bf\u00c5\u0005r\u0000\u0000\u00c0"+
		"\u00c1\u0003\u0012\t\u0000\u00c1\u00c2\u0005E\u0000\u0000\u00c2\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c0\u0001\u0000\u0000\u0000\u00c4\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005s\u0000\u0000\u00c9\u0019\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0003\"\u0011\u0000\u00cb\u00cc\u0005v"+
		"\u0000\u0000\u00cc\u00cd\u0003\"\u0011\u0000\u00cd\u00d0\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d0\u0005\u0001\u0000\u0000\u00cf\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u001b\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d8\u0003\u0000\u0000\u0000\u00d2\u00d8\u0005\u001a\u0000"+
		"\u0000\u00d3\u00d8\u0005@\u0000\u0000\u00d4\u00d8\u0005\u0011\u0000\u0000"+
		"\u00d5\u00d6\u0005\u001a\u0000\u0000\u00d6\u00d8\u0003\u0000\u0000\u0000"+
		"\u00d7\u00d1\u0001\u0000\u0000\u0000\u00d7\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d3\u0001\u0000\u0000\u0000\u00d7\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u001d\u0001\u0000\u0000\u0000"+
		"\u00d9\u00db\u0005\'\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0003\u001c\u000e\u0000\u00dd\u00de\u0003 \u0010\u0000\u00de\u00e6"+
		"\u0001\u0000\u0000\u0000\u00df\u00e1\u0005\'\u0000\u0000\u00e0\u00df\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0003\u001c\u000e\u0000\u00e3\u00e4\u0005"+
		"z\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00da\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e0\u0001\u0000\u0000\u0000\u00e6\u001f\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0005z\u0000\u0000\u00e8\u00e9\u0005n\u0000\u0000"+
		"\u00e9\u00ea\u0003\"\u0011\u0000\u00ea!\u0001\u0000\u0000\u0000\u00eb"+
		"\u00f0\u0003&\u0013\u0000\u00ec\u00ed\u0007\u0000\u0000\u0000\u00ed\u00ef"+
		"\u0003&\u0013\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f5\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0003$\u0012\u0000\u00f4\u00eb\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5#\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0005z\u0000\u0000\u00f7\u00ff\u0005P\u0000\u0000\u00f8"+
		"\u00f9\u0005P\u0000\u0000\u00f9\u00ff\u0005z\u0000\u0000\u00fa\u00fb\u0005"+
		"z\u0000\u0000\u00fb\u00ff\u0005X\u0000\u0000\u00fc\u00fd\u0005X\u0000"+
		"\u0000\u00fd\u00ff\u0005z\u0000\u0000\u00fe\u00f6\u0001\u0000\u0000\u0000"+
		"\u00fe\u00f8\u0001\u0000\u0000\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff%\u0001\u0000\u0000\u0000\u0100"+
		"\u0105\u0003(\u0014\u0000\u0101\u0102\u0007\u0001\u0000\u0000\u0102\u0104"+
		"\u0003(\u0014\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0107\u0001"+
		"\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001"+
		"\u0000\u0000\u0000\u0106\'\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000"+
		"\u0000\u0000\u0108\u0111\u0003\u0010\b\u0000\u0109\u0111\u0005m\u0000"+
		"\u0000\u010a\u0111\u0005l\u0000\u0000\u010b\u010c\u0005q\u0000\u0000\u010c"+
		"\u010d\u0003\"\u0011\u0000\u010d\u010e\u0005p\u0000\u0000\u010e\u0111"+
		"\u0001\u0000\u0000\u0000\u010f\u0111\u0005z\u0000\u0000\u0110\u0108\u0001"+
		"\u0000\u0000\u0000\u0110\u0109\u0001\u0000\u0000\u0000\u0110\u010a\u0001"+
		"\u0000\u0000\u0000\u0110\u010b\u0001\u0000\u0000\u0000\u0110\u010f\u0001"+
		"\u0000\u0000\u0000\u0111)\u0001\u0000\u0000\u0000\u0112\u011a\u0007\u0002"+
		"\u0000\u0000\u0113\u0114\u0005K\u0000\u0000\u0114\u0116\u0007\u0002\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000"+
		"\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000"+
		"\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000"+
		"\u0000\u011a\u0117\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b+\u0001\u0000\u0000\u0000\u011c\u011d\u0003\u001e\u000f\u0000"+
		"\u011d\u011e\u0005E\u0000\u0000\u011e-\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0003\u0000\u0000\u0000\u0120\u0121\u0005\u001e\u0000\u0000\u0121\u0126"+
		"\u0005z\u0000\u0000\u0122\u0123\u0005o\u0000\u0000\u0123\u0124\u0003\""+
		"\u0011\u0000\u0124\u0125\u0005E\u0000\u0000\u0125\u0127\u0001\u0000\u0000"+
		"\u0000\u0126\u0122\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000"+
		"\u0000\u0127/\u0001\u0000\u0000\u0000\u0128\u0129\u00055\u0000\u0000\u0129"+
		"\u012a\u0005z\u0000\u0000\u012a\u012b\u0005q\u0000\u0000\u012b\u012c\u0003"+
		"\u0000\u0000\u0000\u012c\u012d\u0005z\u0000\u0000\u012d\u0133\u0005p\u0000"+
		"\u0000\u012e\u012f\u0005o\u0000\u0000\u012f\u0130\u0003\"\u0011\u0000"+
		"\u0130\u0131\u0005E\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132"+
		"\u0134\u0003\u0018\f\u0000\u0133\u012e\u0001\u0000\u0000\u0000\u0133\u0132"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u01341\u0001"+
		"\u0000\u0000\u0000\u0135\u0137\u0005\u0002\u0000\u0000\u0136\u0135\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0005\n\u0000\u0000\u0139\u013c\u0005z"+
		"\u0000\u0000\u013a\u013b\u0005\u0015\u0000\u0000\u013b\u013d\u0003\u0000"+
		"\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000"+
		"\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013f\u0005C\u0000"+
		"\u0000\u013f\u0141\u0003\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0005\"\u0000\u0000\u0143\u0145\u0003\u0000\u0000\u0000"+
		"\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0005r\u0000\u0000\u0147"+
		"\u0148\u00034\u001a\u0000\u0148\u0149\u0005s\u0000\u0000\u01493\u0001"+
		"\u0000\u0000\u0000\u014a\u0151\u0003\n\u0005\u0000\u014b\u0151\u0003,"+
		"\u0016\u0000\u014c\u0151\u0003\f\u0006\u0000\u014d\u0151\u0003\u000e\u0007"+
		"\u0000\u014e\u0151\u0003.\u0017\u0000\u014f\u0151\u00030\u0018\u0000\u0150"+
		"\u014a\u0001\u0000\u0000\u0000\u0150\u014b\u0001\u0000\u0000\u0000\u0150"+
		"\u014c\u0001\u0000\u0000\u0000\u0150\u014d\u0001\u0000\u0000\u0000\u0150"+
		"\u014e\u0001\u0000\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151"+
		"\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152"+
		"\u0153\u0001\u0000\u0000\u0000\u01535\u0001\u0000\u0000\u0000\u0154\u0152"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0005#\u0000\u0000\u0156\u0157\u0005"+
		"l\u0000\u0000\u01577\u0001\u0000\u0000\u0000\u0158\u015c\u0003\n\u0005"+
		"\u0000\u0159\u015c\u0003\u001e\u000f\u0000\u015a\u015c\u00032\u0019\u0000"+
		"\u015b\u0158\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000"+
		"\u015b\u015a\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000"+
		"\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000"+
		"\u015e9\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000+I"+
		"LSVY_gkmqv~\u0083\u008a\u008f\u0094\u009d\u00af\u00bb\u00bd\u00c5\u00cf"+
		"\u00d7\u00da\u00e0\u00e5\u00f0\u00f4\u00fe\u0105\u0110\u0117\u011a\u0126"+
		"\u0133\u0136\u013c\u0140\u0144\u0150\u0152\u015b\u015d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}