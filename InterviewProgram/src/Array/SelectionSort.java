package Array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {6,5,7,3,4,1,2};
		int min, temp;
		for(int i=0; i<a.length; i++) 
		{
			min = i;
			for(int j=i+1; j<a.length; j++) 
			{
				if(a[j]<a[min]) 
				{
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for(int i=0; i<a.length; i++) 
		{
			System.out.println(a[i]+ " ");
		}
	}

}
