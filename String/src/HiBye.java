
public class HiBye {
	public String meth1() 
	{
		String a = "Hi";
		String b = "Bye";
		
		System.out.println(a.concat(b).concat(b).concat(a));
		return a;
				
	}
	
	public static void main(String[] args) {
		HiBye hb = new HiBye();
		hb.meth1();
	}

}
