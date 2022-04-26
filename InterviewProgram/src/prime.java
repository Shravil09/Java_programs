
public class prime {

	public static void main(String[] args) {
		int t=8;
		int temp=0;
		for (int i = 2; i < t; i++) 
		{
			if(t-(t/i)*i==0) 
			{
				temp = temp+1;
			}
			
		}
		
		if(temp==0) 
		{
			System.out.println("Prime No");
		}
		else 
		{
			System.out.println("Not a prime No");
		}
	}

}
