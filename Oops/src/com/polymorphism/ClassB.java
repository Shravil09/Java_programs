package com.polymorphism;

public class ClassB extends ClassA {
	void display(int z) 
	{
		System.out.println("ClassB");

	}
	public static void main(String[] args) {
		ClassB aobj = new ClassB();
		aobj.display(50);
	}

}

