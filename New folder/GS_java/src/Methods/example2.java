package Methods;

public class example2 
{
	public static void addition(int a, int b, int c)
	{
		System.out.println(a+b+c);
		
		System.out.println(a+b);
	}
	
	public void multiplication(int x, int y, int z)
	
	{	
	System.out.println(x*y*z);
	System.out.println(x*z);
	}

	public static void main(String[]args)
	{
		
		addition (100,200,300);
		addition (15,25,35);
		
		
		System.out.println (" example of multiplication");
		
		example2 multiply=new example2();
		
		multiply.multiplication(10,20,30);
		multiply.multiplication(5,7,3);
		
	}

}
