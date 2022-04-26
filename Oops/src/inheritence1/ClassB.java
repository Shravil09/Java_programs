package inheritence1;

public class ClassB extends ClassA {
	void meth2() 
	{
		System.out.println("ClassB method");
	}
	public static void main(String[] args) {
		ClassA aobj1 = new ClassA();
		aobj1.meth1();
		
		ClassA aobj2 = new ClassA();
		aobj2.meth1();
		
		ClassB bobj1 = new ClassB();
		aobj1.meth1();
		bobj1.meth2();
	}

}
