package in.rahulit.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class C24Properties {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\CollectionPrograms\\abc.properties");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("venki");//888
		System.out.println(s);
		p.setProperty("nag", "9999");
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\Dell\\OneDrive\\Documents\\StudyStuff\\Backend\\JavaCodes\\CollectionPrograms\\abc.properties");
		p.store(fos, "updated by rahul::");

	}

}
