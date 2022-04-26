import java.util.Scanner;
public class Pract {
	void meth() {
		Scanner sc = new Scanner(System.in);
		String empName = sc.nextLine();
		System.out.println("Employee name is: "+empName);
		
		String empDep = sc.nextLine();
		System.out.println("Employee dept is: "+empDep);
		
		int empID = sc.nextInt();
		System.out.println("Employee name is: "+empID);
		
		String empPosition = sc.nextLine();
		System.out.println("Your position is: "+empPosition);

		sc.close();
		
	}
	public static void main(String[] args) {
		new Pract().meth();
		
	}

}
