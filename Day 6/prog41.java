// Java program to throw Throwable object from try and catch block.

class prog41
{
	static void THROW() throws IllegalAccessException 
	{
 		System.out.println("Inside");
 		throw new IllegalAccessException("demo");
 	}
 	public static void main(String args[]) 
	{
 		try {
 			THROW();
 		} catch (IllegalAccessException e) {
 			System.out.println("Caught " + e);
 		}
 	}
}

