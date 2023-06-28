// Generated from C:/Users/JohnyTwoJacket/IdeaProjects/DartParser/src/main/java\DartFuncGrammaParser.g4 by ANTLR 4.12.0
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
		RULE_assignment = 16, RULE_expression = 17, RULE_signPM = 18, RULE_signTL = 19, 
		RULE_increment = 20, RULE_term = 21, RULE_factor = 22, RULE_values = 23, 
		RULE_field = 24, RULE_getter = 25, RULE_setter = 26, RULE_class = 27, 
		RULE_classBody = 28, RULE_import_ = 29, RULE_topLavelStatement = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"type", "parameter", "optionalParametr", "optionalParametrs", "parameters", 
			"function", "constructor", "namedConstructor", "functionalCall", "statement", 
			"loop", "if", "block", "condition", "typeDeclaration", "declaration", 
			"assignment", "expression", "signPM", "signTL", "increment", "term", 
			"factor", "values", "field", "getter", "setter", "class", "classBody", 
			"import_", "topLavelStatement"
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
			setState(62);
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
			setState(64);
			type();
			setState(65);
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
			setState(67);
			type();
			setState(68);
			match(IDENTIFIER);
			setState(69);
			match(EQ);
			setState(70);
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
			setState(72);
			optionalParametr();
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(73);
						match(C);
						setState(74);
						optionalParametr();
						}
						} 
					}
					setState(79);
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
			setState(82);
			parameter();
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(83);
						match(C);
						setState(84);
						parameter();
						}
						} 
					}
					setState(89);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			}
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==C) {
					{
					setState(92);
					match(C);
					}
				}

				}
				break;
			case 2:
				{
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					{
					setState(95);
					match(C);
					setState(96);
					match(OB);
					setState(97);
					optionalParametrs();
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==C) {
						{
						setState(98);
						match(C);
						}
					}

					setState(101);
					match(CB);
					}
					}
					break;
				case 2:
					{
					{
					setState(103);
					match(C);
					setState(104);
					match(OBC);
					setState(105);
					optionalParametrs();
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==C) {
						{
						setState(106);
						match(C);
						}
					}

					setState(109);
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
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID_:
				{
				setState(115);
				match(VOID_);
				}
				break;
			case IDENTIFIER:
				{
				setState(116);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(119);
			match(IDENTIFIER);
			setState(120);
			match(OP);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(121);
				parameters();
				}
			}

			setState(124);
			match(CP);
			setState(125);
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
			setState(127);
			match(IDENTIFIER);
			setState(128);
			match(OP);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(129);
				parameters();
				}
			}

			setState(132);
			match(CP);
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBC:
				{
				setState(133);
				block();
				}
				break;
			case SC:
				{
				setState(134);
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
			setState(137);
			match(IDENTIFIER);
			setState(138);
			match(D);
			setState(139);
			match(IDENTIFIER);
			setState(140);
			match(OP);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(141);
				parameters();
				}
			}

			setState(144);
			match(CP);
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBC:
				{
				setState(145);
				block();
				}
				break;
			case SC:
				{
				setState(146);
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
			setState(149);
			match(IDENTIFIER);
			setState(150);
			match(OP);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 4407441752321L) != 0)) {
				{
				setState(151);
				values();
				}
			}

			setState(154);
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
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(156);
				functionalCall();
				}
				break;
			case 2:
				{
				setState(157);
				assignment();
				}
				break;
			case 3:
				{
				setState(158);
				loop();
				}
				break;
			case 4:
				{
				setState(159);
				declaration();
				}
				break;
			case 5:
				{
				setState(160);
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
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR_:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(163);
				match(FOR_);
				setState(164);
				match(OP);
				setState(165);
				declaration();
				setState(166);
				match(SC);
				setState(167);
				condition();
				setState(168);
				match(SC);
				setState(169);
				expression();
				setState(170);
				match(CP);
				setState(171);
				block();
				}
				}
				break;
			case WHILE_:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(173);
				match(WHILE_);
				setState(174);
				match(OP);
				setState(175);
				condition();
				setState(176);
				match(CP);
				setState(177);
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
			setState(181);
			match(IF_);
			setState(182);
			match(OP);
			setState(183);
			condition();
			setState(184);
			match(CP);
			setState(185);
			block();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_) {
				{
				setState(186);
				match(ELSE_);
				setState(191);
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
					setState(187);
					statement();
					setState(188);
					match(SC);
					}
					break;
				case OBC:
					{
					setState(190);
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
			setState(195);
			match(OBC);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558681423872L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 288230376151711749L) != 0)) {
				{
				{
				setState(196);
				statement();
				setState(197);
				match(SC);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
			setState(211);
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
				setState(206);
				expression();
				setState(207);
				match(CMP);
				setState(208);
				expression();
				}
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
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
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(FINAL_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(VAR_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				match(DYNAMIC_);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(217);
				match(FINAL_);
				setState(218);
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
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LATE_) {
					{
					setState(221);
					match(LATE_);
					}
				}

				setState(224);
				typeDeclaration();
				setState(225);
				assignment();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LATE_) {
					{
					setState(227);
					match(LATE_);
					}
				}

				setState(230);
				typeDeclaration();
				setState(231);
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
			setState(235);
			match(IDENTIFIER);
			setState(236);
			match(EQ);
			setState(237);
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
		public List<SignPMContext> signPM() {
			return getRuleContexts(SignPMContext.class);
		}
		public SignPMContext signPM(int i) {
			return getRuleContext(SignPMContext.class,i);
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
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				term();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS || _la==PL) {
					{
					{
					setState(240);
					signPM();
					setState(241);
					term();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
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
	public static class SignPMContext extends ParserRuleContext {
		public TerminalNode PL() { return getToken(DartFuncGrammaParser.PL, 0); }
		public TerminalNode MINUS() { return getToken(DartFuncGrammaParser.MINUS, 0); }
		public SignPMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signPM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterSignPM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitSignPM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitSignPM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignPMContext signPM() throws RecognitionException {
		SignPMContext _localctx = new SignPMContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_signPM);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==PL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class SignTLContext extends ParserRuleContext {
		public TerminalNode ST() { return getToken(DartFuncGrammaParser.ST, 0); }
		public TerminalNode SL() { return getToken(DartFuncGrammaParser.SL, 0); }
		public SignTLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signTL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).enterSignTL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartFuncGrammaParserListener ) ((DartFuncGrammaParserListener)listener).exitSignTL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartFuncGrammaParserVisitor ) return ((DartFuncGrammaParserVisitor<? extends T>)visitor).visitSignTL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignTLContext signTL() throws RecognitionException {
		SignTLContext _localctx = new SignTLContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_signTL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==SL || _la==ST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 40, RULE_increment);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(255);
				match(IDENTIFIER);
				setState(256);
				match(MM);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(257);
				match(MM);
				setState(258);
				match(IDENTIFIER);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(259);
				match(IDENTIFIER);
				setState(260);
				match(PLPL);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(261);
				match(PLPL);
				setState(262);
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
		public List<SignTLContext> signTL() {
			return getRuleContexts(SignTLContext.class);
		}
		public SignTLContext signTL(int i) {
			return getRuleContext(SignTLContext.class,i);
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
		enterRule(_localctx, 42, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			factor();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SL || _la==ST) {
				{
				{
				setState(266);
				signTL();
				setState(267);
				factor();
				}
				}
				setState(273);
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
		enterRule(_localctx, 44, RULE_factor);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				functionalCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(VALUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(277);
				match(OP);
				setState(278);
				expression();
				setState(279);
				match(CP);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 46, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(284);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(285);
				match(VALUE);
				}
				break;
			case 3:
				{
				setState(286);
				expression();
				}
				break;
			}
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C) {
					{
					{
					setState(289);
					match(C);
					setState(293);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(290);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(291);
						match(VALUE);
						}
						break;
					case 3:
						{
						setState(292);
						expression();
						}
						break;
					}
					}
					}
					setState(299);
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
		enterRule(_localctx, 48, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			declaration();
			setState(303);
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
		enterRule(_localctx, 50, RULE_getter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			type();
			setState(306);
			match(GET_);
			setState(307);
			match(IDENTIFIER);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EG) {
				{
				setState(308);
				match(EG);
				setState(309);
				expression();
				setState(310);
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
		enterRule(_localctx, 52, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(SET_);
			setState(315);
			match(IDENTIFIER);
			setState(316);
			match(OP);
			setState(317);
			type();
			setState(318);
			match(IDENTIFIER);
			setState(319);
			match(CP);
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EG:
				{
				{
				setState(320);
				match(EG);
				setState(321);
				expression();
				setState(322);
				match(SC);
				}
				}
				break;
			case OBC:
				{
				setState(324);
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
		enterRule(_localctx, 54, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT_) {
				{
				setState(327);
				match(ABSTRACT_);
				}
			}

			setState(330);
			match(CLASS_);
			setState(331);
			match(IDENTIFIER);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS_) {
				{
				setState(332);
				match(EXTENDS_);
				setState(333);
				type();
				}
			}

			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(336);
				match(WITH_);
				setState(337);
				type();
				}
			}

			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS_) {
				{
				setState(340);
				match(IMPLEMENTS_);
				setState(341);
				type();
				}
			}

			setState(344);
			match(OBC);
			setState(345);
			classBody();
			setState(346);
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
		enterRule(_localctx, 56, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007749077794816L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 288230376151711747L) != 0)) {
				{
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(348);
					function();
					}
					break;
				case 2:
					{
					setState(349);
					field();
					}
					break;
				case 3:
					{
					setState(350);
					constructor();
					}
					break;
				case 4:
					{
					setState(351);
					namedConstructor();
					}
					break;
				case 5:
					{
					setState(352);
					getter();
					}
					break;
				case 6:
					{
					setState(353);
					setter();
					}
					break;
				}
				}
				setState(358);
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
		enterRule(_localctx, 58, RULE_import_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(IMPORT_);
			setState(360);
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
		enterRule(_localctx, 60, RULE_topLavelStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549823054852L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 288230376151711747L) != 0)) {
				{
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(362);
					function();
					}
					break;
				case 2:
					{
					setState(363);
					declaration();
					}
					break;
				case 3:
					{
					setState(364);
					class_();
					}
					break;
				}
				}
				setState(369);
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
		"\u0004\u0001z\u0173\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003L\b\u0003\n\u0003\f\u0003O\t\u0003\u0003\u0003"+
		"Q\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004V\b\u0004\n\u0004"+
		"\f\u0004Y\t\u0004\u0003\u0004[\b\u0004\u0001\u0004\u0003\u0004^\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004d\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004l\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004p\b\u0004\u0003"+
		"\u0004r\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005v\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005{\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0083\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0088\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008f\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0094\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u0099\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00a2\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00b4\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00c0\b\u000b\u0003\u000b\u00c2\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u00c8\b\f\n\f\f\f\u00cb\t\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d4\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00dc\b\u000e\u0001\u000f\u0003\u000f\u00df\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00e5\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00ea\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00f4\b\u0011\n\u0011\f\u0011\u00f7\t\u0011\u0001\u0011\u0003"+
		"\u0011\u00fa\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0108\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u010e\b\u0015\n\u0015\f\u0015\u0111\t\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u011b\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0120\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0126\b\u0017\u0005\u0017\u0128\b\u0017\n\u0017"+
		"\f\u0017\u012b\t\u0017\u0003\u0017\u012d\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0139\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0146\b\u001a\u0001\u001b"+
		"\u0003\u001b\u0149\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u014f\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0153\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0157\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0163\b\u001c\n\u001c\f\u001c"+
		"\u0166\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u016e\b\u001e\n\u001e\f\u001e\u0171\t\u001e\u0001"+
		"\u001e\u0000\u0000\u001f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<\u0000\u0002\u0002"+
		"\u0000OOVV\u0002\u0000bbff\u0194\u0000>\u0001\u0000\u0000\u0000\u0002"+
		"@\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006H\u0001"+
		"\u0000\u0000\u0000\bR\u0001\u0000\u0000\u0000\nu\u0001\u0000\u0000\u0000"+
		"\f\u007f\u0001\u0000\u0000\u0000\u000e\u0089\u0001\u0000\u0000\u0000\u0010"+
		"\u0095\u0001\u0000\u0000\u0000\u0012\u00a1\u0001\u0000\u0000\u0000\u0014"+
		"\u00b3\u0001\u0000\u0000\u0000\u0016\u00b5\u0001\u0000\u0000\u0000\u0018"+
		"\u00c3\u0001\u0000\u0000\u0000\u001a\u00d3\u0001\u0000\u0000\u0000\u001c"+
		"\u00db\u0001\u0000\u0000\u0000\u001e\u00e9\u0001\u0000\u0000\u0000 \u00eb"+
		"\u0001\u0000\u0000\u0000\"\u00f9\u0001\u0000\u0000\u0000$\u00fb\u0001"+
		"\u0000\u0000\u0000&\u00fd\u0001\u0000\u0000\u0000(\u0107\u0001\u0000\u0000"+
		"\u0000*\u0109\u0001\u0000\u0000\u0000,\u011a\u0001\u0000\u0000\u0000."+
		"\u011f\u0001\u0000\u0000\u00000\u012e\u0001\u0000\u0000\u00002\u0131\u0001"+
		"\u0000\u0000\u00004\u013a\u0001\u0000\u0000\u00006\u0148\u0001\u0000\u0000"+
		"\u00008\u0164\u0001\u0000\u0000\u0000:\u0167\u0001\u0000\u0000\u0000<"+
		"\u016f\u0001\u0000\u0000\u0000>?\u0005z\u0000\u0000?\u0001\u0001\u0000"+
		"\u0000\u0000@A\u0003\u0000\u0000\u0000AB\u0005z\u0000\u0000B\u0003\u0001"+
		"\u0000\u0000\u0000CD\u0003\u0000\u0000\u0000DE\u0005z\u0000\u0000EF\u0005"+
		"n\u0000\u0000FG\u0005l\u0000\u0000G\u0005\u0001\u0000\u0000\u0000HP\u0003"+
		"\u0004\u0002\u0000IJ\u0005K\u0000\u0000JL\u0003\u0004\u0002\u0000KI\u0001"+
		"\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000PM\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u0007\u0001"+
		"\u0000\u0000\u0000RZ\u0003\u0002\u0001\u0000ST\u0005K\u0000\u0000TV\u0003"+
		"\u0002\u0001\u0000US\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000ZW\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[q\u0001\u0000\u0000\u0000\\^\u0005K\u0000\u0000]\\\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^r\u0001\u0000\u0000\u0000"+
		"_`\u0005K\u0000\u0000`a\u0005t\u0000\u0000ac\u0003\u0006\u0003\u0000b"+
		"d\u0005K\u0000\u0000cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ef\u0005u\u0000\u0000fp\u0001\u0000\u0000\u0000"+
		"gh\u0005K\u0000\u0000hi\u0005r\u0000\u0000ik\u0003\u0006\u0003\u0000j"+
		"l\u0005K\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000mn\u0005s\u0000\u0000np\u0001\u0000\u0000\u0000"+
		"o_\u0001\u0000\u0000\u0000og\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pr\u0001\u0000\u0000\u0000q]\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000r\t\u0001\u0000\u0000\u0000sv\u0005A\u0000\u0000tv\u0003\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wx\u0005z\u0000\u0000xz\u0005q\u0000\u0000y{\u0003\b"+
		"\u0004\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|}\u0005p\u0000\u0000}~\u0003\u0018\f\u0000~\u000b\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005z\u0000\u0000\u0080\u0082\u0005q\u0000"+
		"\u0000\u0081\u0083\u0003\b\u0004\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0087\u0005p\u0000\u0000\u0085\u0088\u0003\u0018\f\u0000\u0086"+
		"\u0088\u0005E\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\r\u0001\u0000\u0000\u0000\u0089\u008a\u0005"+
		"z\u0000\u0000\u008a\u008b\u0005h\u0000\u0000\u008b\u008c\u0005z\u0000"+
		"\u0000\u008c\u008e\u0005q\u0000\u0000\u008d\u008f\u0003\b\u0004\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0093\u0005p\u0000\u0000\u0091"+
		"\u0094\u0003\u0018\f\u0000\u0092\u0094\u0005E\u0000\u0000\u0093\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u000f"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005z\u0000\u0000\u0096\u0098\u0005"+
		"q\u0000\u0000\u0097\u0099\u0003.\u0017\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005p\u0000\u0000\u009b\u0011\u0001\u0000\u0000\u0000"+
		"\u009c\u00a2\u0003\u0010\b\u0000\u009d\u00a2\u0003 \u0010\u0000\u009e"+
		"\u00a2\u0003\u0014\n\u0000\u009f\u00a2\u0003\u001e\u000f\u0000\u00a0\u00a2"+
		"\u0003\u0016\u000b\u0000\u00a1\u009c\u0001\u0000\u0000\u0000\u00a1\u009d"+
		"\u0001\u0000\u0000\u0000\u00a1\u009e\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u0013"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u001c\u0000\u0000\u00a4\u00a5"+
		"\u0005q\u0000\u0000\u00a5\u00a6\u0003\u001e\u000f\u0000\u00a6\u00a7\u0005"+
		"E\u0000\u0000\u00a7\u00a8\u0003\u001a\r\u0000\u00a8\u00a9\u0005E\u0000"+
		"\u0000\u00a9\u00aa\u0003\"\u0011\u0000\u00aa\u00ab\u0005p\u0000\u0000"+
		"\u00ab\u00ac\u0003\u0018\f\u0000\u00ac\u00b4\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0005B\u0000\u0000\u00ae\u00af\u0005q\u0000\u0000\u00af\u00b0\u0003"+
		"\u001a\r\u0000\u00b0\u00b1\u0005p\u0000\u0000\u00b1\u00b2\u0003\u0018"+
		"\f\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00a3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00ad\u0001\u0000\u0000\u0000\u00b4\u0015\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0005!\u0000\u0000\u00b6\u00b7\u0005q\u0000\u0000\u00b7"+
		"\u00b8\u0003\u001a\r\u0000\u00b8\u00b9\u0005p\u0000\u0000\u00b9\u00c1"+
		"\u0003\u0018\f\u0000\u00ba\u00bf\u0005\u0012\u0000\u0000\u00bb\u00bc\u0003"+
		"\u0012\t\u0000\u00bc\u00bd\u0005E\u0000\u0000\u00bd\u00c0\u0001\u0000"+
		"\u0000\u0000\u00be\u00c0\u0003\u0018\f\u0000\u00bf\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c1\u00ba\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c2\u0017\u0001\u0000\u0000\u0000\u00c3\u00c9\u0005r\u0000\u0000"+
		"\u00c4\u00c5\u0003\u0012\t\u0000\u00c5\u00c6\u0005E\u0000\u0000\u00c6"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c8"+
		"\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005s\u0000\u0000\u00cd\u0019"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003\"\u0011\u0000\u00cf\u00d0\u0005"+
		"v\u0000\u0000\u00d0\u00d1\u0003\"\u0011\u0000\u00d1\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d4\u0005\u0001\u0000\u0000\u00d3\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u001b\u0001\u0000"+
		"\u0000\u0000\u00d5\u00dc\u0003\u0000\u0000\u0000\u00d6\u00dc\u0005\u001a"+
		"\u0000\u0000\u00d7\u00dc\u0005@\u0000\u0000\u00d8\u00dc\u0005\u0011\u0000"+
		"\u0000\u00d9\u00da\u0005\u001a\u0000\u0000\u00da\u00dc\u0003\u0000\u0000"+
		"\u0000\u00db\u00d5\u0001\u0000\u0000\u0000\u00db\u00d6\u0001\u0000\u0000"+
		"\u0000\u00db\u00d7\u0001\u0000\u0000\u0000\u00db\u00d8\u0001\u0000\u0000"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u001d\u0001\u0000\u0000"+
		"\u0000\u00dd\u00df\u0005\'\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0003\u001c\u000e\u0000\u00e1\u00e2\u0003 \u0010\u0000\u00e2"+
		"\u00ea\u0001\u0000\u0000\u0000\u00e3\u00e5\u0005\'\u0000\u0000\u00e4\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003\u001c\u000e\u0000\u00e7\u00e8"+
		"\u0005z\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00de\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e4\u0001\u0000\u0000\u0000\u00ea\u001f\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0005z\u0000\u0000\u00ec\u00ed\u0005n\u0000"+
		"\u0000\u00ed\u00ee\u0003\"\u0011\u0000\u00ee!\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f5\u0003*\u0015\u0000\u00f0\u00f1\u0003$\u0012\u0000\u00f1\u00f2"+
		"\u0003*\u0015\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00fa\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003"+
		"(\u0014\u0000\u00f9\u00ef\u0001\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa#\u0001\u0000\u0000\u0000\u00fb\u00fc\u0007\u0000\u0000"+
		"\u0000\u00fc%\u0001\u0000\u0000\u0000\u00fd\u00fe\u0007\u0001\u0000\u0000"+
		"\u00fe\'\u0001\u0000\u0000\u0000\u00ff\u0100\u0005z\u0000\u0000\u0100"+
		"\u0108\u0005P\u0000\u0000\u0101\u0102\u0005P\u0000\u0000\u0102\u0108\u0005"+
		"z\u0000\u0000\u0103\u0104\u0005z\u0000\u0000\u0104\u0108\u0005X\u0000"+
		"\u0000\u0105\u0106\u0005X\u0000\u0000\u0106\u0108\u0005z\u0000\u0000\u0107"+
		"\u00ff\u0001\u0000\u0000\u0000\u0107\u0101\u0001\u0000\u0000\u0000\u0107"+
		"\u0103\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108"+
		")\u0001\u0000\u0000\u0000\u0109\u010f\u0003,\u0016\u0000\u010a\u010b\u0003"+
		"&\u0013\u0000\u010b\u010c\u0003,\u0016\u0000\u010c\u010e\u0001\u0000\u0000"+
		"\u0000\u010d\u010a\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000"+
		"\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110+\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0112\u011b\u0003\u0010\b\u0000\u0113\u011b\u0005m\u0000\u0000\u0114"+
		"\u011b\u0005l\u0000\u0000\u0115\u0116\u0005q\u0000\u0000\u0116\u0117\u0003"+
		"\"\u0011\u0000\u0117\u0118\u0005p\u0000\u0000\u0118\u011b\u0001\u0000"+
		"\u0000\u0000\u0119\u011b\u0005z\u0000\u0000\u011a\u0112\u0001\u0000\u0000"+
		"\u0000\u011a\u0113\u0001\u0000\u0000\u0000\u011a\u0114\u0001\u0000\u0000"+
		"\u0000\u011a\u0115\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000"+
		"\u0000\u011b-\u0001\u0000\u0000\u0000\u011c\u0120\u0005z\u0000\u0000\u011d"+
		"\u0120\u0005l\u0000\u0000\u011e\u0120\u0003\"\u0011\u0000\u011f\u011c"+
		"\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u011e"+
		"\u0001\u0000\u0000\u0000\u0120\u012c\u0001\u0000\u0000\u0000\u0121\u0125"+
		"\u0005K\u0000\u0000\u0122\u0126\u0005z\u0000\u0000\u0123\u0126\u0005l"+
		"\u0000\u0000\u0124\u0126\u0003\"\u0011\u0000\u0125\u0122\u0001\u0000\u0000"+
		"\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0124\u0001\u0000\u0000"+
		"\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0121\u0001\u0000\u0000"+
		"\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000"+
		"\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u0129\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d/\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0003\u001e\u000f\u0000\u012f\u0130\u0005E\u0000\u0000\u0130"+
		"1\u0001\u0000\u0000\u0000\u0131\u0132\u0003\u0000\u0000\u0000\u0132\u0133"+
		"\u0005\u001e\u0000\u0000\u0133\u0138\u0005z\u0000\u0000\u0134\u0135\u0005"+
		"o\u0000\u0000\u0135\u0136\u0003\"\u0011\u0000\u0136\u0137\u0005E\u0000"+
		"\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0134\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u01393\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u00055\u0000\u0000\u013b\u013c\u0005z\u0000\u0000\u013c\u013d"+
		"\u0005q\u0000\u0000\u013d\u013e\u0003\u0000\u0000\u0000\u013e\u013f\u0005"+
		"z\u0000\u0000\u013f\u0145\u0005p\u0000\u0000\u0140\u0141\u0005o\u0000"+
		"\u0000\u0141\u0142\u0003\"\u0011\u0000\u0142\u0143\u0005E\u0000\u0000"+
		"\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0146\u0003\u0018\f\u0000\u0145"+
		"\u0140\u0001\u0000\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u01465\u0001\u0000\u0000\u0000\u0147\u0149"+
		"\u0005\u0002\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0005\n\u0000\u0000\u014b\u014e\u0005z\u0000\u0000\u014c\u014d\u0005"+
		"\u0015\u0000\u0000\u014d\u014f\u0003\u0000\u0000\u0000\u014e\u014c\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0152\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0005C\u0000\u0000\u0151\u0153\u0003\u0000"+
		"\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000"+
		"\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0155\u0005\"\u0000"+
		"\u0000\u0155\u0157\u0003\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0005r\u0000\u0000\u0159\u015a\u00038\u001c\u0000\u015a"+
		"\u015b\u0005s\u0000\u0000\u015b7\u0001\u0000\u0000\u0000\u015c\u0163\u0003"+
		"\n\u0005\u0000\u015d\u0163\u00030\u0018\u0000\u015e\u0163\u0003\f\u0006"+
		"\u0000\u015f\u0163\u0003\u000e\u0007\u0000\u0160\u0163\u00032\u0019\u0000"+
		"\u0161\u0163\u00034\u001a\u0000\u0162\u015c\u0001\u0000\u0000\u0000\u0162"+
		"\u015d\u0001\u0000\u0000\u0000\u0162\u015e\u0001\u0000\u0000\u0000\u0162"+
		"\u015f\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162"+
		"\u0161\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164"+
		"\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"9\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0005#\u0000\u0000\u0168\u0169\u0005l\u0000\u0000\u0169;\u0001\u0000"+
		"\u0000\u0000\u016a\u016e\u0003\n\u0005\u0000\u016b\u016e\u0003\u001e\u000f"+
		"\u0000\u016c\u016e\u00036\u001b\u0000\u016d\u016a\u0001\u0000\u0000\u0000"+
		"\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000"+
		"\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000"+
		"\u016f\u0170\u0001\u0000\u0000\u0000\u0170=\u0001\u0000\u0000\u0000\u0171"+
		"\u016f\u0001\u0000\u0000\u0000-MPWZ]ckoquz\u0082\u0087\u008e\u0093\u0098"+
		"\u00a1\u00b3\u00bf\u00c1\u00c9\u00d3\u00db\u00de\u00e4\u00e9\u00f5\u00f9"+
		"\u0107\u010f\u011a\u011f\u0125\u0129\u012c\u0138\u0145\u0148\u014e\u0152"+
		"\u0156\u0162\u0164\u016d\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}