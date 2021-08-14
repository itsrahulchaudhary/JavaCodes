package in.rahulit.fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class F04FileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file\\rahulFile.txt", true);
		fw.write(114);
		fw.write("ahul\nChadhary");
		fw.write('\n');
		char ch[] = { 'a', 'b', 'c' };
		fw.write(ch);
		fw.write('\n');
		fw.flush();
		fw.close();

	}
}
