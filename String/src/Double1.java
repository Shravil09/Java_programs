
public class Double1 {
	/* 1
	 public String doubleChar(String str) {
		String S =  "";
		for(int i=0; i<=str.length()-1;i++) 
		{
			S +=str.charAt(i);
			S +=str.charAt(i);
			S +=str.charAt(i);
		}
		return S;
		}
	public static void main(String[] args) {
	String result = new Double1().doubleChar("Shravil");
	System.out.println(result);
		}*/
	/*
	 2
	 public String helloName(String str) {
		String name = "";
		return "Hello "+ name + "!";
	}
	public static void main(String[] args) {
		String result = new Double1().helloName("Shravil");
		System.out.println(result);*/
	/*
	 3
	 public String makeOutWord(String out, String word) 
	{
		return out.substring(0,2)+word+out.substring(2);
	}
	public static void main(String[] args) {
		String result = new Double1().makeOutWord("<<>>", "Shravil");
		System.out.println(result);*/
	/*
	 /*
	  4
	 
	 public String extraEnd(String str) {
		String s = str.substring(str.length()-2);
		return s+s+s;
		}
	public static void main(String[] args) {
		String result = new Double1().extraEnd("Hello");
		System.out.println(result);
				}
	}*/
	/*
	 5
	 public String firstTwo(String Str) {

		return  .substring(0,2);
	}
	public static void main(String[] args) {
		String result = new Double1().firstTwo("Hello");
		System.out.println(result);
	}}*/
	/*
	6
	public String firstHalf(String str) {
		return str.substring(0, str.length()/2);
	}
	public static void main(String[] args) {
		String result = new Double1().firstHalf("Shra vil Bhagwat");
		System.out.println(result);
	}}*/
	/*
	7
	public String doubleChar(String str)
	{
		String s = "";
		for(int i=0; i<=str.length()-1; i++) 
		{
			s+= str.charAt(i);
			s+= str.charAt(i);
			s+= str.charAt(i);
		}
		return s;
	}
	public static void main(String[] args) {
		String result = new  Double1().doubleChar("The");
		System.out.println(result);
	}
	} 
	*/
	
	/*
	 public boolean frontAgain(String str) 
	 
	{
		if( str.length()>=0 && str.substring(0,2).equals(str.substring(str.length()-2))) {
			return true;
	}
		return false;
		}
	public static void main(String[] args) {
		boolean result = new Double1().frontAgain("edit");
		System.out.println(result);
	}
	}*/
	public String countHi(String str) 
	{
		int count =0;
		for(int i=0; i<=str.length()-1; i++) {
			if((str.charAt(i)=='h') && (str.charAt(i+1)=='i'))
				
			count++; 
	}
		return str;}
	public static void main(String args[]) {
		String result = new Double1().countHi("abchi");
		System.out.println(result);
	}}