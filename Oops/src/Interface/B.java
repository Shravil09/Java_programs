package Interface;

public class B implements A1 {
	public void test() {
		System.out.println("B-test");
	}
	public static void main(String[] args) {
		A1 b = new B();
		b.test();
	}
}
