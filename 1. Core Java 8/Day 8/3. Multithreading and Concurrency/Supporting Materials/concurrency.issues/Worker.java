package concurrency.issues;

public class Worker implements Runnable {
	private BankAccount account;

	public Worker(BankAccount account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			int startBalance = account.getBalance();
			account.deposit(10);
			int endBalance = account.getBalance();

			System.out.println("End Balance : " + endBalance + "  Start Balance :  " + startBalance);
		}
	}
}
