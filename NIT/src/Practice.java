
public class Practice {
	void meth(int n ,int m) {
		for(int i=n; i<=10; i++) {
	 	     int j = m*i;
			if(i>2 && i<10) {
				System.out.println(".");
			}
			else {
				System.out.println("2 * "+ i +" = "+j);
			}
			
		}
	}
	public static void main(String[] args) {
		Practice obj = new Practice();
		obj.meth(1,2);
	

}
}

 