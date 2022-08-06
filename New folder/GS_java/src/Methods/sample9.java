package Methods;

public class sample9 
{

	
		//int a = 10
		//int b = 20
// int , int parameter method
		
	public static void addition (int a, int b)
	{
		System.out.println (a+b);
		
	}

    public void multiplication (int num1, int num2)
    {
    	System.out.println (num1*num2);
   
    }

	public static void main(String[] args)
	{
		addition (10,20);
		addition (20,30);
		
		sample9 s9= new sample9();
		s9.multiplication(10,11);
	}
	
	
	

}
