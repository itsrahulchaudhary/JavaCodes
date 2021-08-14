package in.rahulit.logical.string;

import java.util.Arrays;

public class S05SortStringChar {
	public static void main(String[] args) {
		String str = "java";
		
		// Approach-1
		char temp;
		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.println(new String(arr));
		
		// Approach-2
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));
		
	}

}
