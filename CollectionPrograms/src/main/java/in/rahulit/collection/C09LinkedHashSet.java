package in.rahulit.collection;

import java.util.LinkedHashSet;

public class C09LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		lhs.add("Z");
		lhs.add(null);
		lhs.add(10);
		System.out.println(lhs);

	}

}
