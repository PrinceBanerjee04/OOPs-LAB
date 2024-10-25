Java to show the use of return.

class prog19
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			if(i==2)
			{
				System.out.println("The loop returned at : " + i);
				return;
			}
			System.out.println(i);
		}
	}
}
