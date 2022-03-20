package simple.adder;

public class UsingAdderWithSeparateThreads {

	public static void main(String[] args) throws InterruptedException {
		String[] inFiles = { "./file1.txt", "./file2.txt" };
		String[] outFiles = { "./file1.out.txt", "./file2.out.txt" };
		Thread[] threads = new Thread[inFiles.length];
		for (int i = 0; i < inFiles.length; i++) {
			AdderWithThreading adder = new AdderWithThreading(inFiles[i], outFiles[i]);
			threads[i] = new Thread(adder);
			threads[i].start();
		}

		for (Thread thread : threads)
			thread.join(); // Blocks waiting for thread completion

	}

}
