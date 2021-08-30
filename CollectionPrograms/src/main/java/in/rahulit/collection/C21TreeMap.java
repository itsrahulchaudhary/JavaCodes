package in.rahulit.collection;

import java.util.TreeMap;

public class C21TreeMap {
	public static void main(String[] args) {
		TreeMap m = new TreeMap();
		m.put(100, "zzz");
		m.put(103, "yyy");
		m.put(101, "xxx");
		m.put(104, 106);
	//	m.put("fff", "xxx"); // CCE
	//	m.put(null, "xxx");  // NPE
		System.out.println(m);  // {100=zzz, 101=xxx, 103=yyy, 104=106}


	}

}
