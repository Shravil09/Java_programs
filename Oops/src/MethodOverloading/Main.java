package MethodOverloading;

class A{
	static void show() {
		System.out.println("Parent");
	}
}
class B extends A{
	static void show() {
		System.out.println("Child");
	}
}
public class Main {

	public static void main(String[] args) {
		A obj = new B();
		B obj1 = new B();
		obj.show();
		obj1.show();
	}

}
