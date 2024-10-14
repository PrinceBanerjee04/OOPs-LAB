// Java program to show the use of continue.
class prog16
{
	public static void main(String[] args)
	{
		int i, c = 0;
		for(i = 0; i < 5; i++)
		{
			if(c==3)
			{
				System.out.println("The loop continued at : " + c);
				c++;
				continue;
			}
			System.out.println(i);
			c++;
		}
	}
}
