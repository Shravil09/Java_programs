package Set;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedList;

public class ClassB {
	void display() 
	{
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(56);
		ts.add(52);
		//ts.add("Java");
		//ts.add(null);
		ts.add(1);
		System.out.println(ts);
		System.out.println("-------------");
		Iterator i = ts.iterator();
		while(i.hasNext()) 
		{
			
			System.out.println(i.next());
		}
		/*System.out.println("----------------------");
		System.out.println("Pollfirst()====>"+ts.pollFirst());
		System.out.println("PollLast()====>"+ ts.pollLast());
		*/
		System.out.println("----------------------");
		System.out.println(ts.headSet(10));
		System.out.println(ts.tailSet(52));
	}
	public static void main(String[] args) 
	{
		ClassB obj = new ClassB();
		obj.display();
	}


}
