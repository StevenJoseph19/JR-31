package concurrency.issues;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DispatchTxPromoWorkerTransactions {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		SynchronizedBankAccount account = new SynchronizedBankAccount(100);
		// Retrieve TxPromoWorker instances
		TxPromoWorker[] workers = { new TxPromoWorker(account, 'w', 20), new TxPromoWorker(account, 'd', 1100),
				new TxPromoWorker(account, 'd', 200), new TxPromoWorker(account, 'w', 200), new TxPromoWorker(account, 'w', 190) };
		for (TxPromoWorker worker : workers)
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
