package in.rahulit.fileIO2;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class F13DataInputStream {
	public static void main(String[] args) throws Exception {
		FileInputStream input = new FileInputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\testout2.txt");
		DataInputStream inst = new DataInputStream(input);
		int count = input.available();
		byte[] ary = new byte[count];
		inst.read(ary);
		for (byte bt : ary) {
			char k = (char) bt;
			System.out.print(k + "-");
		}
		inst.close();
	}

}
