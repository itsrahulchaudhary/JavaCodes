package in.rahulit.fileIO2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;
// SequenceInputStream example that reads data using enumeration
public class F09SequenceInputStream3 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis1 = new FileInputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\a.txt");
		FileInputStream fis2 = new FileInputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\b.txt");
		FileInputStream fis3 = new FileInputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\c.txt");
		FileInputStream fis4 = new FileInputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\d.txt");
		FileOutputStream fout = new FileOutputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\seqResult2.txt");
		
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		v.add(fis4);
		Enumeration<FileInputStream> e = v.elements();
		
		SequenceInputStream sis = new SequenceInputStream(e);
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
		fis3.close();
		fis4.close();
	}

}
