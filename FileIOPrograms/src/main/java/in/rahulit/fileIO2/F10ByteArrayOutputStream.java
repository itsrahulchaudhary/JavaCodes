package in.rahulit.fileIO2;

import java.io.ByteArrayOutputStream;

import java.io.FileOutputStream;
// ByteArrayOutputStream class to write common data into 2 files
public class F10ByteArrayOutputStream {
	public static void main(String[] args) throws Exception {
		FileOutputStream fout1 = new FileOutputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\baos1.txt");
		FileOutputStream fout2 = new FileOutputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\baos2.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(65);
		String s = "Welcome to Java IO";
		baos.write(s.getBytes());
		baos.writeTo(fout1);
		baos.writeTo(fout2);
		System.out.println("success...");

	}

}
