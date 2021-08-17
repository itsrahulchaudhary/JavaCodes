package in.rahulit.fileIO2;

import java.io.BufferedOutputStream;

import java.io.FileOutputStream;

public class F05BufferedOutputStream {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\bufferOutput.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Welcome to java !!!";
		byte[] bs = s.getBytes();
		bout.write(bs);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("Success...");

	}

}
