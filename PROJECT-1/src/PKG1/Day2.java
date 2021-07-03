package PKG1;

public class Day2 {

	
	public int sum(int c, int d)
	{
	int e;
	e=c+d;
	System.out.println("result of ADD:"+e);
	return e;
		
	}
	public int sub(int x, int y)
	{
	int z;
	z=x-y;
	System.out.println("result of SUB:"+z);
	return z;
		
	}
	public int multiply(int a1, int a2)
	{
	int a3;
	a3=a1*a2;
	System.out.println("Result:"+a3);
	return a3;
		
	}
	public static void main(String[] args) 
	{
	 Day2 result=new Day2();
	 int sum_result=result.sum(22, 2);
	 int sub_result=result.sub(12, 2);
	 int fnlresult=result.multiply(sum_result, sub_result);
	 System.out.println("final result is:"+ fnlresult);
	 
		
	}
}
