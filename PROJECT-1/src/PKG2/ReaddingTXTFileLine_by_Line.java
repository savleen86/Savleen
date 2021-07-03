package PKG2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaddingTXTFileLine_by_Line {

	public static void main(String[] args) throws IOException
	{

		File f = new File("../PROJECT-1/Hello.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String s;
		
		while((s=b.readLine())!=null)
		{
			System.out.println(s);
		}
		

	}

}
