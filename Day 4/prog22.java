Java program to show call by value.

class prog22
{
	public static void call(int i)
	{
		i+=10;
	}
	public static void main(String[] args)
	{
		int i = 10;
		System.out.println("Value before call : " + i);
		call(i);
		System.out.println("Value after call : " + i);
	}
}
