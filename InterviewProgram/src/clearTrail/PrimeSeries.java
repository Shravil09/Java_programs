package clearTrail;

public class PrimeSeries {
	public static void main(String[] args) {
		int j= 0;
		for(int i=1; i<=200; i++) {
			for(j=2; j<=i-1; j++) {
				if(i%j==0)
					break;
			}
			if(j==i)
				System.out.println(i+" ");
		}
		}
	}


