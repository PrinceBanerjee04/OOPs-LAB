
import java.util.*;
class prog39
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Enter divisor value : ");
 			int d = in.nextInt();
 			int a = 42 / d;
			try {
				if(d==2) 
				{
 					int c[] = { 1 };
 					c[42] = 99;
 				}
 			} catch(ArrayIndexOutOfBoundsException e) {
 				System.out.println("Array index: " + e);
 			}
 		} catch(ArithmeticException e) {
 			System.out.println("Division by zero: " + e);
 		}
	}
}

