a menu driven GUI based program in Java to perform the following task:
1. addition 
2. subtraction
3. multiplication
4. division
 The user can perform the above tasks repetitively until he/she wants to quit.(use -99) to quit the program.


import javax.swing.JOptionPane;
class prog4
{
	public static void main(String[] args)
	{
		String a,b,choice,exit;
		float num1, num2, result;
		while(true)
		{
			choice = JOptionPane.showInputDialog("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division" );
			a = JOptionPane.showInputDialog("Enter first number: ");
			b = JOptionPane.showInputDialog("Enter second number: ");
			num1 = Float.parseFloat(a);
			num2 = Float.parseFloat(b);
			char ch = choice.charAt(0);
			switch(ch)
			{
				case '1' :
				{
					result = num1 + num2;
					JOptionPane.showMessageDialog(null, "Sum = "+result,"Results", JOptionPane.PLAIN_MESSAGE);
					break;
				}		
				case '2' :
				{
					result = num1 - num2;
					JOptionPane.showMessageDialog(null, "Difference = "+result,"Results", JOptionPane.PLAIN_MESSAGE);
					break;
				}
				case '3' :
				{
					result = num1 * num2;
					JOptionPane.showMessageDialog(null, "Product = "+result,"Results", JOptionPane.PLAIN_MESSAGE);
					break;
				}
				case '4' :
				{
					result = num1 / num2;
					JOptionPane.showMessageDialog(null, "Quotient = "+result,"Results", JOptionPane.PLAIN_MESSAGE);
					break;
				}
				default:
				{
				JOptionPane.showMessageDialog(null, "WRONG CHOICE!!", "DEFAULT", JOptionPane.ERROR_MESSAGE);
				break;
				}
			}
			exit = JOptionPane.showInputDialog("Enter any number to continue and -99 to exit");
			int ex = Integer.parseInt(exit);
			if(ex == -99)
			System.exit(0);
			
		}
	}
}
