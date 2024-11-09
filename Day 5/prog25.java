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

package p1;
public class as1a extends as1
{
	public static void display()
	{
		as1a ob = new as1a();
		System.out.println("Same package and subclass : ");
		System.out.println("Public access : " + ob.pubA);
		//System.out.println("Private access : " + ob.privA);
		System.out.println("Private access fails");
		System.out.println("Protected access : " + ob.procA);
		System.out.println("Default access : " + ob.defA + "\n");
	}
}
package p2;
import p1.as1;
public class as2 extends as1
{
	public static void display()
	{
		as2 ob = new as2();
		System.out.println("Different package and subclass : ");
		System.out.println("Public access : " + ob.pubA);
		//System.out.println("Private access : " + ob.privA);
		System.out.println("Private access fails.");
		System.out.println("Protected access : " + ob.procA);
		//System.out.println("Default access : " + ob.defA);
		System.out.println("Default access fails.");
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
