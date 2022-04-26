package Simple;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int no1 = sc.nextInt();
		System.out.println("Enter the Second Number:");
		int no2 = sc.nextInt();
		System.out.println("Select the Symbol(+,-, *, /)");
		String sys = sc.next();
		int res;
		switch(sys) 
		{
			case "+": res = no1 + no2;
			System.out.println("Addition is :"+ res);
			break;
			
			case "-": res = no1-no2;
			System.out.println("Substraction is :"+ res);
			break;
			
			case "*": res = no1*no2;
			System.out.println("Multiplication is :"+ res);
			break;
			
			case "/": res = no1/no2;
			System.out.println("Division is :"+ res);
			break;
			
			default : System.out.println("Invalid Symbol");
			break;
		}
	}

}
