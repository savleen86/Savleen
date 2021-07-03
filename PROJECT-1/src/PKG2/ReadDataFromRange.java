package PKG2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromRange 
{
	public void dataReadofaSingleRow(int initialrow, int endrow) throws IOException
	{
		File f = new File("C:\\Users\\isaini\\Desktop\\writef.txt");
		FileReader fr = new FileReader(f);
		BufferedReader  b = new BufferedReader(fr);
		String s;
		int a = 0;
		while((s=b.readLine())!=null)
		{
			a=a+1;
			if((a>=initialrow)&&(a<=endrow))
			{
				System.out.println(s);
				
			}
		}
		
	}

	public static void main(String[] args)  throws IOException
	{
		ReadDataFromRange t = new ReadDataFromRange();
		t.dataReadofaSingleRow(1, 3);
		

	}

}
