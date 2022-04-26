package test;

public class ClassA_1 
{
	String helloName(String name) 
	{
		return "Hello".concat(name);
	}

	public static void main(String[] args) {
		String result = new ClassA_1().helloName("Bob");
		System.out.println(result);

	}

}
