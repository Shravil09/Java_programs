package test;

public class Duplicates {

	public static void main(String[] args) {
		int arr[] = {1, 5, 5, 8, 25, 30, 30};
		 for(int i=0; i<arr.length; i++) 
		 {
			 for(int j= i+1; j<arr.length; j++) 
			 {
				 if(arr[i]==arr[j]) 
				 {
					 System.out.println("Duplicate Element of Array :" + arr[i]);
				 }
			 }
		 }
	}

}
