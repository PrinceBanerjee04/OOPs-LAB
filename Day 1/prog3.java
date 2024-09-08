Java program add two decimal numbers and show the sum.

import java.util.*;
class prog3
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number : ");
		double a = in.nextDouble();
		System.out.println("Enter second number : ");
		double b = in.nextDouble();
		double sum = a + b;
		System.out.println("Sum = " + sum);
	}
}
