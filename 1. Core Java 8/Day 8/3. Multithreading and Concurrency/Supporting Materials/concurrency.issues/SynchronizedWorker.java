package concurrency.issues;

public class SynchronizedWorker implements Runnable {
	private SynchronizedBankAccount account;

	public SynchronizedWorker(SynchronizedBankAccount account) {
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
