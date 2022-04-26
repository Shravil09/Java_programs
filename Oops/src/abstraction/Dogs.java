package abstraction;

public class Dogs extends Animals{
	void cats() {
		
	}
	void dogs() {
		System.out.println("Dogs Bark");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cats c = new Cats();
		c.cats();
		
		Dogs d = new Dogs();
		d.dogs();
	}

}
