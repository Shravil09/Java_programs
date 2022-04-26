package test;

public class ClassA_4 {
	boolean firstLast6() {
		int arr[] = {10,20,30, 6};
		if(arr[0]==6 || arr[arr.length-1]==6) 
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		boolean result = new ClassA_4().firstLast6();
		System.out.println(result);
	}

}
