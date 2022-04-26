package MethodOverloading;

public class PrintNumber {
	void print(int a) {
		System.out.println(10);
	}
	void print(double d) {
		System.out.println(2.22d);
	}
	void print(float f) {
		System.out.println(20.5f);
	}
	void print(long l) {
		System.out.println(917999);
	}
	public static void main(String[] args) {
		PrintNumber obj = new PrintNumber();
		obj.print(100);
		obj.print(10.5d);
		obj.print(30.5);
		obj.print(917999);
	}

}
