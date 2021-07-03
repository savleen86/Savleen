package PKG2;
import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) 
	{
		System.out.println("Factorial Of Number");
		int a;
		int num=1;
		Scanner sc  =new Scanner(System.in);
		System.out.println("Enter a Number:");
		a=sc.nextInt();
		
		for(int i=1; i<=a; i++)
		{
			num = num*i;
		}
		System.out.println("Factorial of" + a+ "is:" + num);
		
		// Another method
		
		int x , fact=1;
		int number = 5;
		for(x=1;x<=number;x++)
		{    
		      fact=fact*x;    
		}
		System.out.println("Factorial of "+number+" = "+fact);
		
	
	}

}
