package in.rahulit.collection;

import java.util.ArrayList;
import java.util.Collections;

import in.rahulit.util.MyComp;

public class C30CollectionsSort2 {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
		
		System.out.println("Before Sorting :: " + l);  // [Z, A, K, L]
		
        Collections.sort(l, new MyComp());
	 
		System.out.println("After Sorting :: " + l);  // [Z, L, K, A]

	}
}
