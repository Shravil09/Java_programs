package abstraction;

public abstract class Bank {
	abstract int getBalance();
}

class BankA extends Bank{
	int balance;
	void deposit(int money) {
		balance+=money;
	}
//	@Override
	int getBalance() {
		return balance;
	}
}
class BankB extends Bank{
	int balance;
	void deposit(int money) {
		balance += money;
	}
//	@Override
	int getBalance() {

	return balance;
	}
}
class BankC extends Bank{
	int balance;
	void deposit(int money) {
		balance += money;
	}
	@Override
	int getBalance() {

	return balance;
	}
}

