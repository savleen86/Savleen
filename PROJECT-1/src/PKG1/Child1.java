package PKG1;

public class Child1 extends ParentClass
{
	public void m2()
	{
		System.out.println("I am Child 1");
	}
	public static void main(String[] args) 
	{System.out.println("Hierarchical Inheritance\n");
		Child1 c1= new Child1();
		c1.m1();
		c1.m2();
		
	}

}
