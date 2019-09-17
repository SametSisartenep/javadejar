package eu.atl.main;

import eu.atl.err.*;

public class HelloWorld {
	public static void
	main(String[] args)
	{
		Rectangle r0, r1;

		r0 = new Rectangle(0, 0, 100, 100);
		r1 = new Rectangle(10, 50, 90, 90);
		System.out.println(r0.cmp(r1));
		r0.min = new Point(20, 60);
		System.out.println(r0.cmp(r1));
		r0.min = new Point(30, 60);
		System.out.println(r0.cmp(r1));
		System.exit(0);
	}
}
