package in.rahulit.collection;

import java.util.TreeSet;

public class C10TreeSet {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		// t.add(10); CCE
		// t.add(null); // NPE
	}

}
