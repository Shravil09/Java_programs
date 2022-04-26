package test;

public class ClassA_2 {
	boolean meth() 
	{
		int arr[] = {4,5};
			if(arr[0] !=2 && arr[1] !=2 && arr[0] !=3 && arr[1] != 3)
			{
				return true;
				}
			return false;
	}

	public static void main(String[] args) {
		boolean result = new ClassA_2().meth();
		System.out.println(result);
	}

}
