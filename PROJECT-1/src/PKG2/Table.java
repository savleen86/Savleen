package PKG2;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) 
	{
		System.out.println("Enter Number :");
		Scanner s = new Scanner(System.in);
		
		int a=s.nextInt();
		for(int i=1; i <= 10; i++)
		{ 
			System.out.println(a +"*"+ i +"="+ a*i  );
		}
		// Another way
		
		System.out.println("\tTable of 12");
		int N = 12;
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(N + " * " + i + " = "+ N * i);
			
		}
		
	}
	
	
}

