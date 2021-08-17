package in.rahulit.fileIO2;

import java.io.ByteArrayInputStream;
// ByteArrayInputStream class to read byte array as input stream.
public class F11ByteArrayInputStream {
	public static void main(String[] args) {
		byte[] buf = { 35, 36, 37, 38 };
		// Create the new byte array input stream
		ByteArrayInputStream byt = new ByteArrayInputStream(buf);
		int i = byt.read();
		while (i != -1) {
			char ch = (char) i;
			System.out.println("ASCII value of Character is:" + i + "; Special character is: " + ch);
			i = byt.read();
		}
	}

}
