package test;

public class ClassA_5 {
	int sum3() {
		int arr[] = {1,2,3};
		int sum=0;
		for(int i=0; i<arr.length; i++) 
		{
			sum = sum + arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int result = new ClassA_5().sum3();
		System.out.println(result);

	}

}
