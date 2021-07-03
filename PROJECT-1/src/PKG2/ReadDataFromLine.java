package PKG2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromLine 
{
	public void dataReadofaSingleRow(int row) throws IOException
	{
		File f = new File("C:\\Users\\isaini\\Desktop\\writef.txt");
		FileReader fr = new FileReader(f);
		BufferedReader  b = new BufferedReader(fr);
		String s;
		int a = 0;
		while((s=b.readLine())!=null)
		{
			a=a+1;
			if(a==row)
			{
				System.out.println(s);
				break; //for moving outside the loop
			}
		}
		
	}

	public static void main(String[] args)  throws IOException
	{
		ReadDataFromLine t = new ReadDataFromLine();
		t.dataReadofaSingleRow(4);
		

	}

	
	

	}


