package clearTrail;

public class PalindromNumber {
	public static void main(String[] args) {
		int t = 121; 
		int rev=0, rem;
		int temp=t;
		
		while (temp !=0) {
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;	
		}
			if(t==rev)
				System.out.println("Palindrom String");
			else
				System.out.println("Not");
	}

}
