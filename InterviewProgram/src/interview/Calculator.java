package interview;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		
		System.out.println("(+,-,*,/)");
		String sym = sc.next();
		int result;
		
		switch(sym) {
			case "+" : result = n1+n2;
			System.out.println(result);
			break;
			
			case "-" : result = n1-n2;
			System.out.println(result);
			break;
			
			case"*" : result = n1*n2;
			System.out.println(result);
			break;
			
			case "/" : result = n1/n2;
			System.out.println(result);
			break;
			
			default : System.out.println("Invalid Symbol");
			break;
		}
	}
}
