package Practice;

public class ClassB {
	int a;
	public int getA() { 
		return a;
	}
	public void setA(int a) { 
		this.a = a;
	}

	ClassB show(){ 
		return this;
	}

	public static void main(String[] args) 
	{
		ClassB obj = new ClassB();
		obj.setA(10);
		//System.out.println(obj.getA()); 
		
		ClassB obj2= obj.show();
		//System.out.println(obj2.getA());

	}

}
