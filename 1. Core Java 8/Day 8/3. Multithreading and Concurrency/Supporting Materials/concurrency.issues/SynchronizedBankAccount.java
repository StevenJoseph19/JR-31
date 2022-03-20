package concurrency.issues;

public class SynchronizedBankAccount {
	private int balance;

	public SynchronizedBankAccount(int startBalance) {
		balance = startBalance;
	}

	public synchronized int getBalance() {
		return balance;
	}

	public synchronized void deposit(int amount) {
		balance += amount;
	}

	public synchronized void withdrawal(int amount) {
		balance -= amount;
	}

}
