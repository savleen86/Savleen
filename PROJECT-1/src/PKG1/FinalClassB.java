package PKG1;

public class FinalClassB 
{
	public void first()
	{
		System.out.println("First Method");
	}
	public  void second()
	{
		System.out.println("Second Method");
	}
	public static void main(String[] args) 
	{
		System.out.println("Inside Main Method");
		FinalClassB obj = new FinalClassB();
		obj.first();
		System.out.println("Main Method");
		int a=22;
		System.out.println("a ="+ a);
		a=33;
		System.out.println("a="+ a);
		obj.second();
		System.out.println("Last Method");
		
	}
	
		
	}

