//Java program which will copy the content of one file into another.

import java.io.*;
class prog48
{
 	public static void main(String args[]) throws IOException
	{
		int i;
		FileInputStream fin;
		FileOutputStream fout;
		try {
			try {
				fin = new FileInputStream(args[0]);
			} catch(FileNotFoundException e) {
 				System.out.println("Input File Not Found");
 				return;
 			}
 			try {
 				fout = new FileOutputStream(args[1]);
 			} catch(FileNotFoundException e) {
 				System.out.println("Error Opening Output File");
 				return;
 			}
 		}catch(ArrayIndexOutOfBoundsException e) {
 			System.out.println("Usage: CopyFile From To");
 			return;
		}
		try {
 			do {
 				i = fin.read();
 				if(i != -1) 
					fout.write(i);
 			} while(i != -1);
 		} catch(IOException e) {
 			System.out.println("File Error");
 		}
 		fin.close();
 		fout.close();
		System.out.println("File Copied Successfully.");
	}
}
