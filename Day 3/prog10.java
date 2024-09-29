Java program to show the use of ?:(ternary) operator.

class prog10
{	
	public static void main(String[] args)
	{
		int a = 6, b = 9;
		int result = a < b ? a : b;
		System.out.println("Minimum among "+ a + " and " + b + " is : "+ result);
	}
}
