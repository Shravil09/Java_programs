package MethodOverloading;

public class TwoPera {
	void meth(int s, char c) {
		System.out.println(s+","+c);
	}
	void meth(char c, int b) {
		System.out.println(c+ ","+b);
	}
	public static void main(String[] args) {
		TwoPera obj = new TwoPera();
		obj.meth(40,'V');
		obj.meth('p', 9);
	}

}
