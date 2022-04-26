
public class Palindrom {

	public static void main(String[] args) {
		int t=122, rev=0, rem;
		int temp=t;
		while(temp!=0) {
			rem= temp%10;
			rev=rev*10+rem;
			temp= temp/10;
		}
		if(t==rev)
		{
			System.out.println(t+" is a Palindrom");
		}
		else {
			System.out.println(t + " is not a Palindrom");
		}
		
	}

}
