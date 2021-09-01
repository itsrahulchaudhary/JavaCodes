package in.rahulit.util;

import java.util.Comparator;

public class MyCompArraySort implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();

		return s2.compareTo(s1);
	}

}
