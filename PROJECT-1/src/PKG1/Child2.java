package PKG1;

public class Child2 extends ParentClass

{public void m3()
	{
	System.out.println("I am Child 2");
	}
public static void main(String[] args) 
{System.out.println("Hierarchical Inheritance\n");
	Child2 c2= new Child2();
	c2.m1();
	c2.m3();
	
}

}
