package inheritence1;

public class ClassD extends ClassC
{
	void show() 
	{
		System.out.println("ClassB method Called");
		super.meth1();
	}
	/*void meth2() 
	{
		System.out.println("ClassB() method executed");
	}*/
	
	ClassD()
	{
		this(50);
		System.out.println("Default Constructor Called");
	}
	ClassD(int a)
	{
		super(100);
		System.out.println("ClassD Parameterized Constructor Called: " +a);
	}
	public static void main(String[] args) {
		ClassD obj = new ClassD();
		obj.display();
		obj.show();

	}

}
