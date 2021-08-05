package in.rahulit.logical.normal;

import java.util.Scanner;

public class N09Factorial {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number::");
		int no =sc.nextInt();
		int fact=1;
		for(int i=1; i<=no; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+no+" is "+fact);
		sc.close();
	}

}
