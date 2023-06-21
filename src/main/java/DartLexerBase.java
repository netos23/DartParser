import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;

public abstract class DartLexerBase extends Lexer {
	protected DartLexerBase(CharStream input) {
		super(input);
	}

	protected boolean CheckNotOpenBrace()
	{
		return _input.LA(1) != '{';
	}
}
