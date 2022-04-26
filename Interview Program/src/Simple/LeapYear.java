package Simple;

import java.util.Scanner;

public class LeapYear {
	void LeapYear() 
	{
		System.out.println("Enter the Year to check Leap Year or Not :");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if((year%4 == 0) && (year% 400 != 0) || (year % 100 == 0) ) 
		{
			System.out.println("Leap Year");
		}
		else
			System.out.println("Not a Leap Year");
	}

	public static void main(String[] args) 
	{
		new LeapYear().LeapYear();
		
	}

}
