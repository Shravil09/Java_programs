package interview;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num = 123451, rev = 0, rem = 0;
		int temp=num;
		while (temp !=0) 
		{
			rem = temp%10;
			rev = rev*10 + rem;
			temp = temp/10;
		}
		if(num==rev)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome Number");
	}
}
