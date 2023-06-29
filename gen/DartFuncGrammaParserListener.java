// Generated from C:/Users/JohnyTwoJacket/IdeaProjects/DartParser/src/main/java\DartFuncGrammaParser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DartFuncGrammaParser}.
 */
public interface DartFuncGrammaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DartFuncGrammaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DartFuncGrammaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(DartFuncGrammaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(DartFuncGrammaParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#classCall}.
	 * @param ctx the parse tree
	 */
	void enterClassCall(DartFuncGrammaParser.ClassCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#classCall}.
	 * @param ctx the parse tree
	 */
	void exitClassCall(DartFuncGrammaParser.ClassCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#optionalParametr}.
	 * @param ctx the parse tree
	 */
	void enterOptionalParametr(DartFuncGrammaParser.OptionalParametrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#optionalParametr}.
	 * @param ctx the parse tree
	 */
	void exitOptionalParametr(DartFuncGrammaParser.OptionalParametrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#optionalParametrs}.
	 * @param ctx the parse tree
	 */
	void enterOptionalParametrs(DartFuncGrammaParser.OptionalParametrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#optionalParametrs}.
	 * @param ctx the parse tree
	 */
	void exitOptionalParametrs(DartFuncGrammaParser.OptionalParametrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(DartFuncGrammaParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(DartFuncGrammaParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(DartFuncGrammaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(DartFuncGrammaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(DartFuncGrammaParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(DartFuncGrammaParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#namedConstructor}.
	 * @param ctx the parse tree
	 */
	void enterNamedConstructor(DartFuncGrammaParser.NamedConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#namedConstructor}.
	 * @param ctx the parse tree
	 */
	void exitNamedConstructor(DartFuncGrammaParser.NamedConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#functionalCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionalCall(DartFuncGrammaParser.FunctionalCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#functionalCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionalCall(DartFuncGrammaParser.FunctionalCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DartFuncGrammaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DartFuncGrammaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(DartFuncGrammaParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(DartFuncGrammaParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(DartFuncGrammaParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(DartFuncGrammaParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DartFuncGrammaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DartFuncGrammaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(DartFuncGrammaParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(DartFuncGrammaParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(DartFuncGrammaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(DartFuncGrammaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DartFuncGrammaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DartFuncGrammaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DartFuncGrammaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DartFuncGrammaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DartFuncGrammaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DartFuncGrammaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#signPM}.
	 * @param ctx the parse tree
	 */
	void enterSignPM(DartFuncGrammaParser.SignPMContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#signPM}.
	 * @param ctx the parse tree
	 */
	void exitSignPM(DartFuncGrammaParser.SignPMContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#signTL}.
	 * @param ctx the parse tree
	 */
	void enterSignTL(DartFuncGrammaParser.SignTLContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#signTL}.
	 * @param ctx the parse tree
	 */
	void exitSignTL(DartFuncGrammaParser.SignTLContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(DartFuncGrammaParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(DartFuncGrammaParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(DartFuncGrammaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(DartFuncGrammaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(DartFuncGrammaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(DartFuncGrammaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(DartFuncGrammaParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(DartFuncGrammaParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(DartFuncGrammaParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(DartFuncGrammaParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(DartFuncGrammaParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(DartFuncGrammaParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(DartFuncGrammaParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(DartFuncGrammaParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(DartFuncGrammaParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(DartFuncGrammaParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(DartFuncGrammaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(DartFuncGrammaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#import_}.
	 * @param ctx the parse tree
	 */
	void enterImport_(DartFuncGrammaParser.Import_Context ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#import_}.
	 * @param ctx the parse tree
	 */
	void exitImport_(DartFuncGrammaParser.Import_Context ctx);
	/**
	 * Enter a parse tree produced by {@link DartFuncGrammaParser#topLavelStatement}.
	 * @param ctx the parse tree
	 */
	void enterTopLavelStatement(DartFuncGrammaParser.TopLavelStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartFuncGrammaParser#topLavelStatement}.
	 * @param ctx the parse tree
	 */
	void exitTopLavelStatement(DartFuncGrammaParser.TopLavelStatementContext ctx);
}