package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class ClassA {
	void display() 
	{
		LinkedList hs = new LinkedList();
		//HashSet hs = new HashSet();
		hs.add(10);
		hs.add(56);
		hs.add(52);
		hs.add("Java");
		hs.add(null);
		hs.add(1);
		System.out.println(hs);
		System.out.println("-------------");
		Iterator i = hs.iterator();
		while(i.hasNext()) 
		{
			
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) 
	{
		new ClassA().display();
	}

}
