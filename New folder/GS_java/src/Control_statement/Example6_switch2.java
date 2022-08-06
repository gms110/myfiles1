package Control_statement;

public class Example6_switch2 
{
	public static void main(String[]args)
	{
		String s1="CD";
		switch (s1)
		{
		
		case "BI": System.out.println("running BI code");
		break;
		
		
		case "MT": System.out.println("running MT code");
		break;
		
		case "MS": System.out.println("running MS code");
		break;
		
		case "CD": System.out.println("running CD code");
		break;
		
		case "CW": System.out.println("running CW code");
		break;
		
		default: System.out.println("wrong input");
		break;
		}
		
	}
	
}
