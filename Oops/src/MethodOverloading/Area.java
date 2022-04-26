package MethodOverloading;

public class Area {
	void meth1(int x, int y) {
		System.out.println(x*y);
	}
	void meth1(int x) {
		System.out.println(x*x);
	}
	public static void main(String[] args) {
		Area obj =new Area();
		obj.meth1(5,6);
		obj.meth1(4);
	}

}
