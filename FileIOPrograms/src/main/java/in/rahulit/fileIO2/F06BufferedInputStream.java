package in.rahulit.fileIO2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class F06BufferedInputStream {
	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\bufferOutput.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		int i = bin.read();
		while (i != -1) {
			System.out.print((char) i);
			i = bin.read();
		}
		bin.close();
		fin.close();

	}
}
