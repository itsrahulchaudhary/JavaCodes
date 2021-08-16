package in.rahulit.fileIO2;

 
import java.io.FileOutputStream;

public class F02FileOutputStream2 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\testout2.txt");
			String s = "Welcome to India...";
			byte[] bytes = s.getBytes();
			fout.write(bytes);
			fout.close();
			System.out.println("Success...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
