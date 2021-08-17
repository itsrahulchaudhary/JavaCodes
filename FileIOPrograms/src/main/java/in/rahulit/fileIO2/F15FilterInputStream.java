package in.rahulit.fileIO2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.FilterInputStream;

public class F15FilterInputStream {
	public static void main(String[] args) throws Exception {
		File data = new File(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\filterOutput.txt");
		FileInputStream file = new FileInputStream(data);
		FilterInputStream filter = new BufferedInputStream(file);
		int k = filter.read();
		while (k != -1) {
			System.out.print((char) k);
			k = filter.read();
		}
		file.close();
		filter.close();
	}
}
