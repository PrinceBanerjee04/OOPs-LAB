// Java program to show the use of ArithmaticException.

class prog37
{
	public static void main(String[] args)
	{
		int d, a;
 		try { 
 			d = 0;
 			a = 42 / d;
 		} catch (ArithmeticException e) {
 			System.out.println("Division by zero.");
 		}
 		System.out.println("After catch statement.");
	}
}
