package Inheritence;

public class ClassB extends ClassA{
	void display() {
		System.out.println("ClassB method called");
		super.meth1();
	}
	void meth1() {
		System.out.println("ClassB method executed");
	}
	ClassB(){
		this(100);
		System.out.println("Default constructor of classB");
	}
	ClassB(int a){
		super(50);
		System.out.println("Parameterized constructor of classA=> "+a);
	}
	public static void main(String[] args) {
		ClassB obj = new ClassB();
		obj.display();
		obj.show();
	}

}
