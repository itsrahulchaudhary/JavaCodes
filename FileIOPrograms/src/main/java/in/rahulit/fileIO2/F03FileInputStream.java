package in.rahulit.fileIO2;

import java.io.FileInputStream;
 

public class F03FileInputStream {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\testout2.txt");
			int i = fin.read(); // it will return single character
			System.out.println((char) i);
			fin.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
