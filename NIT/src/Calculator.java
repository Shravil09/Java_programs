import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int No1 = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int No2 = sc.nextInt();
		System.out.println("Enter the Symbol(+,-,*,/)");
		String sym = sc.next();
		
		int res;
		switch(sym) 
		{
		case"+":res=No1+No2;
		System.out.println("Addition is:"+res);
		break;
		
		case"-":res=No1+No2;
		System.out.println("Substraction is:"+res);
		break;
		
		case"*":res=No1+No2;
		System.out.println("Multiplication is:"+res);
		break;
		
		case"/":res=No1+No2;
		System.out.println("Division is:"+res);
		break;
		
		default:
			System.out.println("Invalid Symbol");
			break;
		}

	}

}
