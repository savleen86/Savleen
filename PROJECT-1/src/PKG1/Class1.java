package PKG1;

public class Class1 {
	
	int a;
	
	public void savleen()
	{
		
		System.out.println("WELCOME EVERYONE");
		
	}
	
	public static void main(String[] args) 
	{
		Class1 ob= new Class1();
		ob.savleen();
		ob.a=1234;
		System.out.println(ob.a);
		ob.a=25;
		System.out.println(ob.a);
		
	
	}


}
