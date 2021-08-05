package in.rahulit.logical.normal;

import java.util.Scanner;

public class N08PrintTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print table::");
		int no = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(no + " * " + i + " = " + i * no);
		}
		sc.close();

	}

}
