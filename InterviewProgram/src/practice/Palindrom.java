package practice;

public class Palindrom {
	public static void main(String[] args) {
		int t = 121, rev = 0, rem=0;
		int temp = t;
		
		while(temp !=0) 
		{
			rem = temp%10;
			rev = rev*10 + rem;
			temp = temp/10;
		}
		if(t == rev) 
		{
			System.out.println("Palindrom Number");
		}
		else
			System.out.println("Not a palindrom Number");
	}
}
