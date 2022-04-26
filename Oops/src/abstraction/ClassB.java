package abstraction;

public class ClassB extends Parent{
	void message() {
		System.out.println("This is abstract method");
	}
	public static void main(String[] args) {
		SubClass1 s1 = new SubClass1();
		s1.message();
		SubClass2 s2 = new SubClass2();
		s2.message();
	}
	}