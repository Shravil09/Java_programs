package abstraction;

public class BankDesp extends Bank {
	int getBalance() {
		System.out.println("Deposite amount is: ");
		return 100 ;
	}

	public static void main(String[] args) {
		BankDesp d = new BankDesp();
		BankA a = new BankA();
		BankB b = new BankB();
		BankC c = new BankC();
		d.getBalance();
		a.deposit(1000);
		b.deposit(2000);
		c.deposit(2500);
		
//		System.out.println("Balance of BankA = $"+a.getBalance());
//		System.out.println("Balance of BankB = $"+b.getBalance());
//		System.out.println("Balance of BankC = "+c.getBalance());
	}

}
