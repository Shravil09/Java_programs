package clearTrail;

final public class Immutable {
	private int a;
	private Immutable(int a) 
	{
		this.a=a;
	}
	public int getA() {
		return this.a;
	}
	public static void main(String[] args) {
		Immutable obj = new Immutable(10);
		Immutable obj1 = new Immutable(100);
		Immutable obj2 = new Immutable(10);
		System.out.println(obj == obj1);
		System.out.println(obj == obj2);
	}
	
}


/*
 * private final int a; private Immutable(int a) { this.a = a; } public int
 * getA() { return this.a; } public static void main(String[] args) { Immutable
 * aobj= new Immutable(10); Immutable bobj = new Immutable(100); Immutable cobj
 * = new Immutable(10); System.out.println(aobj==bobj);
 * System.out.println(aobj==bobj);
 * 
 * }
 */