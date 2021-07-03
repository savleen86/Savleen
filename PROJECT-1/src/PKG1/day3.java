package PKG1;

public class day3 {
	
	public day3()
	{
		System.out.println("Default");
	}
	public day3(int a)
	{
		System.out.println("One Parameterized");
	}
	public day3(int a , int b)
	{
		System.out.println("Two Parameterized");
	}
	
	public static void main(String[] args) 
	{
		day3 ref= new day3();
		day3 ref1= new day3(12);
		day3 ref2= new day3(22,55);
	}
}

