package test;

public class ClassA_1 {
	int [] meth1() 
	{
		int arr[]= {1,2,3};
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]==2 && arr[i+1]==3) {
				arr[i+1]=0;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int [] result = new ClassA_1().meth1();
		for(int x : result) 
		{
			System.out.println(x);
		}
	}

}
