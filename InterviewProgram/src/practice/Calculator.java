package practice;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	String yn;
	do{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number : ");
	int n1 = sc.nextInt();
	System.out.println("Enter the second number : ");
	int n2 = sc.nextInt();
	
	System.out.println("Select the Operator(+,-,*,/,%)");
	String sys = sc.next();
	int res;
	
	switch (sys) {
	case "+" : res = n1+n2;
	System.out.println("Addition = "+ res);
	break;
	
	case "-" : res = n1-n2;
	System.out.println("Substraction = "+ res);
	break;
	
	case "*" : res = n1+n2;
	System.out.println("Multiply = "+ res);
	break;
	
	case "/" : res = n1+n2;
	System.out.println("Division = "+ res);
	break;
	case "%" : res = n1%n2;
	System.out.println("Modulus = "+ res);
	break;

	default: System.out.println("Invalid Symbol");
		break;
	}
	System.out.println("Do you want to continue(Press y for Yes and n for No)");
	yn = sc.next();
	}
	while((yn.equals("y"))||(yn.equals("n")));
	}
}
