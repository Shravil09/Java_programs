package Array;

import java.util.Scanner;

public class Array 
	{
		boolean meth1(int arr[]) 
		{	
			if(arr[0]==5 || arr[arr.length-1]==5)
				return true;
			return false;
				}
	public static void main(String[] args) 
	{
		int input[] = {10,30,10};
		boolean result = new Array().meth1(input);
				System.out.println(result);
		}
}
