package practice;

public class FirstNonRepeatedCharFirst {

	public static void main(String[] args) {
		String str = "naina";
		
		for(char i : str.toCharArray()) 
		{
			if(str.indexOf(i) == str.lastIndexOf(i)) 
			{
				System.out.println("First non-repeating character is : "+i);
			}
		}

	}

}
