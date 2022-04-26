package com.Inheritence;

public class ClassA {
	void display() 
	{
		System.out.println("ClassA() method Called");
	}
	void meth1() 
	{
		System.out.println("ClassA() method Executed");
	}
	ClassA()
	{
		System.out.println("Default Constructor of ClassA()");
	}
	ClassA(int a)
	{
		System.out.println("Parameterized Constructor of ClassA ="+a);
	}

}
