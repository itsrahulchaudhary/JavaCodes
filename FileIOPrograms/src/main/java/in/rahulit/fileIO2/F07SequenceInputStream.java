package in.rahulit.fileIO2;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class F07SequenceInputStream {
	public static void main(String[] args) throws Exception {
		FileInputStream fis1 = new FileInputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\bufferOutput.txt");
		FileInputStream fis2 = new FileInputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\testout2.txt");

		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		int read = sis.read();
		while (read != -1) {
			System.out.print((char) read);
			read = sis.read();
		}
		sis.close();
		fis1.close();
		fis2.close();

	}

}
