
public class PrimeNumber {

	public static void main(String[] args) 
	{	
		int t = 8;
		int temp = 0;
		
		for(int j = 1; j<=100; j++ )
		{
		
			for(int i = 2; i<= t-1; i++) 
			{
			if(t%i ==0) 
				{
					temp = temp+1;
				}
			}
			if(temp == 0) 
			{
				System.out.println(t + " is a prime No");
			}
			else
				System.out.println(t+ " is not a prime No");
		}
	}
}
