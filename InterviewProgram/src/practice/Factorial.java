package practice;

public class Factorial {

	public static void main(String[] args) {
		int t = 5;
		int fact = 1;
		
		for(int i=1; i<=5; i++) 
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+t + " is = "+fact);
	}

}
