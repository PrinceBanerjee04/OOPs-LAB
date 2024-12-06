//Java program to implement multiple inheritances.

interface Animal
{
	void eat();
}
abstract class Dog
{
	abstract void sleep();
}
class prog35 extends Dog implements Animal
{
	public void eat()
	{
		System.out.println("Animal Eats!!");
	}
	public void sleep()
	{
		System.out.println("Dog Sleeps!!");
	}
	public static void main(String[] args)
	{
		prog35 ob = new prog35();
		ob.eat();
		ob.sleep();
	}
}
