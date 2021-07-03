package PKG2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ABCD {

	public static void main(String[] args) throws IOException
	{
		
		File f = new File("../PROJECT-1/ABCD.txt");
		FileReader fr = new FileReader(f);
		int a;
		while((a=fr.read())!=-1)
		{
			System.out.println((char)a); //reading character by character
		}
		
		

	}

}
