package Simple;

public class PrimeNo {

	public static void main(String[] args) 
	{
		int t = 7;
		int temp = 0;
		for(int i=2; i<=t-1; i++) 
		{
			if(t%i == 0) 
			{
				temp = temp+1;
			}
		}
		if(temp > 0) 
		{
			System.out.println("isn't a prime number");
		}
		else
			System.out.println("is a prime no");
	}
}
