package in.rahulit.logical.normal;

import java.util.Scanner;

public class N10FactorialByRecursion {
	static int fact = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number::");
		int no = sc.nextInt();
		N10FactorialByRecursion obj = new N10FactorialByRecursion();
		int res = obj.calculateFactorial(no);
		System.out.println(res);

		sc.close();

	}

	public int calculateFactorial(int no) {
		if (no >= 1) {
			fact = fact * no;
			calculateFactorial(no - 1);
		}
		return fact;
	}
}
