package Simple;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) { 
	String yn = null;
	do{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int t =sc.nextInt();
		int fact=1;
		for(int i=1; i<=t; i++) 
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+ t +" is = "+ fact);
		System.out.println("Do you wanna continue(Press Y for yes and N for No)");
		yn = sc.next();	
	}
	while(yn.equals("Y") || yn.equals("N"));
}
	}
