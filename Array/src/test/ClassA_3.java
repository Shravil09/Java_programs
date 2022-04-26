package test;

public class ClassA_3 {
	int meth() {
		int arr[] = {1,5};
		if(arr.length>=2)
			return arr[0]+arr[1]; 
		else if(arr.length<2)
		return arr[0];
		else
			return 0;
	}
	

	public static void main(String[] args) {
		int result = new ClassA_3().meth();
		System.out.println(result);

	}

}
