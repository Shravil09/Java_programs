import java.util.ArrayList;
import java.util.Iterator;

public class ClassA {
	void display() 
	{
		ArrayList <Integer>al = new ArrayList <Integer>();
		al.add(10);
		al.add(52);
		al.add(63);
		//al.add("Java");
		al.add(null);
		al.add(96);
		al.add(2);
		System.out.println(al);
		System.out.println();
		System.out.println("Reteriving using for loop");
		for(int i=0; i<al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("Reteriving using for-each loop");
		for
		(Object x: al) 
		{
			System.out.println(x);
		}
		
		System.out.println("Reteriving using Iterator Interface");
		Iterator i = al.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		new ClassA().display();
	}

}
