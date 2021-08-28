package in.rahulit.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class C16Employee implements Comparable {
	String name;
	int eid;

	public C16Employee(String name, int eid) {
		super();
		this.name = name;
		this.eid = eid;
	}

	@Override
	public String toString() {
		return name + " --- " + eid;
	}

	@Override
	public int compareTo(Object obj) {
		int eid1 = this.eid;
		C16Employee e = (C16Employee) obj;
		int eid2 = e.eid;
		if (eid1 < eid2) {
			return -1;
		} else if (eid1 > eid2) {
			return +1;
		} else {
			return 0;
		}
	}

}

class MyComparator5 implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		C16Employee e1 = (C16Employee) obj1;
		C16Employee e2 = (C16Employee) obj2;
		String s1 = e1.name;
		String s2 = e2.name;

		return s1.compareTo(s2);
	}

}