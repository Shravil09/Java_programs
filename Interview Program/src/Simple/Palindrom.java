package Simple;

public class Palindrom {

	public static void main(String[] args) {
		int t = 121;
		int rem = 0; 
		int rev= 0;
		int temp = t;
		while(temp != 0) 
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(t == rev) 
		{
			System.out.println(t + " is a prime no");
		}
		else
			System.out.println(t + " isn't a prime no");
	}

}
