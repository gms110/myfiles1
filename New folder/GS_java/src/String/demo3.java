package String;

public class demo3 
{
	public static void main(String[] args) 
	{
		
		String s1="Gajanan";
		String s2="swami";
		String s3="Abcde";
				
		System.out.println(s1.length());              //7
		System.out.println(s1.toUpperCase());        //GAJANAN
		System.out.println(s2.toLowerCase());       //swami
		
		System.out.println(s2.equals(s3));              //false     //case sensitive
		System.out.println(s2.equalsIgnoreCase(s3));      //true    //not a case sensitive		
				
		
	}
	
	
	

}
