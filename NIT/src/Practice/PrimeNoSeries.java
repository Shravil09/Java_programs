package Practice;

public class PrimeNoSeries {

	public static void main(String[] args) 
	{
		int j;
		int temp = 0;
		for(j=1; j<=100; j++)
		for(int i =2; i<=i-1; i++) 
		{
			if(j%i ==0) 
			{
				temp = temp+1;
			}
		}
		if(temp==0) 
		{
			System.out.println(j);
		}
		//else
			//System.out.println(t+ " is a prime no");
	}
}