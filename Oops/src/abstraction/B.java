package abstraction;

public class B extends Marks {
	int mark1, mark2, mark3, mark4;
	B(int m1, int m2, int m3, int m4){
		mark1= m1;
		mark2= m2;
		mark3= m3;
		mark4= m4;
		
	}
	public float getPercentage() {
		float total = ((mark1+mark2+mark3+mark4)/(float)400)*100;
		return total;
	}
	
	public static void main(String[] args) {
		A a =new A(70,60,50);
		System.out.println(a.getPercentage());
		B b = new B(80,80,70,95);
		System.out.println(b.getPercentage());
		

	}
	}