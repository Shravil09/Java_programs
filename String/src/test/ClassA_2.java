package test;

public class ClassA_2 {

	
		String makeAbba(String a, String b) {
			
			return a+b+b+a;
		}
		public static void main(String[] args) 
		{
		String result = new ClassA_2().makeAbba("Hi", "Bye");
		System.out.println(result);

	}

}
