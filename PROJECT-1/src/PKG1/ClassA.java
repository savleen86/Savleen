package PKG1;
// calling parent constructor using THIS and SUPER keyword with Constructor
public class ClassA 
{
	public ClassA() 
	{ this(1,2,3);
		System.out.println("Parent Default Constructor");
	}
	public ClassA(int a) 
	{this();
		System.out.println("Parent 1 Parameterized Constructor");
	}
	public ClassA(int a, int b) 
	{ this(1,2,3,4);
		System.out.println("Parent 2 Parameterized Constructor");
	}
	public ClassA(int a, int b, int c) 
	{
		System.out.println("Parent 3 Parameterized Constructor");
	}
	public ClassA(int a,int b, int c,int d) 
	{ this(1);
		System.out.println("Parent 4 Parameterized Constructor");
	}

}
