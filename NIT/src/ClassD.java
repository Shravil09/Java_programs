
public class ClassD {
	void meth1(int a) 
	{
		System.out.println("---meth1()---");
		while(a<=10) 
		{
			System.out.println("a value: "+a);
			a++;
		}
		System.out.println("Compiler came out from while loop");
	}
	void meth2(int a) {
		System.out.println("---meth1()---");
		while(a<=10) 
		System.out.println("a value: "+a);
		
		System.out.println("Compiler came out from while loop");
	}
	void meth3(int a) {
		System.out.println("---meth3()---");
	}
	void meth4(int a) {
		System.out.println("---meth4()---");
		do {
			System.out.println("a value:"+a);
			a++;
		}
		while (a<=10);
		System.out.println("compiler came out from while loop");
	}
	public static void main(String[] args) {
		ClassD aobj = new ClassD();
		aobj.meth1(100);
		aobj.meth4(1);
		

	}

}
