import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int item =15;
		//Scanner sint item;c = new Scanner(System.in);
		//System.out.println("Enter the Number");
		//item= sc.nextInt();
		
		int[] a = {1,25,8,3,14,15};
		for(int i = 0; i<a.length; i++) {
			if(a[i]==item) {
				System.out.println("Item is present at "+i+" index position");
			}
		}
	}

}
