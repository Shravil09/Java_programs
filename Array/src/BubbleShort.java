
public class BubbleShort {

	public static void main(String[] args) {
		int[] a = {36, 19, 29, 12, 9};
		int temp;
		for(int i = 0; i<a.length; i++) 
		{
			for(int j = 0; j<a.length-1; j++) {
				if(a[i]>a[j+1]) {
				temp = a[i];
				a[i] = a[j+1];
				a[j+1] = temp;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] +" ");
		}
	}

}
