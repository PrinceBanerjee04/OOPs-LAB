Wap in java to show the narrowing conversion from 
	a) double to integer
	b) integer to byte

import java.util.*;
class prog7
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a decimal number : ");
		double d = in.nextDouble();
		int i = (int) d;
		byte b = (byte) i;
		System.out.println("Value of double variable : "+ d);
		System.out.println("Value of integer variable : "+ i);
		System.out.println("Value of byte variable : "+ b);
	}
}
