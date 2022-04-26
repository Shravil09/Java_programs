package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Shravil", "Bhagwat");
		em1.setAlternateEmail("shravilbhagwat@gmail.com");
		System.out.println("Your Alternate Email is :" +em1.getAlternateEmail());
	}

}
