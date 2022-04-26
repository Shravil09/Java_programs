package Interface;

public class A  implements A1{
	public void test() 
	{
		System.out.println("test");
	}
	public static void main(String[] args) {
		A1 a = new A();
		a.test();

	}

}
