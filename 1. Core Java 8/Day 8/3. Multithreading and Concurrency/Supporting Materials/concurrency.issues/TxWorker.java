package concurrency.issues;

public class TxWorker implements Runnable {
	protected SynchronizedBankAccount account;
	protected char txType; // ‘w’ -> withdrawal, ‘d’ -> deposit
	protected int amt;

	public TxWorker(SynchronizedBankAccount account, char txType, int amt) {
		super();
		this.account = account;
		this.txType = txType;
		this.amt = amt;
	}

	public void run() {
		int startBalance = account.getBalance();

		if (txType == 'w')
			account.withdrawal(amt);
		else if (txType == 'd')
			account.deposit(amt);

		int endBalance = account.getBalance();

		System.out.println("End Balance : " + endBalance + "  Start Balance :  " + startBalance);
	}
}
