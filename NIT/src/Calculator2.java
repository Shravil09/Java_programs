import java.util.Scanner;

class Calculator2{
	public static void main(String[] args) {
		String yn = null;
		do
		   {
			int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no.");
		n1 = sc.nextInt();
		System.out.println("Ente the second no.");
		n2 = sc.nextInt();
		System.out.println("Select the symbol(+,-,*,/)");
		String sys = sc.next();
		int res;
		
		switch (sys) {
		case "+" : res = n1 + n2;
		System.out.println("Addition is : "+res);
			break;
			
		case "-" : res = n1 - n2;
		System.out.println("Substraction is : "+res);
        break;
        
		default: System.out.println("Invalid Symbol");
			break;
		}
		System.out.println("Do you want to continue(y for yes and N for no)");
		yn = sc.next();
	}
		while (yn.equals("y") || yn.equals("N"));
	}
}
