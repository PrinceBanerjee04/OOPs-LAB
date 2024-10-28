//Java program to show the use of method overloading.

class prog20
{
	public static void main(String[] args)
	{
		System.out.println("Area of rectangle : " + area(3,4));
		System.out.println("Area of square : " + area(5));
	}
	public static int area(int l, int b)
	{
		return l*b;
	}
	public static int area(int s)
	{
		return s*s;
	}	

}
