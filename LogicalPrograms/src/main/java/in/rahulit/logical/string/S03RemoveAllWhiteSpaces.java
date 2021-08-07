package in.rahulit.logical.string;

public class S03RemoveAllWhiteSpaces {
	public static void main(String[] args) {
		
		String str = "  j a va  s ta r ";
		String str2 = str.replaceAll("\\s", "");
		System.out.println(str2);
	}

}
