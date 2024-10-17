Java program to show the use of labelled break. 

class prog17
{
	public static void main(String[] args)
	{
		label:{
				for(int i=1;i<=10;i++)
				{
					for(int j=1;j<=i;j++)
					{
						if(i==6)
						{
							break label;
						}
						System.out.print("*");
					}
					System.out.println("");
				}
			}
	}
}
