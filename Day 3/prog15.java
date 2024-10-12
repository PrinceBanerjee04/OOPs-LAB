// Java program to show the use of break.

class prog15
{
	public static void main(String[] args)
	{
		int i, c = 0;
		for(i = 0; i <= 10;i++)
		{
			if(c == 6)
			{
				break;
			}
			System.out.println(i);
			c++;
		}
		System.out.println("The loop breaks at : " + c);
	}
}
