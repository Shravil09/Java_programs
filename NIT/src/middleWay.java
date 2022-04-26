
public class middleWay {
	public int[] biggerTwo(int[] a, int[] b) {

		  if (b[1] + b[0] > a[1] + a[0])
		  return b;
		  else
		  return a;
		}
	public static void main(String[] args) {
		int input[] = {1,2,3};
		int input1[] = {4,5,6};
		int result[] = new middleWay().biggerTwo(input, input1);
		for(int x: result)
		System.out.println(result);
	}


}
