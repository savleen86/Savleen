package PKG1;

public class Assignment5 
{
	public void m1()
	{
		System.out.println("Default Method");
	}
	public void m2(int a)
	{this.m5(1, 2, 3, 4);
		System.out.println("1 Parameterized Method");
	}
	public void m3(int a, int b)
	{this.m4(1, 2, 3);
		System.out.println("2 Parameterized Method");
	}
	public void m4(int a, int b, int c)
	{this.m2(1);
		System.out.println("3 Parameterized Method");
	}
	public void m5(int a, int b,int c, int d)
	{this.m1();
		System.out.println("4 Parameterized Method");
	}
	public static void main(String[] args) {
		Assignment5 method= new Assignment5();
		method.m3(1,2);
	}
	

}
