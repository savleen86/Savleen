package PKG1;

public class Assignment2 

{public int sum(int a, int b)
	{   int c;
		c=a+b;
		System.out.println("RESULT of ADD:"+ c);
		return c;
	}
	public int sub(int a, int b)
	{   int c;
		c=a-b;
		System.out.println("Result of SUB:"+ c);
		return c;
	}
	public int multi(int a, int b)
	{   int c;
		c=a*b;
		System.out.println("Result of MULTIPLY:"+ c);
		return c;
	}
	public int div(int a, int b)
	{   int c;
		c=a/b;
		System.out.println("Result of DIV:"+ c);
		return c;
	}
	public static void main(String[] args) 
	{
		Assignment2 result= new Assignment2();
		int sum1= result.sum(10, 2);
		int sum2= result.sum(sum1, 2);
		int sub= result.sub(sum2 , 2);
		int mult= result.multi(sub , 2);
		int final_result= result.div(mult, 2);
		System.out.println("RESULT of ((((10+2)+2)-2)*2)/2) is:" + final_result);
	}

}
