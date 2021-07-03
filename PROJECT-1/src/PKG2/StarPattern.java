package PKG2;

public class StarPattern {

	public static void main(String[] args) 
	{
		int a;
		int b;
		int row=6;
		
		for(a=0; a<row; a++)
		{
			for(b=0; b<=a; b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Downward Triangle Star\n");
		int c;
		int d;
		int r =5;
		for(c=r-1; c>=0 ; c--)
		{
			for(d=0; d<=c; d++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Left Side Star Pattern\n");
		
		for (int e=1; e<=5 ; e++)   
		{
			for(int g=5; g>e; g--)    
			{
				System.out.print(" ");
			}
			for(int f=1; f<=e; f++) 
			{
			System.out.print("*");
			}
			System.out.println();
		}
			
			System.out.println("Pyramid Pattern");
			
			int h;
			int i;
			int j=5;// row
			for(h=0; h<j; h++)  
			{
				for(i=j-h; i>1; i--)  
				{
					System.out.print(" ");   
				}
				for(i=0; i<=h; i++) 
				{
					System.out.print("* "); 
				}
				System.out.println();   
			}
			
			
		}
		

	}


