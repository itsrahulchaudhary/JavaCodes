package in.rahulit.fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class F05FileReader {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file\\fileReader.txt");
		FileReader fr = new FileReader(f);
		char ch[] = new char[(int)f.length()];
		fr.read(ch);
		for(char ch1 : ch) {
			System.out.print(ch1);
		}
		fr.close();
		System.out.println();
		System.out.println("-------------------------------------");
		FileReader fr1 = new FileReader("C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file\\fileReader.txt");
		int i=fr1.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr1.read();
		}
		fr1.close();
	}

}
