class classA{
	String s;
	String sb;
	public classA(String s) {
		sb = s;
	}
	public classA() 
	{
		sb = "I love programming language";
	}
}
public class Programming {
	public static void main(String[] args) {
		classA obj = new classA();
		obj.s = "java";
		System.out.println("I love "+  obj.s);
		System.out.println(obj.sb);
		
	}

}
