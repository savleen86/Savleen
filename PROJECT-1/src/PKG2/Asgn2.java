package PKG2;

import java.util.Scanner;

public class Asgn2 extends Arithmetic
{ // (((((x1*x2)-x3)+x4)-x6)/x7)
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
		System.out.println("Enter Value of X6:");
		int x6= s.nextInt();
		System.out.println("Enter Value of X7:");
		int x7= s.nextInt();
		
		Asgn1 obj2= new Asgn1();
		int a1=obj2.multi(x1, x2);
		int a2= obj2.sub(a1, x3);
		int a3 = obj2.add(a2, x4);
		int a4= obj2.sub(a3, x6);
		float a5= obj2.div(a4, x7);
		System.out.println("Float Total is:"+ a5);
		int a= (int)a5;
		System.out.println("Int Total is :"+ a);
	
}

}
