package PKG2;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args)
	{
		int count = 12, num1 = 0, num2 = 1;
		System.out.print("Fibonacci Series of "+count+" numbers:");
		
		int a=1;
		while(a<=count)
		{
			System.out.print(num1+" ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            a++;
		}
		// second way by asking to enter the number
		{
			int f;
			int x=0;
			int y = 1;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("\tEnter Number :");
			f = sc.nextInt();
			System.out.print("The first " + f + " Fibonacci numbers are: ");
			System.out.println(x);
			System.out.println(y);
			for (int i =2 ; i < f; i++)
			{
				int fib = x + y;
				System.out.println(fib);
				x=y;
				y = fib;
				
			}
			
			
		}
		

	}

}
