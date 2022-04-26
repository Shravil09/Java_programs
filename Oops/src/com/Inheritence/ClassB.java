package com.Inheritence;

public class ClassB extends ClassA{
	void show() 
	{
		System.out.println("ClassB() method Called");
		super.meth1();
	}
	ClassB()
	{	
		this(50);
		System.out.println("Default Constructor of ClassB");
	}
	ClassB(int a)
	{
		super(100);
		System.out.println("Parameterized Constructor of ClassB = "+a );
	}
	public static void main(String[] args) {
		ClassB bobj = new ClassB();
		bobj.display();
		bobj.show();
	}

}
