package in.rahulit.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class F07BufferedReader {
	public static void main(String[] args) throws IOException {
		FileReader fw = new FileReader("C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file\\bufferReader.txt");
		BufferedReader br = new BufferedReader(fw);
		String line = br.readLine();
		while(line!=null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}

}
