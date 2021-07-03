package PKG2;
import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) 
	{
		System.out.println("Swapping 2 nos using 3rd variable");
		int a;
		int b;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=sc.nextInt();
		System.out.println("Enter value of b:");
		b=sc.nextInt();
		System.out.println("Before swapping - a: "+ a +", b: " + b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Before swapping - a: "+ a +", b: " + b);
		
		//Another way without using scanner
		
		int x=100;
		int y =200;
		int z;
		System.out.println("Before swapping - x: "+ x +", y: " + y);
		
		z=x;
		x=y;
		y=z;
		System.out.println("Before swapping - x: "+ x +", y: " + y);
		
		
		

	}

}
