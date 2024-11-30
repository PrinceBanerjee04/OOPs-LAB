package p1;
public class prog33a
{
	public static String a = "Inside class of First Package";
}

class prog33
{
	public static void main(String[] args)
	{
		System.out.println(p1.prog33a.a);
		System.out.println(p2.prog33b.b);
	}
}
