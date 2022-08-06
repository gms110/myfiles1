package Constructortype;

public class Empinformation 
{
	public static void main(String[] args)
	{
		
		Emp e1=new Emp();
		e1.empName="Kiran";
		e1.empID=100;
		//e1.empCEOName="abc";
		Emp.empCEOName="abc";
		
		Emp e2=new Emp();
		e2.empName="rahul";
		e2.empID=200;
		//e2.empCEOName="abc";
		Emp.empCEOName="abc";
		
		Emp e3=new Emp();
		e3.empName="sachin";
		e3.empID=300;
		//e3.empCEOName="xyz";
		Emp.empCEOName="xyz";
		
		e1.empInfo();
		e2.empInfo();
		e3.empInfo();
		
		
		
		
	}


}
