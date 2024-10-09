// Java program to show the use of switch-case.


import java.util.*;
class prog14
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a, b, choice, result = 0;
		System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division : ");
		choice = in.nextInt();
		System.out.println("Enter first number : ");
		a = in.nextInt();
		System.out.println("Enter second number : ");
		b = in.nextInt();
		switch(choice)
		{
			case 1:
			{
				result = a + b;
				break;
			}
			case 2:
			{
				result = a - b;
				break;
			}
			case 3:
			{
				result = a * b;
				break;
			}
			case 4:
			{
				result = a / b;
				break;
			}
			default:
			{
				System.out.println("WRONG CHOICE!!!");
				break;
			}
		}
		System.out.println("Result = "+ result);
	}
}
