package eu.atl.symbol;

import eu.atl.lexer.*;

public class Array extends Type
{
	public Type of;
	public int size = 1;

	public
	Array(int len, Type t)
	{
		super("[]", Tag.INDEX, len*t.width);
		size = len;
		of = t;
	}

	public String
	toString()
	{
		return "[" + size + "] " + of.toString();
	}
}
