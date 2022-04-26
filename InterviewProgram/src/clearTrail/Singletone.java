package clearTrail;

public class Singletone {
	public static void main(String[] args) 
	{
		TestSingleton t1 = TestSingleton.getInstance();
		TestSingleton t2 = TestSingleton.getInstance();
		
		System.out.println("t1 :"+ t1.toString());
		System.out.println("t2 :"+t2.toString());
		
	}
}

class TestSingleton{
	static TestSingleton obj = new TestSingleton();
	
	private TestSingleton() 
	{
		
	}
	public static TestSingleton getInstance()
	{
		return obj;
	}
	
}

/*
 * TestSingleton aobj1 = TestSingleton.getInstance(); TestSingleton aobj2 =
 * TestSingleton.getInstance();
 * 
 * System.out.println("aobj1 "+aobj1.toString());
 * System.out.println("aobj2 "+aobj2.toString()); } }
 * 
 * class TestSingleton{ static TestSingleton obj = new TestSingleton();
 * 
 * private TestSingleton() {
 * 
 * } public static TestSingleton getInstance() { return obj;
 */