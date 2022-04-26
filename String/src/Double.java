
public class Double {
	public String doubleChar(String str) 
	{
		String s = "";
		for(int i=0; i<=str.length(); i++) {
			s += str.charAt(i);
			s += str.charAt(i);
			}
			return s;
		}
		
	public static void main(String[] args) {
		String  result = new Double().doubleChar("The");
		System.out.println(result);
	}
}
