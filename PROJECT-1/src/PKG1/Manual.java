package PKG1;

public class Manual extends Automation
{
	public void method3()
	{
		System.out.println("I am Child Class");
	}
	public static void main(String[] args) 
	{
		System.out.println("Multi-Level Inheritance\n");
		Manual m= new Manual();
		m.method1();
		m.method2();
		m.method3();
		
	}

}
