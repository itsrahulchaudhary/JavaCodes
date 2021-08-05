package in.rahulit.logical.normal;

import java.util.Scanner;

public class N06UserInputOutput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = sc.next();
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		System.out.println("Enter your gender :");
		char gender = sc.next().charAt(0);
		System.out.println("Enter your phone number :");
		long phone = sc.nextLong();

		System.out.println("---------------------------------------------------");

		System.out.println("Name :: " + name);
		System.out.println("Age :: " + age);
		System.out.println("Gender :: " + gender);
		System.out.println("Phone  :: " + phone);
		sc.close();
	}

}
