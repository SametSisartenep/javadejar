package eu.atl.symbol;

import java.util.*;
import eu.atl.lexer.*;
import eu.atl.ir.*;

public class Env
{
	private Hashtable tab;
	protected Env prev;

	public
	Env(Env p)
	{
		tab = new Hashtable();
		prev = p;
	}

	public void
	put(Token w, Id i)
	{
		tab.put(w, i);
	}

	public Id
	get(Token w)
	{
		Env e;
		Id found;

		for(e = this; e != null; e = e.prev){
			found = (Id)e.tab.get(w);
			if(found != null)
				return found;
		}
		return null;
	}
}
