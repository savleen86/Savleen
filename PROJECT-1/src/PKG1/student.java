package PKG1;

public class student {
	
	int age;
	int rollno;
	
	public void display1()
	{
		System.out.println("WELCOME ALL");
		
	}
	public void display2()
	{
		System.out.println("AUTOMATION IS VERY EASY");
	}
	
	public static void main(String[] args) 
	{
		student deepak= new student();
		deepak.display1();
		deepak.display2();
		deepak.age=16;
		System.out.println(deepak.age);
		deepak.rollno=4;
		System.out.println(deepak.rollno);
		deepak.age=26;
		System.out.println(deepak.age);
		deepak.rollno=8;
		System.out.println(deepak.rollno);
		
		
	}

}
