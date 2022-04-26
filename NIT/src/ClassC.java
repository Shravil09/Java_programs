
public class ClassC 
{
	static int i = 10;
	static int j=20;
	static {
		display();
		System.out.println("First Static Block " +i);
	}
	public ClassC() {
		System.out.println("This is static flow");
	}
	public static void main(String[] args) {
		display();
		System.out.println("Main Method");
	}
	static void display()
	{
		System.out.println("This is display method");
	}
	static 
	{
		new ClassC();
		System.out.println("Second static block "+j );
	}
	
}
