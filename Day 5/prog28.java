class animal
{
	String name;
	public void eat()
	{
		System.out.println("Eats!!");
	}
}
class dog extends animal
{
	public void display()
	{
		System.out.println("My name is : " + name);
	}
}
class prog28
{
	public static void main(String[] args)
	{
		dog ob = new dog();
		ob.name = "Cat";
		ob.display();
		ob.eat();
	}
}
