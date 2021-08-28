package in.rahulit.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * WAP to insert String Object inot that TreeSet where all elements should be
 * inserted according to reverse of alphabetical order.
 * 
 */
public class C13TreeSetComparator2 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator2());
		t.add("Roja");
		t.add("ShobhaRani");
		t.add("RajaKumari");
		t.add("GangaBhawani");
		t.add("Ramulamma");
		System.out.println(t); // [ShobhaRani, Roja, Ramulamma, RajaKumari, GangaBhawani]
	}

}

class MyComparator2 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = (String) o2;
		return s2.compareTo(s1);

	}

}
