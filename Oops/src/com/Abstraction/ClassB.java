package com.Abstraction;

public class ClassB extends ClassA{
	void display() 
	{
		System.out.println("Abstract method overridden");
	}
	public static void main(String[] args) {
		ClassB aobj = new ClassB();
		aobj.display();
		aobj.show();
	}

}
