package test;

public class ClassA_3 {
	String makeOutWord(String out, String word) {
		return out.substring(0,2)+ word + out.substring(2);
	}
	public static void main(String[] args) {
		String result = new ClassA_3().makeOutWord("<<>>", "Shravil");
		System.out.println(result);

	}

}
