package in.rahulit.fileIO2;

import java.io.DataOutputStream;

import java.io.FileOutputStream;

public class F12DataOutputStream {
	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\dataOutput.txt");
		DataOutputStream data = new DataOutputStream(file);
		data.write(65);
		data.flush();
		data.close();
		System.out.println("success...");

	}

}
