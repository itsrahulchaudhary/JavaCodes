package in.rahulit.logical.string;

public class S02RemoveSpecialChars {

	public static void main(String[] args) {
		String str = "$ja!va*$st%ar";

		// Approach - 1 (replaceAll() method)
		String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainStr);
	}

}
