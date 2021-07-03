package PKG1;

public class ClassB extends ClassA
{
	public ClassB()
	{ super(1,2);
		System.out.println("Child Default Constructor");
	}
	public ClassB(int a)
	{ this(1,2,3);
		System.out.println("Child 1 Parameterized Constructor");
	}
	public ClassB(int a, int b)
	{this(1,2,3,4);
		System.out.println("Child 2 Parameterized Constructor");
	}
	public ClassB(int a, int b,int c)
	{ this();
		System.out.println("Child 3 Parameterized Constructor");
	}
	public ClassB(int a,int b, int c,int d)
	{ this(1);
		System.out.println("Child 4 Parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		ClassB obj=new ClassB(1,2);
		
		
	}

}
