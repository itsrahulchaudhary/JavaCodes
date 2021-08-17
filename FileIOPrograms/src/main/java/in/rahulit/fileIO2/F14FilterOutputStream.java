package in.rahulit.fileIO2;

import java.io.File;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class F14FilterOutputStream {
	public static void main(String[] args) throws Exception {
		File data = new File(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\filterOutput.txt");
		FileOutputStream file = new FileOutputStream(data);
		FilterOutputStream filter = new FilterOutputStream(file);
		String s = "Welcome to Java File IO.";
		byte b[] = s.getBytes();
		filter.write(b);
		filter.flush();
		filter.close();
		file.close();
		System.out.println("Success...");
	}

}
