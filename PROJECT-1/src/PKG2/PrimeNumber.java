package PKG2;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int a = 0;
		
		for(int i = 1 ; i <=n ; i++)	
		{	
			if(n % i == 0)	//condition for getting the factors of number n
			a=a+1;
		}
		if(a == 2)	//if factors are two then, number is prime else not
		System.out.println("Prime Number");
		else
		System.out.println("Not a Prime Number");
		

	}

}
