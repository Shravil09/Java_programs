package interview;

public class PrimeNoSeries {
	public static void main(String[] args) {
		int j;
		for(int i=1; i<=100; i++) 
		{
			for(j = 2; j<=i-1; j++) 
			{
				if(i%j==0) 
				break;
			}
			
			if(j==i)
				System.out.println(i + " ");
		}
	}

}
