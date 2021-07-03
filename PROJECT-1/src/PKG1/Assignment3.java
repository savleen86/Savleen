package PKG1;

public class Assignment3 {
	public int div(int a, int b)
	{   int c= a/b;
		System.out.println("Total of DIV:"+ c);
		return c;
	}
	public int sub(int a, int b)
	{   int c= a-b;
		System.out.println("Total of SUB:"+ c);
		return c;
	}
	public int add(int a, int b)
	{   int c= a+b;
		System.out.println("Total of ADD:"+ c);
		return c;
	}
	public int mul(int a, int b)
	{   int c= a*b;
		System.out.println("Total of MUL:"+ c);
		return c;
	}
	public static void main(String[] args) 
	{
		Assignment3 result= new Assignment3();
		int div= result.div(10, 2);
		int sub= result.sub(div, 2);
		int sub2= result.sub(sub , 2);
		int add= result.add(sub2 , 2);
		int total= result.mul(add, 2);
		System.out.println("FINAL RESULT of ((((10/2)-2)+2)*2) is :"+ total);
	}
}
