package Constructortype;

public class sample1 

{
	//constructor overloading
	//example of user defined multiple constructor
	
	int num1;
	int num2;
	
	
	//int int parameter constructor
	
	sample1(int a, int b)
	{
		num1 =a;
		num2 =b;
	}
	
	
		public void add()
		{
			System.out.println(num1+num2);
			
		}
		
	public static void main(String[] args)
	
	{
		
	    sample1 s3=new sample1(10,20);
		s3.add();
		
	}	
		
}
	
	