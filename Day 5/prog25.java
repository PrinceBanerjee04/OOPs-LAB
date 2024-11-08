// Java program to show the use of private, public, protected and default access specifiers.
package p1;
public class as1
{
	public String pubA = "Public Variable";
	private String privA = "Private Variable";
	protected String procA = "Protected Variable";
	String defA = "Default Variable";
	public static void display()
	{
		as1 ob = new as1();
		System.out.println("Same package and same class : ");
		System.out.println("Public access : " + ob.pubA);
		System.out.println("Private access : " + ob.privA);
		System.out.println("Protected access : " + ob.procA);
		System.out.println("Default access : " + ob.defA + "\n");
	}
}
	
public class prog25
{
	public static void main(String[] args)
	{
		p1.as1.display();
		p1.as1a.display();
		p2.as2.display();
		p2.as2a.display();
	}
}
