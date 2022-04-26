package staticprogram;

public class B {
	int j, k, i;
B(int i){
	this.i=i;
	System.out.println("B(int)");
}
B(){
	
}
void test1() {
	System.out.println(i);
}
B(int i, int j){
	this.j=j;
	this.k=k;
	System.out.println("B(int int)");
}
void test() {
	//B b = new B();
	this.test1();
	this.test1();
	System.out.println(i);
}
	public static void main(String[] args) {
		B b =new B(10);
		B b4 =new B(10);
		B b2 =new B(10);
		B b3 =new B(10);
		b.test();
		System.out.println("--------");
		b4.test();
	}

}
