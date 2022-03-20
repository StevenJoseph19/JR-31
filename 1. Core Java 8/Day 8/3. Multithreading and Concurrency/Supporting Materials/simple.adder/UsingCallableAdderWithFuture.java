package simple.adder;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class UsingCallableAdderWithFuture {

	public static void main(String[] args) {
		String[] inFiles = { "./file1.txt", "./file2.txt" };

		ExecutorService es = Executors.newFixedThreadPool(3);
		Future<Integer>[] results = new Future[inFiles.length];

		for (int i = 0; i < inFiles.length; i++) {
			CallableAdder adder = new CallableAdder(inFiles[i]);
			results[i] = es.submit(adder);
		}

		for (Future<Integer> result : results) {
			try {
				int value = result.get(); // blocks until return value available
				System.out.println("Total: " + value);
			} catch (ExecutionException e) { // Exception raised in Adder

				Throwable adderEx = e.getCause(); // Get the Adder exception
				// Do something with adderEx
			} catch (Exception e) {

			} // Non-Adder exceptions
		}

		try {
			es.shutdown();
			es.awaitTermination(60, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
