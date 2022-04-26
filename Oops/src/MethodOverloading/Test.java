package MethodOverloading;

public abstract class Test
{ abstract void m1(); //m1() abstract method
void m2()
{
	System.out.println("m2 method");
	} //m2() normal method
}
abstract class Test1 extends Test
{ 
	void m1()
	{
		System.out.println("m1 method");}
	//m1() normal method
	abstract void m2(); //m2() abstract method
}
class FinalClass extends Test1
{ 
	void m2()
	{
		System.out.println("FinalClass m2() method");
}

public static void main(String[] args)
{ 
	FinalClass f = new FinalClass();
	f.m1();
	f.m2();
}
}
