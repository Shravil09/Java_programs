package clearTrail;

public class ClassA {
	int avl_amount =1000;
	void wd_amount(int amount) 
	{
		if(avl_amount<amount) {
			throw new RuntimeException("Insufficient Balance");
		}
		else {
		System.out.println("Transaction Successfull");
		}
	}
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.wd_amount(40000);
	}

}
