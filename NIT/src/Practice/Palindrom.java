package Practice;

public class Palindrom {

	public static void main(String[] args) {
		int t = 121, rev=0, rem;
		int temp = t;
		while(temp !=0) 
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}	
			if(t == rev) {
				System.out.println(t + " is palindrome no");
			}
			else 
				System.out.println(t + " is not palindrome no");
	} 
}