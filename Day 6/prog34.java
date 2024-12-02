
interface Animal
{
	void eat();
}
class prog34 implements Animal
{
	public void eat()
	{
		System.out.println("Animal Eats!!");
	}
	public static void main(String[] args)
	{
		prog34 ob = new prog34();
		ob.eat();
	}
}
