class prog6
{
	public static void main(String[] args)
	{
		int x = 5;
		if(x==5)
		{
			int y = 5;
			System.out.println("Value of x(inner scope) : " + x);
			System.out.println("Value of y(inner scope) : " + y);
			x--;
		}
		System.out.println("Value of x(outer scope) : " + x);
	      //System.out.println("Value of y(outer scope) : " + y);
	}
}
			
