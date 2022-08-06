package String;

public class demo4 
{
	public static void main(String[] args) 
	{
		String s1= "swami";
		String s2="Gajanan";
		String s3="Velocity";
		String s4="abc abc abd";
		
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("mi"));
		System.out.println(s1.contains("abc"));
		
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf('i'));
		System.out.println(s1.lastIndexOf('m'));

        System.out.println(s1.isEmpty());
        System.out.println(s1.replace("swami", "Gajanan"));
        System.out.println(s1.concat(s2));
        System.out.println(s1+s2);
        
        System.out.println(s4.endsWith("abd"));
        System.out.println(s1.endsWith("abd"));
	
        System.out.println(s4.startsWith("abc"));
        System.out.println(s1.startsWith("abc"));
        
        System.out.println(s1.substring(2,5));
        System.out.println(s1.substring(3));
        
	}
	
	
}
