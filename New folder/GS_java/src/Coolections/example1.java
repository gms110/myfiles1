package Coolections;

import java.util.Iterator;
import java.util.TreeSet;

public class example1 
{
	public static void main(String[] args) 
	{
		
		TreeSet tr=new TreeSet();
		tr.add(500);
		tr.add(400);
		tr.add(200);
		tr.add(100);
		tr.add(300);
		tr.add(700);
		tr.add(800);
		tr.add(600);
		tr.add(500);
		//tr.add(null);
		{
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println(tr.isEmpty());
		
	}
	{
	 Iterator itr=tr.iterator();
	 while (itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
}
