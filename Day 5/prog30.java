// Java program to show method overriding.

class animal
{
	public void eat()
	{
		System.out.println("Starting to eat");
	}
}
class dog extends animal
{
	public void eat()
	{
		System.out.println("Finished eating");
	}
}
class prog30
{
	public static void main(String[] args)
	{
		animal ob1 = new animal();
		dog ob2 = new dog();
		ob1.eat();
		ob2.eat();
	}
}
