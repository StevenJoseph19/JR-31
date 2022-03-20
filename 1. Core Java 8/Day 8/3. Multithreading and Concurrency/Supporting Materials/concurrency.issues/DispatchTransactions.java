package concurrency.issues;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DispatchTransactions {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		SynchronizedBankAccount account = new SynchronizedBankAccount(100);
		// Retrieve TxWorker instances
		TxWorker[] workers = { new TxWorker(account, 'w', 20), new TxWorker(account, 'd', 1100),
				new TxWorker(account, 'd', 200), new TxWorker(account, 'w', 200), new TxWorker(account, 'w', 190) };
		for (TxWorker worker : workers)
			es.submit(worker);

		// Shutdown es and wait
		try {
			es.shutdown();
			es.awaitTermination(60, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
