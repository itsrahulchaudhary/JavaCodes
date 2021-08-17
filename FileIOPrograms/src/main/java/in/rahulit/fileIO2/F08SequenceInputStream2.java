package in.rahulit.fileIO2;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.SequenceInputStream;
// Example that reads the data from two files and writes into another file
public class F08SequenceInputStream2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis1 = new FileInputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\bufferOutput.txt");
		FileInputStream fis2 = new FileInputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\testout2.txt");
		FileOutputStream fout = new FileOutputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\seqResult.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		int read = sis.read();
		while (read != -1) {
			fout.write(read);
			read = sis.read();
		}
		System.out.println("success...");
		sis.close();
		fout.close();
		fis1.close();
		fis2.close();
	}

}
