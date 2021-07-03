package PKG1;
// STATIC Method calling with Class Name

public class StaticMethod 
{
	static int a;
	public static void abc()
	{
		System.out.println("Static Method");
	}
	public static void abc(int a)// overload Static Method
	{
		System.out.println("2nd Static Method");
	}
	public static void main()
	{
		System.out.println("Overloading Main Method");
	}
	public static void main(String[] args) 
	{
		StaticMethod.abc();
		StaticMethod.a = 12;
		StaticMethod.abc(45);
		StaticMethod.main();
	
		
	}

}
