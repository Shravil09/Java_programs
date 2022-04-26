
public class C { 
	{ 
	System.out.println("hello");
}
static {
	System.out.println("SIB");
	}
C()
{
	System.out.println("hello 2");
	}
C(int i)
{
	System.out.println("hello 3");
	}
C(int i, int j)
{
	System.out.println("hello 4");
}
	
	public static void main(String[] args) {
	C c = new C();
	C c1 = new C(10);
	C c2 = new C(19,39);
	System.out.println("main");

	}

}
