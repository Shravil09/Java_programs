import java.util.Scanner;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		int a=0, b=1, c, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number you want to generate for fibnocci Series");
		temp=sc.nextInt();
		System.out.println(a+" "+b+"  ");
	
		for(int i=0; i<=temp-2;i++) 
		{
			c=a+b;
			System.out.println(c+" ");
			b=a;
			a=c;
		}
	}

}
