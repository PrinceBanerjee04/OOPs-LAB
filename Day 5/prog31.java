java to show Dynamic Method Dispatch.

class A
{
	public void print()
	{
		System.out.println("Inside class A");
	}
}
class B extends A
{
	public void print()
	{
		System.out.println("Inside class B");
	}
}
class prog31
{
	public static void main(String[] args)
	{
		A a = new A();
		B b = new B();
		A r;
		r = a;
		r.print();
		r = b;
		r.print();
	}
}
