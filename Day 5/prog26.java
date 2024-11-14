// Java program to show the use of static method.

class sMethod
{
	public static void area(int l,int b)
	{
		System.out.println("Area : " + (l*b));
	}
}
class prog26
{
	public static void main(String[] args)
	{
		sMethod.area(4,5);
	}
}
