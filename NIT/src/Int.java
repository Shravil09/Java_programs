
public class Int {
	public int[] makePi() {
		  return new int[] {3,1,4};
		}


	public static void main(String[] args) {
		int input[] = {3,1,4};
		 Object result = new Int().makePi();
		System.out.println(result);
	}

}
