package PKG2;

public class NumberPattern {

	public static void main(String[] args)
	{
		int a;
		int b;
		int c=6;
		int num;
		for(a=0; a<c; a++) //loop for rows
		{
			num=1;
			for(b=0; b<=a; b++) //loop for columns
			{
				System.out.print(num+"");
				num++; // incrementing numbers
			}
			System.out.println();
		}
		
		System.out.println("Second Pattern");
		int d;
		int e;
		int f=1;
		for(d=1; d<=7; d++)
		{
			for(e=1; e<=d; e++)
			{
				System.out.print(f++ + " ");
			}
			System.out.println();
		}
		
		
		

	}

}
