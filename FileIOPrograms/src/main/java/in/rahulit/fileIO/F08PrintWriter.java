package in.rahulit.fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class F08PrintWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file\\printWriter.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.write(114);
		pw.println(100);
		pw.println(true);
		pw.println("R");
		pw.println(12.45);
		pw.flush();
		pw.close();

	}

}
