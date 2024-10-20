java to show the use of labelled continue.

class prog18
{
	public static void main(String[] args)
	{
		label:
		for(int i=0;i<5;i++)
		{
			if(i==3)
			{
				continue label;
			}
			System.out.print(i+" ");
		}
	}
}
