package practice;

public class Revrse {
	public static void main(String[] args) {
		int t = 54321;
		int rev = 0;
		int rem = 0;
		
		while(t!=0) 
		{
			rem = t%10;
			rev = rev*10+rem;
			t = t/10;
		}
		System.out.println(rev);
	}

}
