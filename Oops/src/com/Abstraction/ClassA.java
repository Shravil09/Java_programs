package com.Abstraction;

public abstract class ClassA {
	abstract void display();
	void show() 
	{
		System.out.println("ClassA() method called");
	}
	static void meth1() 
	{
		System.out.println("static method called");
	}
	ClassA()
	{
		System.out.println("Default Constructor Called");
	}
	public static void main(String[] args) {
		System.out.println("main() method called");
		ClassA.meth1();
	}

}
