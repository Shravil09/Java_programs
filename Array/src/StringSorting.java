
public class StringSorting {

	public static void main(String[] args) {
		String temp;
		
		String[] a = {"shravil", "shubham", "Aditi", "Aditya"};
		for(int i=0; i<a.length; i++) 
		{
			for(int j = 0; j<a.length-1-i; j++) 
			{
				if(a[i].compareTo(a[i+1])>0) {
					temp = a[i];
					a[i] = a[i+i];
					a[i+1]	= temp;
					}
			}
		}
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
	}

}
