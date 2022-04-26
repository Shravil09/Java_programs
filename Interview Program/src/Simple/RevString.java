package Simple;

public class RevString {

	public static void main(String[] args) {
		String name = "Shravil";
		int length = name.length();
		String rev = "";
		
		for(int i=name.length()-1; i>=0; i--) 
		{
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
	}
}	
