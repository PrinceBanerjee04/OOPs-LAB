Java to show the use of Multiple catch block.

import java.util.*;
class prog38
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Enter divisor value : ");
 			int d = in.nextInt();
 			System.out.println("d = " + d);
 			int b = 42 / d;
 			int c[] = { 1, 2, 3, 4, 5 };
 			c[42] = 99;
 		} catch(ArithmeticException e) {
 			System.out.println("Result : " + e);
 		} catch(ArrayIndexOutOfBoundsException e) {
 			System.out.println("Array index: " + e);
 		}
 		System.out.println("After try/catch blocks.");
	}
}
