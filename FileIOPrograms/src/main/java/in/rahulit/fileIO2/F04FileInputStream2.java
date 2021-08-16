package in.rahulit.fileIO2;

import java.io.FileInputStream;
 

public class F04FileInputStream2 {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\FileIOPrograms\\file2\\testout2.txt");
		    
			/*
			 * int i = 0;
			 * while((i=fin.read())!=-1) 
			 * { 
			 *    System.out.print((char)i); 
			 *  }
			 */
			
			int read = fin.read();
			while (read != -1) {
				System.out.print((char) read);
				read = fin.read();
			}
			fin.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
