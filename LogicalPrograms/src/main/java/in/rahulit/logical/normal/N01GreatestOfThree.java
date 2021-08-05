package in.rahulit.logical.normal;

public class N01GreatestOfThree {
	public static void main(String[] args) {

		int a = 120;
		int b = 220;
		int c = 30;
		if (a > b && a > c) {
			System.out.println("A is greater");
		} else if (b > a && b > c) {
			System.out.println("B is greater");
		} else {
			System.out.println("c is greater");
		}
	}

}
