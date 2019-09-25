package eu.atl.symbol;

import eu.atl.lexer.*;

public class Type extends Word
{
	public int width = 0;
	public static final Type int, float, char, bool;

	int = new Type("int", Tag.BASIC, 4);
	float = new Type("float", Tag.BASIC, 8);
	char = new Type("char", Tag.BASIC, 1);
	bool = new Type("bool", Tag.BASIC, 1);

	public
	Type(Strings s, int tag, int w)
	{
		super(s, tag);
		width = w;
	}

	public static boolean
	isnumeric(Type t)
	{
		return t == Type.char || t == Type.int || t == Type.float;
	}

	public static Type
	max(Type t1, Type t2)
	{
		if(!isnumeric(t1) || !isnumeric(t2))
			return null;
		else if(t1 == Type.float || t2 == Type.float)
			return Type.float;
		else if(t1 == Type.int || t2 == Type.int)
			return Type.int;
		else
			return Type.char;
	}
}
