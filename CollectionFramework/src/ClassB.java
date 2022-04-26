import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ClassB {
	void display() 
	{
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(52);
		ll.add(63);
		ll.add("Java");
		ll.add(null);
		ll.add(96);
		ll.add(2);
		System.out.println(ll);
		System.out.println("------------------");
		System.out.println("Reteriving using iterator");
		ListIterator i = ll.listIterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
		while(i.hasPrevious()) 
		{
			System.out.println(i.previous());
		}
		
	}
	public static void main(String[] args) {
		new ClassB().display();
	}

}
