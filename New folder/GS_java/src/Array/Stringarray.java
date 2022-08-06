package Array;

public class Stringarray
{
	public static void main(String [] args) 
	
	{
		String ar1[]=new String[4];
		
		ar1[0]="Gajanan";
		ar1[1]="Xyzggw";
		ar1[2]="Abcd";
		ar1[3]="Pqrs";
		//ar1[4]="Klmno";
		
		
		
		
		//System.out.println(ar1[5]);
		System.out.println(ar1[3]);
		System.out.println(ar1.length);
		
		System.out.println("----print all data----");
		
		//for (int i=0; i<=3; i++)
		//{
			//System.out.println(ar1[i]);
		//}
		for (int i=0; i<=ar1.length; i++)
		{
			System.out.println(ar1[i]);
		}
		
	}

}
