package PKG2;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args)
	{
		System.out.println("Checking if number is Palindrome or Not");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int r, sum=0;
		int temp = num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;    
		    num=num/10;
		}
		if(temp==sum)    
	        System.out.println("The entered number "+temp+" is a palindrome number ");    
	   else    
	        System.out.println("The entered number "+temp+" is not a palindrome");  
		
		
		// 2nd Way without using Scanner or asking to enter number
				int a=151;
				int rev, s=0;
				int t=a;
				while(a>0)
				{
					rev=a%10;
					s=(s*10)+rev;
					a=a/10;
				}
				if(t==s)    
			        System.out.println("The entered number "+t+" is a palindrome number ");    
			   else    
			        System.out.println("The entered number "+t+" is not a palindrome");  
	
		  
	
		
	}

}
