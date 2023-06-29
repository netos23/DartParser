import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
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

    int i = 1; // счетчик для local storage, я не даун честно
    int labelI = 7; // счетчик регистров

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
            String params = "";
            if (ctx.parameters() != null) {
                for (DartFuncGrammaParser.ParameterContext parameter : ctx.parameters().parameter()) {
                    // каждый параметр еще надо в скоп добавлять
                    String paramType = parameter.type().getText().substring(0, 1).toUpperCase();
                    String paramName = parameter.IDENTIFIER().getText();
                    inScopeFields.put(paramName, new Field(paramType, String.valueOf(i), new ArrayList<>()));
                    i++;
                    params += paramType;
                }
            }
            // нужно определять сигнатуру метода
            // например int foo(int a, int b) будет foo(II)I
            if (methods.containsKey(name)) {
                throw new Exception("Такая функция уже существует");
            } else {
                methods.put(name, new Method(name, type, params));
            }
            if (name.equals("main")) {
                writer.append(".method                  public static main([Ljava/lang/String;)V\n");
            } else {
                writer.append(String.format(".method    public %s(%s)%s\n", name, params, type));
            }
            writer.append(String.format("   .limit stack    16\n"));
            writer.append(String.format("   .limit locals    16\n"));


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
            countValue(statement.assignment().expression());
            writer.append(String.format("   putfield              %s/%s %s   \n", className,
                    field.getName(), field.getType()));
            writer.flush();
        } else if (inScopeFields.get(var) != null) {
            field = inScopeFields.get(var);
            countValue(statement.assignment().expression());
            writer.append(String.format("   istore             %s  \n",
                    field.getName()));
            writer.flush();
        } else {
            throw new Exception("Не найдено переменной");
        }
    }


    public void countValue(DartFuncGrammaParser.ExpressionContext expression) {
        // Берем за базу то, что этот метод является первым вхождением во все дерево expression.
        // Мы проходимся по всему, посещаем их, если надо делаем это рекурсивно
        // Тут надо не забыть инкремент обработать
        expression(expression);

    }

    public void expression(DartFuncGrammaParser.ExpressionContext expression) {
        for (int i = 0; i < expression.term().size(); i++) {
            DartFuncGrammaParser.TermContext term = expression.term().get(i);
            term(term);
            if (i != 0) {
                try {
                    writer.append(String.format("   %s \n", expression.signPM().get(i - 1).PL() == null ? "isub" : "iadd"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

    public void term(DartFuncGrammaParser.TermContext term) {
        // проходимся по всем factor
        // если это просто factor оставляем число
        // если это выражение, считаем его
        // финальный стек любого term должен выглядеть как
        // знак2
        // значение3
        // знак1
        // значение2
        // значение1
        // То есть после этого в стеке остается значение
        // которое потом и присваивается
        try {
            for (int i = 0; i < term.factor().size(); i++) {
                DartFuncGrammaParser.FactorContext factor = term.factor(i);
                if (factor.IDENTIFIER() != null) {
                    Field field = inScopeFields.get(factor.IDENTIFIER().getText());
                    if (field == null) {
                        field = fields.get(factor.IDENTIFIER().getText());
                        writer.append(String.format("   aload_0     \n"));
                        writer.append(String.format("   getfield     %s/%s %s\n", className, field.getName(), field.getType()));
                    } else {
                        writer.append(String.format("   iload     %s\n", field.getName()));
                    }
                    System.out.println(factor.IDENTIFIER().getText());
                } else if (factor.VALUE() != null) {
                    writer.append(String.format("   ldc     %s\n", factor.VALUE().getText()));
                    System.out.println(factor.VALUE().getText());
                } else if (factor.expression() != null) {
                    expression(factor.expression()); // нейминг на уровне
                    // на уровне говна
                }
                if (i != 0) {
                    writer.append(String.format("   %s \n", term.signTL(i - 1).SL() == null ? "imul" : "idiv"));

                }
            }
        } catch (Exception e) {

        }

    }

    @Override
    public void exitFunction(DartFuncGrammaParser.FunctionContext ctx) {
        try {
            inScopeFields.clear();
            writer.append("return\n"); //FIXME
            writer.append(".end method\n\n");
            writer.flush();
            i = 1;
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
            if (ctx.parent instanceof DartFuncGrammaParser.ClassCallContext){
                return;
            }
            if (ctx.IDENTIFIER().getText().equals("print")) {
                writer.append("   getstatic             java/lang/System/out Ljava/io/PrintStream;\n");
                // разная логика, если переменная в скопе или нет
                if (ctx.values() != null) {
                    for (int i = 0; i < ctx.values().expression().size(); i++)
                        countValue(ctx.values().expression(i));
                }

                writer.append("   invokevirtual         java/io/PrintStream/println(I)V\n");
            } else {

                String methodName = ctx.IDENTIFIER().getText();
                // проверка на то, что вызываемый метод - констуктор
                if (methodName.equals(className)){
                    return;
                }
                writer.append(String.format("   aload_0\n"));
                Method method = methods.get(methodName);
                if (ctx.values().children != null) {
                    for (Object value : ctx.values().children) {
                        if (value instanceof DartFuncGrammaParser.ExpressionContext) {
                            countValue((DartFuncGrammaParser.ExpressionContext) value);
                        }

                    }
                }
                writer.append(String.format("   invokevirtual %s/%s(%s)%s\n",
                        this.className,
                        method.getName(),
                        method.getSignature(), method.getReturnType()));

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
        if (ctx.assignment() != null) {
            try {
                assigment(ctx);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
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
        try {
            countValue(ctx.condition().expression(0));
            countValue(ctx.condition().expression(1));
            String CMP = ctx.condition().CMP().getText();
            if (CMP.equals("==")) {
                writer.append(String.format("   if_icmpne             LABEL0x%s\n", labelI));
            }
//            if (CMP.equals("!=")) {
//                writer.append(String.format("   if_icmpeq             LABEL0x%s\n", labelI));
//            }
            if (CMP.equals("<")) {
                writer.append(String.format("   if_icmpge             LABEL0x%s\n", labelI));
            }
            if (CMP.equals(">")) {
                writer.append(String.format("   if_icmple             LABEL0x%s\n", labelI));
            }

        } catch (Exception e) {

        }

        super.enterIf(ctx);
    }

    @Override
    public void exitIf(DartFuncGrammaParser.IfContext ctx) {
        try {
            writer.append(String.format("LABEL0x%s:\n", labelI));
            labelI++;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
        // здесь мы просто запихиваем то, что осталось в стеке от countValue()
        // потому что в методе и в классе - разная
        // в классе нужно еще добавлять все переменные в дефолтный конструктор

        try {

            String name;
            if (ctx.IDENTIFIER() == null) {
                name = ctx.assignment().IDENTIFIER().getText();
            } else {
                name = ctx.IDENTIFIER().getText();
            }
            if (fields.containsKey(name)) {
                throw new Exception("Такая переменная уже существует");
            }
            if (fields.containsKey(name) || inScopeFields.containsKey(name)) {
                throw new Exception("Такая переменная уже существует");
            } // FIX IT
            String varType = ctx.typeDeclaration().type().getText().substring(0, 1).toUpperCase();

            RuleContext parent = ctx.parent;
            if (parent instanceof DartFuncGrammaParser.FieldContext) {

            } else if (parent instanceof DartFuncGrammaParser.StatementContext) {

                inScopeFields.put(name, new Field(varType, String.valueOf(i), new ArrayList<>()));
                if (ctx.assignment() != null) {
                    if (ctx.assignment().expression().term().get(0).factor().get(0).functionalCall() != null) {
                        name = ctx.typeDeclaration().type().IDENTIFIER().getText();
                        String type = ctx.assignment().expression().term().get(0).factor().get(0).functionalCall().IDENTIFIER().getText();
                        inScopeFields.put(name, new Field(type, name, new ArrayList<>()));
                        writer.append(String.format("   new   %s\n", type));
                        writer.append(String.format("   dup\n"));
                        writer.append(String.format("   invokespecial         %s/<init>()V\n", type));
                        writer.append(String.format("   astore         %s\n", i));
                        i++;
                        return;
                    }
                    countValue(ctx.assignment().expression());
                    if (i <= 3) {
                        writer.append(String.format("   istore_%d\n", i));
                    } else {
                        writer.append(String.format("   istore    %d\n", i)); // по идее istore x должен работать и для i<3
                    }
                    i++;

                }

            }


        } catch (Exception e) {

        }

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
    public void enterClassCall(DartFuncGrammaParser.ClassCallContext ctx) {
        // вызов метода у класса нужно просто поместить в стек сам класс и параметры вызываемого метода
        try {
            String className = ctx.IDENTIFIER().getText();
            Field clazz = inScopeFields.get(className);
            if (clazz != null) {
                writer.append(String.format("   aload %s\n", clazz.getName()));
                if (ctx.functionalCall().values() != null) {
                    for (Object value : ctx.functionalCall().values().children) {
                        if (value instanceof DartFuncGrammaParser.ExpressionContext) {
                            countValue((DartFuncGrammaParser.ExpressionContext) value);
                        }

                    }
                }

            }
            String methodName = ctx.functionalCall().IDENTIFIER().getText();
            Method method = methods.get(methodName);
            writer.append(String.format("   invokevirtual %s/%s(%s)%s\n",
                    this.className,
                    method.getName(),
                    method.getSignature(), method.getReturnType()));
        } catch (Exception e) {

        }

        super.enterClassCall(ctx);
    }

    @Override
    public void exitClassCall(DartFuncGrammaParser.ClassCallContext ctx) {
        super.exitClassCall(ctx);
    }

    @Override
    public void enterExpression(DartFuncGrammaParser.ExpressionContext ctx) {
        // сразу надо сказать, почему мы делаем проход так убого
        // потому что нам важна взаимосвязь между номером term и знака
//        for (int i = 0; i < ctx.term().size(); i++) {
//            DartFuncGrammaParser.TermContext term = ctx.term().get(i);
//            if (term.factor().size() != 1){
//                continue; // если в term несколько значений обрабатываем их непосредственно входом в term
//            }
//            DartFuncGrammaParser.FactorContext factor = term.factor(0); // нам нужно знать индекс, чтобы потом взять знак
//            if (factor.VALUE() != null) {  //
//                // запихиваем в стек
//                System.out.println(factor.VALUE().getText());
//            } else if (factor.IDENTIFIER() != null) {
//                System.out.println(factor.IDENTIFIER().getText());
//            }
//            if (i != 0) {
//                System.out.println(ctx.signPM().get(i - 1).MINUS() == null ? '+' : '-');
//            }
//
//        }
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(DartFuncGrammaParser.ExpressionContext ctx) {
//        for (DartFuncGrammaParser.SignPMContext pm : ctx.signPM()) {
//            // при выходе мы заносим знаки в стек
//            // System.out.println(pm.MINUS() == null ? "+" : "-");
//            // это такой гавнокод
//        }
        super.exitExpression(ctx);
    }

    @Override
    public void enterSignPM(DartFuncGrammaParser.SignPMContext ctx) {

        super.enterSignPM(ctx);
    }

    @Override
    public void exitSignPM(DartFuncGrammaParser.SignPMContext ctx) {
        super.exitSignPM(ctx);
    }

    @Override
    public void enterSignTL(DartFuncGrammaParser.SignTLContext ctx) {
        super.enterSignTL(ctx);
    }

    @Override
    public void exitSignTL(DartFuncGrammaParser.SignTLContext ctx) {
        super.exitSignTL(ctx);
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
//        if (ctx.factor().size() == 1) return;
//        for (int i = 0; i < ctx.factor().size(); i++) {
//            if (ctx.factor().get(i).VALUE()!=null){
//                System.out.println(ctx.factor().get(i).VALUE());
//            } else if (ctx.factor().get(i).IDENTIFIER()!=null){
//                System.out.println(ctx.factor().get(i).IDENTIFIER());
//            }
//            // если это что-то сложнее, чем обычная переменная или число/строка,
//            // то это отдается на откуп входу в другой term или expression
//            if (i!=0) {
//                System.out.println(ctx.signTL(i-1).getText());
//            }
//        }
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
            generateEmptyConstruct(ctx);
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

        }
        super.enterClass(ctx);
    }

    public void generateEmptyConstruct(DartFuncGrammaParser.ClassContext ctx) {
        try {
            for (DartFuncGrammaParser.FieldContext field : ctx.classBody().field()) {
                String name;
                if (field.declaration().IDENTIFIER() != null) {
                    name = field.declaration().IDENTIFIER().getText();
                } else {
                    name = field.declaration().assignment().IDENTIFIER().getText();
                }

                String type = field.declaration().typeDeclaration().type().getText().substring(0, 1).toUpperCase(Locale.ROOT);

                writer.append(String.format(".field   %s %s\n", name, type));
            }
            writer.append(".method                  public <init>()V\n" +
                    "   .limit stack          16\n" +
                    "   .limit locals         16\n" +
                    "   .line                 1\n" +
                    "   aload_0\n" +
                    "   invokespecial         java/lang/Object/<init>()V\n");
            // здесь идет инициализация всех полей
            for (DartFuncGrammaParser.FieldContext field : ctx.classBody().field()) {
                if (field.declaration().assignment() != null) {
                    writer.append(String.format("   aload_0\n"));
                    String name;
                    name = field.declaration().assignment().IDENTIFIER().getText();
                    if (fields.get(name) != null) {
                        throw new Exception("Переменная уже существует");
                    }
                    countValue(field.declaration().assignment().expression());
                    String type = field.declaration().typeDeclaration().type().getText().substring(0, 1).toUpperCase(Locale.ROOT);
                    fields.put(name, new Field(type, name, new ArrayList<>()));
                    writer.append(String.format("   putfield %s/%s %s\n", className, name, type));
                } else {
                    String name = field.declaration().IDENTIFIER().getText();
                    if (fields.get(name) != null) {
                        throw new Exception("Переменная уже существует");
                    }
                    String type = field.declaration().typeDeclaration().type().getText().substring(0, 1).toUpperCase(Locale.ROOT);
                    fields.put(name, new Field(type, name, new ArrayList<>()));
                }

            }
            writer.append(
                    "   return\n" +
                            ".end method\n\n");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void exitClass(DartFuncGrammaParser.ClassContext ctx) {
        try {
            if (!methods.containsKey("main")) {
                throw new Exception("main функция не найдена");
            }

            writer.flush();
        } catch (Exception e) {
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
