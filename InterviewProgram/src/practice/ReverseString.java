package practice;

public class ReverseString {
	public static void main(String[] args) {
		String str = "mad";
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--) 
		{
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev)) 
		{
			System.out.println("Palindrom String");
		}
		else
			System.out.println("Not a Palindrom String");
	}
}
