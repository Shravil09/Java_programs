import java.util.Scanner;

public class FactorialByRecursion {
	static int fact=1;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your no: ");
		int t=sc.nextInt();
		FactorialByRecursion obj = new FactorialByRecursion();
		obj.calFact(t);
		System.out.println("Factorial of "+ t +" is "+fact);
	}
	void calFact(int t)
	{
		if(t>=1) {
		fact=fact*t;
		calFact(t-1);
		
	}

}
	}
