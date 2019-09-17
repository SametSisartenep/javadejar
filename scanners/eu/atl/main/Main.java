package eu.atl.main;

import java.io.*;
import java.util.Scanner;

public class Main {
	private static final String FILE = "xanadu.txt";
	private static final String NUMFILE = "usnumbers.txt";

	public static void
	main(String[] args) throws IOException
	{
		Scanner s;
		double sum;

		s = null;
		sum = 0;
	try{
		s = new Scanner(new BufferedReader(new FileReader(FILE)));
		while(s.hasNext())
			System.out.println(s.next());
	}finally{
		if(s != null)
			s.close();
	}
	System.out.write('\n');
	try{
		s = new Scanner(new BufferedReader(new FileReader(NUMFILE)));
		while(s.hasNext()){
			if(s.hasNextDouble())
				sum += s.nextDouble();
			else
				s.next();
		}
	}finally{
		if(s != null)
			s.close();
	}
		System.out.println(sum);
	}
}
