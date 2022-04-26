package Simple;

public class PrimeNoSeries {
	public static void main(String[] args) 
	{
		int t = 1231, rem=0, rev=0, temp=t;
		while( temp !=0) 
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(t==rev) 
		{
			System.out.println(t+" is a palindrom no");
		}
		else
			System.out.println(t+ " isn't a palindrom no");
	}
}
