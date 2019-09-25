package eu.atl.lexer;

public class Word extends Token
{
	public String lexeme = "";
	public static final Word and, or, eq, ne, le, ge, minus, true, false, temp;

	and = new Word("&&", Tag.AND);
	or = new Word("||", Tag.OR);
	eq = new Word("==", Tag.EQ);
	ne = new Word("!=", Tag.NE);
	le = new Word("<=", Tag.LE);
	ge = new Word(">=", Tag.GE);
	minus = new Word("minus", Tag.MINUS);
	true = new Word("true", Tag.TRUE);
	false = new Word("false", Tag.FALSE);
	temp = new Word("t", Tag.TEMP);

	public
	Word(String s, int tag)
	{
		super(tag);
		lexeme = s;
	}

	public String
	toString()
	{
		return lexeme;
	}
}
