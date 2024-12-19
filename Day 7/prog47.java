Java program which will take input from the command prompt and show that on screen.

import java.io.*;
class prog47
{
	public static void main(String[] args) throws IOException
	{
		char ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter character, ! to quit : ");
		do {
			ch = (char)br.read();
			System.out.println(ch);
		} while(ch != '!');
	}
}
