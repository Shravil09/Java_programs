package clearTrail;

public class ReverseNumber {

	public static void main(String[] args){
		int no =54321;
		int rem=0, rev = 0;
		while(no !=0) {
			rem = no%10;
			rev = rev * 10 + rem;
			no = no/10;
			
		}
		System.out.println(rev);
	}

}
