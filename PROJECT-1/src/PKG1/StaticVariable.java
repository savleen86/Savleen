package PKG1;
// STATIC Variable

public class StaticVariable
{
	static int a;
	public void abc()
	{
		a=a+1;
	}
	public static void main(String[] args) 
	{
		System.out.println("Value of a for OBJ1");
		StaticVariable obj1= new StaticVariable();
		obj1.abc();
		System.out.println(obj1.a);
		System.out.println("Value of a for OBJ2");
		StaticVariable obj2= new StaticVariable();
		obj2.abc();
		System.out.println(obj2.a);
		System.out.println("Value of a for OBJ3");
		StaticVariable obj3= new StaticVariable();
		obj3.abc();
		System.out.println(obj3.a);
		obj3.abc();
		System.out.println(obj3.a);
	}

}
