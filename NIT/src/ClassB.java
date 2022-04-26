
public class ClassB{
	static int a =0;
	int b = 0;
	
	ClassB() {
		a++;
		b++;
		System.out.println("Static varible---> "+a);
		System.out.println("Instance varible---> "+b);
		System.out.println("........");
	}
	void display() 
	{
		System.out.println("Accessing static variable");
		System.out.println(ClassB.a);
		System.out.println(a);
		System.out.println(new ClassB().a);
	}
	public static void main(String[] args) {
		new ClassB();
		new ClassB();
		new ClassB();
		System.out.println("**********");
		new ClassB().display();
	}
}
