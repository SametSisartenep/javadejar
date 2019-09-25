package eu.atl.lexer;

import java.io.*;
import java.util.*;
import eu.atl.symbol.*;

public class Lexer
{
	public static int line = 1;
	char peek = ' ';
	HashTable words;

	words = new HashTable();

	public
	Lexer()
	{
		reserve(new Word("if", Tag.IF));
		reserve(new Word("else", Tag.ELSE));
		reserve(new Word("while", Tag.WHILE));
		reserve(new Word("do", Tag.DO));
		reserve(new Word("break", Tag.BREAK));
		reserve(Word.true);
		reserve(Word.false);
		reserve(Type.int);
		reserve(Type.char);
		reserve(Type.bool);
		reserve(Type.float);
	}

	void
	reserve(Word w)
	{
		words.put(w.lexeme, w);
	}

	void
	readch() throws IOException
	{
		peek = (char)System.in.read();
	}

	boolean
	readch(char c) throws IOException
	{
		readch();
		if(peek != c)
			return false;
		peek = ' ';
		return true;
	}

	boolean
	isdigit(char c)
	{
		return c >= '0' && c <= '9';
	}

	boolean
	isalpha(char c)
	{
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
	}

	boolean
	isalnum(char c)
	{
		return isalpha(c) || isdigit(c);
	}

	public Token
	scan() throws IOException
	{
		int v;
		double x, d;
		StringBuffer b;
		String s;
		Word w;

		for(;;){
			if(peek == ' ' || peek == '\t')
				continue;
			else if(peek == '\n')
				line++;
			else
				break;
			readch();
		}
		switch(peek){
		case '&':
			if(readch('&'))
				return Word.and;
			else
				return new Token('&');
		case '|':
			if(readch('|'))
				return Word.or;
			else
				return new Token('|');
		case '=':
			if(readch('='))
				return Word.eq;
			else
				return new Token('=');
		case '!':
			if(readch('='))
				return Word.ne;
			else
				return new Token('!');
		case '<':
			if(readch('='))
				return Word.le;
			else
				return new Token('<');
		case '>':
			if(readch('='))
				return Word.ge;
			else
				return new Token('>');
		}
		if(isdigit(peek)){
			v = 0;
			do{
				v = 10*v + (peek-'0');
				readch();
			}while(isdigit(peek));
			if(peek != '.')
				return new Num(v);
			x = v;
			d = 10;
			for(;;){
				readch();
				if(!isdigit(peek))
					break;
				x = x + (peek-'0')/d;
				d *= 10;
			}
			return new Real(x);
		}
		if(isalpha(peek)){
			b = new StringBuffer();
			do{
				b.append(peek);
				readch();
			}while(isalnum(peek));
			s = b.toString();
			w = (Word)words.get(s);
			if(w != null)
				return w;
			w = new Word(s, Tag.ID);
			words.put(s, w);
			return w;
		}
		t = new Token(peek);
		peek = ' ';
		return t;
	}
}
