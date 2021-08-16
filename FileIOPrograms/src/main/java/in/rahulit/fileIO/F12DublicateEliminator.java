package in.rahulit.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class F12DublicateEliminator {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file\\dublicateEliminator.txt");
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file\\deleteDublicate.txt"));
		String line = br.readLine();
		while (null != line) {
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file\\dublicateEliminator.txt"));
			String target = br2.readLine();
			while (null != target) {
				if (line.equals(target)) {
					available = true;
					break;
				}
				target = br2.readLine();
			}
			if (available == false) {
				pw.println(line);
				pw.flush();
			}
			line = br.readLine();
		}
		br.close();
		pw.close();

	}

}
