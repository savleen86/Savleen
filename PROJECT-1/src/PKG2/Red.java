package PKG2;
import PKG1.Green;

public class Red extends Green
{
	public void method2()
	{
		System.out.println("Class 2 Method");
	}
	public static void main(String[] args) 
	{
		Green obj=new Green();
		obj.method1();
		System.out.println(obj.a);
	
		
	}

}
