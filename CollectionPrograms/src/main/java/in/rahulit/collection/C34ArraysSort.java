package in.rahulit.collection;

import java.util.Arrays;

import in.rahulit.util.MyCompArraySort;

public class C34ArraysSort {
	public static void main(String[] args) {

		int[] a = { 10, 5, 20, 11, 6 };
		
		System.out.println("Primitive Array before sorting::");
		for (int a1 : a) {
			System.out.print(a1+" "); // 10 5 20 11 6 
		}
		Arrays.sort(a);
		
		System.out.println();
		
		System.out.println("Primitive Array After sorting::");
		for (int a1 : a) {
			System.out.print(a1+" "); // 5 6 10 11 20 
		}
		
		System.out.println();
		String[] s= {"A", "Z", "B"};
		System.out.println("Object Array Before sorting::");
		for (String a1 : s) {
			System.out.print(a1+" "); // A Z B 
		}
		Arrays.sort(s);
		
		System.out.println();
		System.out.println("Object Array After sorting::");
		for (String a1 : s) {
			System.out.print(a1+" "); // A B Z 
		}
		
		Arrays.sort(s, new MyCompArraySort());
		System.out.println();
		System.out.println("Object Array After sorting by comparator::");
		for (String a1 : s) {
			System.out.print(a1+" "); // Z B A 
		}
		
		
	}

}
