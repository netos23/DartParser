public class DartSemanticVisitor extends DartFuncGrammaParserBaseVisitor<Void>{
    @Override
    public Void visitType(DartFuncGrammaParser.TypeContext ctx) {
        System.out.println("Type visited" + ctx.getText());
        return super.visitType(ctx);
    }

    @Override
    public Void visitTopLavelStatement(DartFuncGrammaParser.TopLavelStatementContext ctx) {
        System.out.println("Type visited" + ctx.getText());
        return super.visitTopLavelStatement(ctx);
    }
}
