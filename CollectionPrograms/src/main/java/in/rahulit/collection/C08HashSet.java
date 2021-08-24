package in.rahulit.collection;

import java.util.HashSet;

public class C08HashSet {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("B");
		hs.add("C");
		hs.add("Z");
		hs.add("Z");
		hs.add(null);
		hs.add(10);
		System.out.println(hs); // [null, B, C, Z, 10]

	}

}
