import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		String yn=null;
		do{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter your no.");
		int t=sc.nextInt(); 
		int fact=1;
		for(int i=1; i<=t; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+t+" is "+fact);
		System.out.println("Do you want to continue(press Y for yes and N for no)");
		yn=sc.next();
	}
		while(yn.equals("Y")||yn.equals("N"));
	
	}
}
