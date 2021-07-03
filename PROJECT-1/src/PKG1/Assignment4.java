package PKG1;

public class Assignment4 
{
	public Assignment4()
	{
		this(1,2,3);
		System.out.println("DEFAULT");
	}
	public Assignment4(int a)
	{this();
		System.out.println("1 Parameterized Constructor");
	}
	public Assignment4(int a, int b)
	{ this(1,2,3,4);
		System.out.println("2 Parameterized Constructor");
	}
	public Assignment4(int a, int b, int c)
	{
		System.out.println("3 Parameterized Constructor");
	}
	public Assignment4(int a, int b, int c, int d)
	{this(1);
		System.out.println("4 Parameterized Constructor");
	}
public static void main(String[] args) 
{
	Assignment4 object= new Assignment4(1,2);
	
}
}
