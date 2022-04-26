
public class PalindromNumber {

	public static void main(String[] args) 
	{
		int t = 121, rem = 0, rev = 0;
		int temp = t;
		while (temp !=0) 
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(t==rev) 
		{
			System.out.println(t+ " is a palindrom No");
		}
		else
			System.out.println(t+ " is not a palindrom No");
	}
}
