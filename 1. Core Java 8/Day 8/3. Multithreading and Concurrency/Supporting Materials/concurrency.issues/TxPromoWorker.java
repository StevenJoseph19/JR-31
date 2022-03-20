package concurrency.issues;

public class TxPromoWorker extends TxWorker {
	protected SynchronizedBankAccount account;
	protected char txType; // ‘w’ -> withdrawal, ‘d’ -> deposit
	protected int amt;

	public TxPromoWorker(SynchronizedBankAccount account, char txType, int amt) {
		super(account, txType, amt);
		this.account = account;
		this.txType = txType;
		this.amt = amt;
	}

	public void run() {
		int startBalance = account.getBalance();

		if (txType == 'w')
			account.withdrawal(amt);
		else if (txType == 'd') {
			account.deposit(amt);
			if (account.getBalance() > 500) {

				int bonus = ((int) ((account.getBalance() - 500) * 0.1));
				account.deposit(bonus);

			}
		}

		int endBalance = account.getBalance();

		System.out.println("End Balance : " + endBalance + "  Start Balance :  " + startBalance);
	}
}
