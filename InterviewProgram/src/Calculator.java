import java.util.Scanner;



public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no");
		int num1= sc.nextInt();
		
		System.out.println("Enter the second no");
		int num2 = sc.nextInt();
		
		System.out.println("Select the operator(+, -, *, /)");
		
		String op  = sc.next();
		
		int res;
		
		switch (op) {
		case "+" : res = num1+num2;
		System.out.println("Addition is : "+ res);
		break;
		
		case "-" : res = num1-num2;
		System.out.println("Subtraction is : "+ res);
		break;
		
		case "*" : res = num1*num2;
		System.out.println("Multiplication is : "+ res);
		break;
		
		case "/" : res = num1/num2;
		System.out.println("Division is : "+ res);
		break;

		default : System.out.println("Invalid Operation");
		break;
		}
	}

}
