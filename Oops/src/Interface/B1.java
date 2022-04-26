package Interface;

public class B1 implements B2 {
	public void  test() {
		System.out.println("test");
	}
	void test2() {
		System.out.println("test2");
	}
	public static void main(String[] args) {
		B2 b = new B1();
		b.test( );
	}  
}
