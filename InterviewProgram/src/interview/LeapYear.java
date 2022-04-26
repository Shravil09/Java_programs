package interview;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2017;
		if((year%4==0) && (year%400 !=400) || (year%400==100))
			System.out.println("Leap year");
		else
			System.out.println("Not Leap Year");
	}

}
