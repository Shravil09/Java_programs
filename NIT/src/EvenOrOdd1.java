import java.util.Scanner;

public  class EvenOrOdd1{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter  to check");
		i = sc.nextInt();
	
	if(i%2==0) {
		System.out.println("Even No.");
	}
	else
		System.out.println("Odd No.");
}
	}