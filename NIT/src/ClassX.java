
public class ClassX {
	void implicit() {
		byte b = 10;
		System.out.println("byte vale is "+b);
		short s = b;
		System.out.println("short value is "+s);
		s++;
		int i = s++;
		System.out.println("int value  is "+i);
		long l = i;
		System.out.println("long value is "+ (--l));
		float f = l;
		System.out.println("the value of float is "+(f+b));
		double d = (--f);
		System.out.println(" the value of double is "+d);
		show();
		if(!(d==f)) 
		{
			System.out.println("equal");
		}
		else 
		{
			System.out.println("not equal");
		}
	}

	public static void main(String[] args) {
		ClassX a = new ClassX();
		a.implicit();

	}

static void show() {
	char c = 'A';
	int a = ++c; 
	System.out.println(a);
	ClassX obj = new ClassX();
	String s = obj.meth1();
	System.out.println(s);
}
String meth1() {
	String s ="Implicit casting is done by compiler";
	return s;
}}
