package clearTrail;

public class PrimeNumber {

	void meth() 
	{
		int t = 8; 
		int temp = 0;
		
		for(int i=2; i<=t-1; i++) 
		{
			if(t%i==0) 
			{
				temp=temp+1;
			}
		}
		if(temp==0) 
		{
			System.out.println("Prime Number");
		}
		else
			System.out.println("Not a Prime Number");
	}
	public static void main(String[] args) {
		PrimeNumber obj = new PrimeNumber();
		obj.meth();
	}

}
