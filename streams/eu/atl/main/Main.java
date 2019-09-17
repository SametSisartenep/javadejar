package eu.atl.main;

import java.io.*;

public class Main {
	private static final String FILE = "xanadu.txt";

	public static void
	main(String[] args) throws IOException
	{
		FileInputStream in = null;
		FileReader fin = null;
		int c;

	try{
		in = new FileInputStream(FILE);
		fin = new FileReader(FILE);
		while((c = in.read()) != -1)
			System.out.write(c);
		System.out.write('\n');
		while((c = fin.read()) != -1)
			System.out.write(c);
	}finally{
		if(in != null)
			in.close();
		if(fin != null)
			fin.close();
	}
	}
}
