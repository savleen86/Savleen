package PKG2;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) 
	{
		System.out.println("Swapping 2 nos without using 3rd variable");
		int a,b ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a :");
		a=sc.nextInt();
		System.out.println("Enter value of b :");
		b=sc.nextInt();
		System.out.println("Before swapping - a: "+ a +", b: " + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping  - a: "+ a +", b: " + b);
		
	// 2nd way
		int x=10;
		int y = 20;
		System.out.println("Before Swapping:" );
		System.out.println(("Value of x is:"+x)+ ("\tValue of y is:"+y));
		
		  x = x + y;
		  y = x - y;
		  x = x - y;
		  System.out.println("After Swapping:");
		  System.out.println(("Vlaue of x:"+x)+("\tValue of y:"+y));
	}

}
