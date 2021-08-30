package in.rahulit.collection;

import java.util.TreeMap;

public class C28NavigableMap {
	public static void main(String[] args) {
		TreeMap<String, String> t = new TreeMap<String, String>();
		t.put("b", "banana");
		t.put("c", "cat");
		t.put("a", "apple");
		t.put("g", "gun");
		System.out.println(t); // {a=apple, b=banana, c=cat, g=gun}
		System.out.println(t.ceilingKey("c")); // c
		System.out.println(t.higherKey("e")); // g
		System.out.println(t.floorKey("e")); // c
		System.out.println(t.lowerKey("e")); // c
		System.out.println(t.pollFirstEntry()); // a=apple
		System.out.println(t.pollLastEntry()); // g=gun
		System.out.println(t.descendingKeySet()); // [c, b]
		System.out.println(t); // {b=banana, c=cat}

	}

}
