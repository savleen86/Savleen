package PKG2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataTillRowCount 
{
	public void Writedata(int rows) throws IOException
	{
		File f = new File("C:\\Users\\isaini\\Desktop\\writef.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter b = new BufferedWriter(fw); //bufferedwriter to write line by line
		System.out.println("Please enterdata for writing");
		Scanner s = new Scanner(System.in);
		String data;
		for(int i=1; i<=rows; i++)
		{
			data= s.nextLine();
			b.write(data);
			b.newLine();
			
		}
		b.close();
	}

	public static void main(String[] args) throws IOException 
	
	{
		WriteDataTillRowCount  t = new WriteDataTillRowCount ();
		t.Writedata(5);
			

	}

}
