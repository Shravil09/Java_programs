package Simple;

public class Swap {
	void display() 
	{
		int a = 10;
		int b = 20;
		int c;
		c= a+b;
		b = a-b;
		a = a-b;
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
	}
	public static void main(String[] args) 
	{
		new Swap().display();
		
	}

}
