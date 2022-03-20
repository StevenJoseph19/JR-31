package concurrency.issues;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingleThreadExecutor {

	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(5);
		BankAccount account = new BankAccount(100);

		Worker worker = new Worker(account);
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
