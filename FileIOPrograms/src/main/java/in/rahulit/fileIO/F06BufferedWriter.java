package in.rahulit.fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class F06BufferedWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file\\bufferWriter.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(114);
		bw.write("ahul\nChadhary");
		bw.newLine();
		char ch[] = { 'a', 'b', 'c', 'z' };
		bw.write(ch);
		bw.newLine();
		bw.flush();
		bw.close();

	}

}
