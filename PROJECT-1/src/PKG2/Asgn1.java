package PKG2;

import java.util.Scanner;

public class Asgn1 extends Arithmetic
{ // ((((x1*x2)+x3)+x4)-x5)/x6)
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Value of X1:");
		int x1=s.nextInt();
		System.out.println("Enter Value of X2:");
		int x2= s.nextInt();
		System.out.println("Enter Value of X3:");
		int x3= s.nextInt();
		System.out.println("Enter Value of X4:");
		int x4= s.nextInt();
		System.out.println("Enter Value of X5:");
		int x5= s.nextInt();
		System.out.println("Enter Value of X6:");
		int x6= s.nextInt();
		
		Asgn1 obj1= new Asgn1();
		int a1=obj1.multi(x1, x2);
		int a2= obj1.add(a1, x3);
		int a3 = obj1.add(a2, x4);
		int a4= obj1.sub(a3, x5);
		int a5= obj1.div(a4, x6);
		System.out.println("Total is:"+ a5);
	
}

}
