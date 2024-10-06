import javax.swing.JOptionPane;
class prog13
{
	public static void main(String[] args)
	{
		int i = 2;
		while(i <= 6)
		{
			JOptionPane.showMessageDialog(null, i, "First three even numbers", JOptionPane.PLAIN_MESSAGE);
			i+=2;
		}
	}
}
