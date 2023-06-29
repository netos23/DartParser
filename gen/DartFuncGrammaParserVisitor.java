// Generated from C:/Users/JohnyTwoJacket/IdeaProjects/DartParser/src/main/java\DartFuncGrammaParser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DartFuncGrammaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DartFuncGrammaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DartFuncGrammaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(DartFuncGrammaParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#classCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCall(DartFuncGrammaParser.ClassCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#optionalParametr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalParametr(DartFuncGrammaParser.OptionalParametrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#optionalParametrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalParametrs(DartFuncGrammaParser.OptionalParametrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(DartFuncGrammaParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(DartFuncGrammaParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(DartFuncGrammaParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#namedConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedConstructor(DartFuncGrammaParser.NamedConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#functionalCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionalCall(DartFuncGrammaParser.FunctionalCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DartFuncGrammaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(DartFuncGrammaParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(DartFuncGrammaParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DartFuncGrammaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DartFuncGrammaParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(DartFuncGrammaParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(DartFuncGrammaParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DartFuncGrammaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DartFuncGrammaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#signPM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignPM(DartFuncGrammaParser.SignPMContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#signTL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignTL(DartFuncGrammaParser.SignTLContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(DartFuncGrammaParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(DartFuncGrammaParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(DartFuncGrammaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(DartFuncGrammaParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(DartFuncGrammaParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(DartFuncGrammaParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(DartFuncGrammaParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(DartFuncGrammaParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(DartFuncGrammaParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#import_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_(DartFuncGrammaParser.Import_Context ctx);
	/**
	 * Visit a parse tree produced by {@link DartFuncGrammaParser#topLavelStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLavelStatement(DartFuncGrammaParser.TopLavelStatementContext ctx);
}