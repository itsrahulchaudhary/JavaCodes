package in.rahulit.collection;

import java.util.Comparator;
import java.util.TreeMap;

public class C22TreeMap2 {
	public static void main(String[] args) {
		TreeMap m=new TreeMap(new MyComp());
		m.put("XXX", 10);
		m.put("AAA", 20);
		m.put("ZZZ", 30);
		m.put("LLL", 40);
		System.out.println(m); //{AAA=20, LLL=40, XXX=10, ZZZ=30}
	}

}

class MyComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}

}