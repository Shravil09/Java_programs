import java.util.*;
public class PrimeNoSeries {
	public static void main(String[] args) {
		
		int d, num, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		n = sc.nextInt();
		for( num=1; num<=n;num++) 
		{
			for(d=2; d<=num; d++) {
				if(num%d==0) 
					break;
				}
			if(d==num)
				System.out.println(num+" ");
			}
		}
	}

