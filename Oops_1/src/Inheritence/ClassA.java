package Inheritence;

public class ClassA {
	void show() {
		System.out.println("ClassA method called");
	}
	void meth1() {
		System.out.println("ClassA method executed");
	}
	ClassA(){
		this(50);
		System.out.println("Default constructor of classA");
	}
	ClassA(int a){
		System.out.println("Parameterized constructor of classA=> " + a);
	}

}
