package Interface;

public interface Interface1 
{
	void m1();
	public void m2();
	abstract public void m3();
	abstract void m4();
	
	default void m5()
	{
		System.out.println("fghjkl");
	}
	
	public static void m6()
	{
		System.out.println("abcabac");
	}
	public static void main(String[] args) 
	{
		m6();
		
		
	}

}
