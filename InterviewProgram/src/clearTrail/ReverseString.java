package clearTrail;

public class ReverseString {
	void meth1() 
	{
		String name = "Shravil";
		String rev ="";
		
		for(int i=name.length()-1; i>=0; i--) {
			rev = rev+name.charAt(i);
		}
		if(name.equals(rev))
		System.out.println("Palindrome String");
		else
			System.out.println("Not");
	}
	public static void main(String[] args) {
		
		new ReverseString().meth1();
	}

}
