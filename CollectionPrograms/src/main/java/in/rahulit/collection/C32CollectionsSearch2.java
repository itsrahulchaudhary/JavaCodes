package in.rahulit.collection;

import java.util.ArrayList;
import java.util.Collections;

import in.rahulit.util.MyCompSearch;

public class C32CollectionsSearch2 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		
		System.out.println(l); // [15, 0, 20, 10, 5]
		
		Collections.sort(l, new MyCompSearch());
		System.out.println(l); // [20, 15, 10, 5, 0]
		
		System.out.println(Collections.binarySearch(l, 13, new MyCompSearch())); // -3
		
		System.out.println(Collections.binarySearch(l, 17));  // -6 unpredicatable result
		
		
		

	}

}
