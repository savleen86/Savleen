package PKG1;

public class child extends parent
{
	public void  c()
	{
		System.out.println("Child Default Method");
	}
	public void  c1(int a)
	{ 
		System.out.println("Child 1 Parameterized Method");
	}
	public void  c2(int a, int b)
	{
		System.out.println("Child 2 Parameterized Method");
	}
	public void  c3(int a, int b,int c)
	{
		System.out.println("Child 3 Parameterized Method");
	}
	public void  c4(int a, int b,int c,int d )
	{   super.p2(1, 2);
		super.p4(1, 2, 3, 4);
		this.c3(1, 2, 3);
		this.c();
		this.c2(1, 2);
		this.c1(1);
		System.out.println("Child 4 Parameterized Method");
	}
	public static void main(String[] args) 
	{
		child obj= new child();
		obj.c4(1, 2, 3, 4);	
	}


}
