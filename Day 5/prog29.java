java to show the use of super.

class animal
{
	public void eat()
	{
		System.out.println("Animal Eats");
	}
}
class dog extends animal
{
	public void eat()
	{
		super.eat();
		System.out.println("Dog eats");
	}
}
class prog29
{
	public static void main(String[] args)
	{
		dog ob = new dog();
		ob.eat();
	}
}
