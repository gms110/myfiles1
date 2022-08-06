package Array;

public class Example1_intArray 
{

	public static void main(String[] args) 
	{
		//step 1 array declaration
		int ar[]=new int[5];
		
		//step2 array initialization
		ar[0]=80;
		ar[1]=50;
		ar[2]=10;
		ar[3]=60;
		ar[4]=30;
		
		//step 3 array usage
		System.out.println(ar[4]); //60
		System.out.println(ar.length);
		
		System.out.println("----print all data from int array----");
		
		//for(int i=0; i<=4; i++)
			//System.out.println(ar[i]);
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}
	 
 	
}
