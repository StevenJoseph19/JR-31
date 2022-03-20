package simple.adder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

public class CallableAdder implements Callable<Integer> {
	private String inFile;

	public CallableAdder(String inFile) {
		/* assign filenames to member fields */
		super();
		this.inFile = inFile;

	}

	public int doAdd() throws IOException {
		int total = 0;
		String line = null;
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(inFile))) {
			while ((line = reader.readLine()) != null)
				total += Integer.parseInt(line);
		}
		return total;
	}

	@Override
	public Integer call() throws IOException {

		return doAdd();
	}

}
