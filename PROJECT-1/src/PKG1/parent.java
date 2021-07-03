package PKG1;

public class parent 
{
	public void p()
	{
		System.out.println("Parent Default Method");
	}
	public void p1(int a)
	{
		System.out.println("Parent 1 Parameterized Method");
	}
	public void p2(int a, int b)
	{    this.p();
	     this.p1(1);
	     this.p3(1, 2, 3);
		System.out.println("Parent 2 Parameterized Method");
	}
	public void p3(int a,int b,int c)
	{
		System.out.println("Parent 3 Parameterized Method");
	}
	public void p4(int a,int b, int c,int d)
	{
		
		System.out.println("Parent 4 Parameterized Method");
	}

}
