package clearTrail;

public class Armstrong {
	public static void main(String[] args) {
		int n = 153;
		int r, sum=0;
		int temp=n;
		
		while(n>0) 
		{
			r = n%10;
			n = n/10;
			sum = sum+r*r*r;

		}
		if(temp == sum)
			System.out.println("Is a");
		else
			System.out.println("Not a");
	}

}
