package eu.atl.err;

public class Hunchback {
	public static void
	barf(String ctx)
	{
		System.err.println(ctx);
		System.exit('F');
	}
}
