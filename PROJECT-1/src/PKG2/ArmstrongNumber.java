package PKG2;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int num = 370;
		int o=num;
		int temp=0;
		int r;
		
		while (num>0) 
		{
			r= num%10;
			num = num/10;
			temp=temp+r*r*r;
			
		}
		if(o==temp)
		{
			System.out.println("This number is Armstrong");
		}
		else
		{
			System.out.println("This number is not Armstrong");
		}
		
		//Another way by taking input from user
		
		int N;
		int number;
		int t;
		int total=0;
		
		System.out.println("Ënter 3 Digit Number");
        Scanner sc = new Scanner(System.in);
        
        N= sc.nextInt();
        number=N;
        
        for(;number!=0;number /= 10)
        {
        	t = number % 10;
            total = total + t*t*t;
        }
        if(total==N)
        {
        	System.out.println(N + " is an Armstrong number");
        }
        else
        {
        	System.out.println(N + " is not an Armstrong number");
        }
		
		
	
	}

}
