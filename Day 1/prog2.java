import java.util.*;
class prog2
{
	public static void main(String[] args)
	{

		String roll = "20221005";
		int last = Integer.parseInt(roll.substring(roll.length()-4));
		int sum = 0;
		while(last>0)
		{
			int lastD = last % 10;
			sum = sum + lastD;
			last/=10;
		}
		System.out.println("Sum = " + sum);
	}
}
