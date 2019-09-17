package eu.atl.main;

import java.io.*;

public class Main {
	public static void
	main(String[] args) throws IOException
	{
		FileInputStream in = null;
		int c;

	try{
		in = new FileInputStream("xanadu.txt");
		while((c = in.read()) != -1)
			System.out.write(c);
	}finally{
		if(in != null)
			in.close();
	}
	}
}
