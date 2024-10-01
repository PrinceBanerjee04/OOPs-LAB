java to show the use of nested if-else selection structure.


class prog12
{	
	public static void main(String[] args)
	{
		int a = 6, b = 9, c = 12, max;
		if(a > b)
		{
			if(a > c)
			{
				max = a;
			}
			else
			{
				max = c;
			}
		}
		else
		{
			if(b > c)
			{
				max = b;
			}
			else
			{
				max = c;
			}
		}
		System.out.println("Maximum : " + max);
	}
}
