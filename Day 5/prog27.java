Java to show the use of static variable.

class count
{
	static int c = 0;
	count()
	{
		c++;
	}
}
class prog27
{
	public static void main(String[] args)
	{
		count ob1 = new count();
		count ob2 = new count();
		System.out.println("Total objects created : " + count.c);
	}
}
		
