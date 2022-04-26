package test;

public class ClassA_4 {
	String extraEnd(String a) 
	{
		String s = a.substring(a.length()-2);
		return s+s+s;
	}
	public static void main(String[] args) {
		String result = new ClassA_4().extraEnd("Hello");
		System.out.println(result);

	}

}
