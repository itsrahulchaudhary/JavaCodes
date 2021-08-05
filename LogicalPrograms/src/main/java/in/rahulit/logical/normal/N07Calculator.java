package in.rahulit.logical.normal;

import java.util.Scanner;

public class N07Calculator {
	private static Scanner sc;

	public static void main(String[] args) {
		String yn;
		do {
			sc = new Scanner(System.in);
			System.out.println("Enter first Number ::");
			int no1 = sc.nextInt();
			System.out.println("Enter second Number ::");
			int no2 = sc.nextInt();
			System.out.println("Enter Symbol ( +, -, *,/ ) ::");
			String sym = sc.next();
			int res;
			switch (sym) {
			case "+":
				res = no1 + no2;
				System.out.println("Sum is :: " + res);
				break;
			case "-":
				res = no1 - no2;
				System.out.println("Subtraction is :: " + res);
				break;
			case "*":
				res = no1 * no2;
				System.out.println("Multiply is :: " + res);
				break;
			case "/":
				res = no1 / no2;
				System.out.println("Divide is :: " + res);
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			System.out.println("Do you want to continue (Press y for Yes and n for No");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));

	}

}
