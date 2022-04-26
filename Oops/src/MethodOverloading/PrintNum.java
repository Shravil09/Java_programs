package MethodOverloading;

class I{
	int i;
	public void PrintNum1() {
		System.out.println(i);
	}
}
class J extends I{
	int j;
	public void PrintNum() {
		System.out.println(j);
	}
}
class PrintNum {
	public static void main(String[] args) {
		J a= new J();
		a.i=25;
		a.j=20;
		a.i = a.j;
		a.PrintNum();

}}
