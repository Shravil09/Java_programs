package staticprogram;

public class A {
	static int i;
	static void test() {
		i=90;
		System.out.println("test");
		System.out.println(i);
	}
	public static void main(String[] args) {
		int i = 123;
		System.out.println(i);
	}
	static {
		i=80;
		System.out.println("SIB3");
		test();
	}
}
