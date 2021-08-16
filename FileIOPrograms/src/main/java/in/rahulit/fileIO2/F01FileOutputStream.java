package in.rahulit.fileIO2;


import java.io.FileOutputStream;
// Output == Write
public class F01FileOutputStream {
	public static void main(String[] args) {
    try {
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\testout1.txt");
		fout.write(65);
		fout.close();
		
		System.out.println("Success....");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
