package in.rahulit.logical.normal;

public class N12ReverseString {
	public static void main(String[] args) {
		String name = "jatin";
		int length = name.length();
		String rev = "";
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println("Reverse of "+name+" is "+rev);
	}

}
