package practice;

public class PrimeNo {
	public static void main(String[] args) {
		int t = 7; 
		int temp = 0;
		
		for(int i = 2; i<=t-1; i++) 
		{
			if(t%2==0) 
			{
				temp = temp+1;
			}
		}
		if(temp ==0) 
		{
			System.out.println("Palindrom No");
		}
		else
			System.out.println("Not a Palindrom No");
	}
}
