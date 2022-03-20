package simple.adder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AdderWithThreading implements Runnable {
	private String inFile, outFile;

	public AdderWithThreading(String inFile, String outFile) {
		/* assign filenames to member fields */
		super();
		this.inFile = inFile;
		this.outFile = outFile;
	}

	public void doAdd() throws IOException {
		int total = 0;
		String line = null;
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(inFile))) {
			while ((line = reader.readLine()) != null)
				total += Integer.parseInt(line);
		}
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outFile))) {
			writer.write("Total: " + total);
		}
	}

	@Override
	public void run() {
		try {
			doAdd();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
