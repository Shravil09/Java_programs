package interview;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 7;
		int c = 0;
		
		for(int i=2; i<n; i++) 
		{
			if(n-(n/i)*i == 0) 
			{
				c = c+1;
				
			}
		}
		
		if(c==0) {
			System.out.println(n + "  is a Prime Number");
			}
		else {
			System.out.println(n + " isn't a Prime Number");
		}
	}
}
