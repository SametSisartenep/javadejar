package eu.atl.main;

import java.io.*;
import eu.atl.lexer.*;
import eu.atl.parser.*;

public class Main
{
	public static void
	main(String[] args) throws IOException
	{
		Lexer l;
		Parser p;

		l = new Lexer();
		p = new Parser(l);
		p.program();
		System.out.write('\n');
	}
}
