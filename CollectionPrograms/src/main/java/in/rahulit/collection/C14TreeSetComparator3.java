package in.rahulit.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * WAP to insert String Buffer Object into the TreeSet where sorting order is
 * alphabetical order.
 */
public class C14TreeSetComparator3 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator3());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		System.out.println(t); // [A, K, L, Z]

	}
}

class MyComparator3 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}

}
