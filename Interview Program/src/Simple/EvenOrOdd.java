package Simple;

import java.util.Scanner;

public class EvenOrOdd {
	void display() 
	{
		System.out.println("Enter the Number to ChecK :");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n%2==0) 
		{
			System.out.println("Even NUmber");
		}
		else
			System.out.println("Odd Number");
	}

	public static void main(String[] args) 
	{
		new EvenOrOdd().display();
	}

}
