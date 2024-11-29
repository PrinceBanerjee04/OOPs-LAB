abstract class Animal
{
	abstract void eat();
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("Dog eats.");
	}
}
class prog32
{
	public static void main(String[] args)
	{
		Animal ob = new Dog();
		ob.eat();
	}
}
		
