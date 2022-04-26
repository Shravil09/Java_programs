package abstraction;

public class ClassA {
	static StringBuffer sb = new StringBuffer();
	ClassA()
	{
		this("Java");
		System.out.println(10);
	}
	ClassA(String s)
	{
		this(10, "Java");
		System.out.println(20);
	}
	ClassA(int a, String s)
	{
		this(sb);
		System.out.println(30);
	}
	ClassA(StringBuffer s)
	{
		System.out.println(40);
	}
	public static void main(String[] args) {
		new ClassA();
	}

}
