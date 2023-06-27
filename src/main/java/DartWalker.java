import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import reflection.Field;
import reflection.Method;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class DartWalker extends DartFuncGrammaParserBaseListener {

    File file;
    FileWriter writer;

    String className = "";
    Map<String, Field> fields = new HashMap<>();
    Map<String, Method> methods = new HashMap<>();

    Map<String, Field> inScopeFields = new HashMap<>();

    public DartWalker(File file) throws IOException {
        this.file = file;
        this.writer = new FileWriter(file + ".j");
    }

    @Override
    public void enterType(DartFuncGrammaParser.TypeContext ctx) {

        super.enterType(ctx);
    }

    @Override
    public void exitType(DartFuncGrammaParser.TypeContext ctx) {

        super.exitType(ctx);
    }

    @Override
    public void enterParameter(DartFuncGrammaParser.ParameterContext ctx) {

        super.enterParameter(ctx);
    }

    @Override
    public void exitParameter(DartFuncGrammaParser.ParameterContext ctx) {

        super.exitParameter(ctx);
    }

    @Override
    public void enterOptionalParametr(DartFuncGrammaParser.OptionalParametrContext ctx) {
        super.enterOptionalParametr(ctx);
    }

    @Override
    public void exitOptionalParametr(DartFuncGrammaParser.OptionalParametrContext ctx) {
        super.exitOptionalParametr(ctx);
    }

    @Override
    public void enterOptionalParametrs(DartFuncGrammaParser.OptionalParametrsContext ctx) {
        super.enterOptionalParametrs(ctx);
    }

    @Override
    public void exitOptionalParametrs(DartFuncGrammaParser.OptionalParametrsContext ctx) {
        super.exitOptionalParametrs(ctx);
    }

    @Override
    public void enterParameters(DartFuncGrammaParser.ParametersContext ctx) {
        super.enterParameters(ctx);
    }

    @Override
    public void exitParameters(DartFuncGrammaParser.ParametersContext ctx) {
        super.exitParameters(ctx);
    }


    @Override
    public void enterFunction(DartFuncGrammaParser.FunctionContext ctx) {

        try {
            String type = ctx.VOID_() == null ? ctx.type().getText().substring(0, 1).toUpperCase() : "V";
            String name = ctx.IDENTIFIER().getText();
            String params = ctx.parameters() == null ? "" : ctx.parameters().getText();
            System.out.println(params);
            writer.append(String.format(".method    public %s()%s\n", name, type));
            writer.append(String.format("   .limit stack    16\n"));
            writer.append(String.format("   .limit locals    16\n"));
            int i = 1;
            for (DartFuncGrammaParser.StatementContext statement : ctx.block().statement()) {
                if (statement.assignment() != null) {
                    assigment(statement);
                } else if (statement.declaration() != null) {
                    String var = statement.declaration().assignment().IDENTIFIER().getText();
                    String varType = statement.declaration().typeDeclaration().type().getText().substring(0, 1).toUpperCase();
                    if (fields.containsKey(var) || inScopeFields.containsKey(var)) {
                        throw new Exception("Такая переменная уже существует");
                    } else {
                        inScopeFields.put(var, new Field(varType, String.valueOf(i), new ArrayList<>()));
                        writer.append(String.format("   bipush    %s\n", countValue(statement.declaration().assignment().expression())));
                        if (i <= 3) {
                            writer.append(String.format("   istore_%d\n", i));
                        } else {
                            writer.append(String.format("   istore    %d\n", i));
                        }

                        i++;

                        //  в локальном скопе имя поля - это номер в хранилище
                    }


                }
            }
            writer.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        super.enterFunction(ctx);
    }

    private void assigment(DartFuncGrammaParser.StatementContext statement) throws Exception {
        String var = statement.assignment().IDENTIFIER().getText();
        Field field = fields.get(var);
        if (field != null) {
            // fix is type is different
            writer.append("   aload_0\n");
            String value = countValue(statement.assignment().expression());
            writer.append(String.format("   bipush    %s\n", value));
            writer.append(String.format("   putfield              %s/%s %s   \n", className,
                    field.getName(), field.getType()));

        } else {
            throw new Exception("Не найдено переменной");
        }
    }


    public String countValue(DartFuncGrammaParser.ExpressionContext expression) {
        return expression.term(0).factor(0).VALUE().getText();  // пока так
    }

    @Override
    public void exitFunction(DartFuncGrammaParser.FunctionContext ctx) {
        try {
            inScopeFields.clear();
            writer.append("return\n"); //FIXME
            writer.append(".end method\n\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        super.exitFunction(ctx);
    }

    @Override
    public void enterConstructor(DartFuncGrammaParser.ConstructorContext ctx) {
        super.enterConstructor(ctx);
    }

    @Override
    public void exitConstructor(DartFuncGrammaParser.ConstructorContext ctx) {
        super.exitConstructor(ctx);
    }

    @Override
    public void enterNamedConstructor(DartFuncGrammaParser.NamedConstructorContext ctx) {
        super.enterNamedConstructor(ctx);
    }

    @Override
    public void exitNamedConstructor(DartFuncGrammaParser.NamedConstructorContext ctx) {
        super.exitNamedConstructor(ctx);
    }


    @Override
    public void enterFunctionalCall(DartFuncGrammaParser.FunctionalCallContext ctx) {
        try {

            if (ctx.IDENTIFIER().getText().equals("print")) {
                writer.append("   getstatic             java/lang/System/out Ljava/io/PrintStream;\n");
                // разная логика, если переменная в скопе или нет
                String var = ctx.values().IDENTIFIER(0).getText();

                if (inScopeFields.get(var) != null) {
                    String name = inScopeFields.get(var).getName();
                    String type = inScopeFields.get(var).getType();
                    writer.append(String.format("   iload              %s\n", name));
                } else {
                    String name = fields.get(var).getName();
                    String type = fields.get(var).getType();
                    writer.append("   aload              0\n");
                    writer.append(String.format("   getfield              %s/%s %s\n", className, name, type ));
                }
                writer.append("   invokevirtual         java/io/PrintStream/println(I)V\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        super.enterFunctionalCall(ctx);
    }

    @Override
    public void exitFunctionalCall(DartFuncGrammaParser.FunctionalCallContext ctx) {
        super.exitFunctionalCall(ctx);
    }

    @Override
    public void enterStatement(DartFuncGrammaParser.StatementContext ctx) {
        super.enterStatement(ctx);
    }

    @Override
    public void exitStatement(DartFuncGrammaParser.StatementContext ctx) {
        super.exitStatement(ctx);
    }

    @Override
    public void enterLoop(DartFuncGrammaParser.LoopContext ctx) {
        super.enterLoop(ctx);
    }

    @Override
    public void exitLoop(DartFuncGrammaParser.LoopContext ctx) {
        super.exitLoop(ctx);
    }

    @Override
    public void enterIf(DartFuncGrammaParser.IfContext ctx) {
        super.enterIf(ctx);
    }

    @Override
    public void exitIf(DartFuncGrammaParser.IfContext ctx) {
        super.exitIf(ctx);
    }

    @Override
    public void enterBlock(DartFuncGrammaParser.BlockContext ctx) {
        super.enterBlock(ctx);
    }

    @Override
    public void exitBlock(DartFuncGrammaParser.BlockContext ctx) {
        super.exitBlock(ctx);
    }

    @Override
    public void enterCondition(DartFuncGrammaParser.ConditionContext ctx) {
        super.enterCondition(ctx);
    }

    @Override
    public void exitCondition(DartFuncGrammaParser.ConditionContext ctx) {
        super.exitCondition(ctx);
    }

    @Override
    public void enterTypeDeclaration(DartFuncGrammaParser.TypeDeclarationContext ctx) {
        super.enterTypeDeclaration(ctx);
    }

    @Override
    public void exitTypeDeclaration(DartFuncGrammaParser.TypeDeclarationContext ctx) {
        super.exitTypeDeclaration(ctx);
    }

    @Override
    public void enterDeclaration(DartFuncGrammaParser.DeclarationContext ctx) {
        super.enterDeclaration(ctx);
    }

    @Override
    public void exitDeclaration(DartFuncGrammaParser.DeclarationContext ctx) {
        super.exitDeclaration(ctx);
    }

    @Override
    public void enterAssignment(DartFuncGrammaParser.AssignmentContext ctx) {
        super.enterAssignment(ctx);
    }

    @Override
    public void exitAssignment(DartFuncGrammaParser.AssignmentContext ctx) {
        super.exitAssignment(ctx);
    }

    @Override
    public void enterExpression(DartFuncGrammaParser.ExpressionContext ctx) {
        for (DartFuncGrammaParser.TermContext term : ctx.term()) {

        }
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(DartFuncGrammaParser.ExpressionContext ctx) {
        super.exitExpression(ctx);
    }

    @Override
    public void enterIncrement(DartFuncGrammaParser.IncrementContext ctx) {
        super.enterIncrement(ctx);
    }

    @Override
    public void exitIncrement(DartFuncGrammaParser.IncrementContext ctx) {
        super.exitIncrement(ctx);
    }

    @Override
    public void enterTerm(DartFuncGrammaParser.TermContext ctx) {
        super.enterTerm(ctx);
    }

    @Override
    public void exitTerm(DartFuncGrammaParser.TermContext ctx) {
        super.exitTerm(ctx);
    }

    @Override
    public void enterFactor(DartFuncGrammaParser.FactorContext ctx) {
        super.enterFactor(ctx);
    }

    @Override
    public void exitFactor(DartFuncGrammaParser.FactorContext ctx) {
        super.exitFactor(ctx);
    }

    @Override
    public void enterValues(DartFuncGrammaParser.ValuesContext ctx) {
        super.enterValues(ctx);
    }

    @Override
    public void exitValues(DartFuncGrammaParser.ValuesContext ctx) {
        super.exitValues(ctx);
    }

    @Override
    public void enterField(DartFuncGrammaParser.FieldContext ctx) {
        try {
            String name = ctx.getChild(0).getChild(1).getText();
            String type = ctx.getChild(0).getChild(0).getText().substring(0, 1).toUpperCase(Locale.ROOT);
            writer.append(String.format(".field     %s %s\n",
                    name,
                    type));
            writer.flush();
            fields.put(name, new Field(type, name, new ArrayList<>()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        super.enterField(ctx);
    }

    @Override
    public void exitField(DartFuncGrammaParser.FieldContext ctx) {
        super.exitField(ctx);
    }

    @Override
    public void enterGetter(DartFuncGrammaParser.GetterContext ctx) {
        super.enterGetter(ctx);
    }

    @Override
    public void exitGetter(DartFuncGrammaParser.GetterContext ctx) {
        super.exitGetter(ctx);
    }

    @Override
    public void enterSetter(DartFuncGrammaParser.SetterContext ctx) {
        super.enterSetter(ctx);
    }

    @Override
    public void exitSetter(DartFuncGrammaParser.SetterContext ctx) {
        super.exitSetter(ctx);
    }

    @Override
    public void enterClass(DartFuncGrammaParser.ClassContext ctx) {
        try {
            className = file.getName();
            writer.append(String.format(".source    %s.java\n", className));
            writer.append(String.format(".class     public %s\n", className));
            writer.append(".super     java/lang/Object\n");

            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

        }
        super.enterClass(ctx);
    }

    public void generateEmptyConstruct() {
        try {
            writer.append(".method                  public <init>()V\n" +
                    "   .limit stack          1\n" +
                    "   .limit locals         1\n" +
                    "   .line                 1\n" +
                    "   aload_0\n" +
                    "   invokespecial         java/lang/Object/<init>()V\n" +
                    "   return\n" +
                    ".end method\n\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void exitClass(DartFuncGrammaParser.ClassContext ctx) {
        try {
            generateEmptyConstruct();
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        super.exitClass(ctx);
    }

    @Override
    public void enterClassBody(DartFuncGrammaParser.ClassBodyContext ctx) {
        super.enterClassBody(ctx);
    }

    @Override
    public void exitClassBody(DartFuncGrammaParser.ClassBodyContext ctx) {
        super.exitClassBody(ctx);
    }

    @Override
    public void enterImport_(DartFuncGrammaParser.Import_Context ctx) {
        super.enterImport_(ctx);
    }

    @Override
    public void exitImport_(DartFuncGrammaParser.Import_Context ctx) {
        super.exitImport_(ctx);
    }

    @Override
    public void enterTopLavelStatement(DartFuncGrammaParser.TopLavelStatementContext ctx) {
        super.enterTopLavelStatement(ctx);
    }

    @Override
    public void exitTopLavelStatement(DartFuncGrammaParser.TopLavelStatementContext ctx) {
        super.exitTopLavelStatement(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
