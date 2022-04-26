package Practice;

public class ClassA {
	void printNumber(int num) {
		if(num<=0) {
			return ;
		}
		else {
			printNumber(num-1);
			System.out.print(" "+ num);
		}
	}
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.printNumber(100);
	}
	
	}

