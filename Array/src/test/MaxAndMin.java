package test;

public class MaxAndMin {
	
	public static void main(String[] args) {
		int arr[] = {12,39,50,45, 29, 9, 25};
		
		int MaxNum = arr[0];
		int MinNum = arr[0];
		
		for(int i=0; i<arr.length; i++) 
		{
			if(MaxNum < arr[i] ) 
			{
				MaxNum = arr[i];
			}
			else if(MinNum > arr[i] ) 
			{
				MinNum = arr[i];
			}
		}
		System.out.println("Largest Number :" +MaxNum);
		System.out.println("Smallest Number :"+ MinNum);
	}

}
