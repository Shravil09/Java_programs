package interview;

public class ReverseString {
	public static void main(String[] args) {
		String name = "adam";
		String rev = "";
		
		for (int i = name.length()-1; i>=0 ; i--) {
			rev = rev+name.charAt(i);
		}
		if(name.equals(rev)) 
		{
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Isn't Palindrome String");
		}
	}

}
