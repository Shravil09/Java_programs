
public class HelloBob 
{
	public String meth1() 
	{
		String name = "Shravil";
		System.out.println("Hello".concat(name));
		return name;
		
	}

	public static void main(String[] args) 
	{
		HelloBob hb = new HelloBob();
		hb.meth1();
	}

}
