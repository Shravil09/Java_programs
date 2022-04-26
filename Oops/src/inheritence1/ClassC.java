package inheritence1;

public class ClassC {
	void display() 
	{
		System.out.println("ClassC  method called");
	}
	void meth1() 
	{
		System.out.println("ClassC() method executed");
	}
	ClassC()
	{
		System.out.println("Default Constructor of ClassC");
	}
	ClassC(int a)
	{
		System.out.println("Parameterized Construcor of ClassC: "+ a);
	}
}
