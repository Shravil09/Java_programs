package com.polymorphism;

public class Override {
	void display() {
		System.out.println(10);
	}
	void display(int a) 
	{
		System.out.println(20);
	}
	void display(String s)  
	{
		System.out.println(30);
	}
	void display(int a, String s) 
	{
		System.out.println(40);
	}
	void display(String s, int a) 
	{
		System.out.println(50);
	}
	
	public static void main(String[] args) {
		Override aobj = new Override();
		aobj.display();
		aobj.display(100);
		aobj.display("Java");
		aobj.display(100, "Java is Awesome");
		aobj.display("Java is Awesome", 200);
	}
	
}
