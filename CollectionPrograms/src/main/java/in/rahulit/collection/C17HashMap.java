package in.rahulit.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class C17HashMap {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("chiranjeevi", 700);
		m.put("balaiah", 800);
		m.put("venkatesh", 200);
		m.put("nagarjuna", 500);
		System.out.println(m); // {balaiah=800, chiranjeevi=700, venkatesh=200, nagarjuna=500}
		System.out.println(m.put("chiranjeevi", 1000)); // 700
		Set s = m.keySet();
		System.out.println(s); // [balaiah, chiranjeevi, venkatesh, nagarjuna]
		Collection values = m.values();
		System.out.println(values); // [800, 1000, 200, 500]
		Set entrySet = m.entrySet();
		System.out.println(entrySet); // [balaiah=800, chiranjeevi=1000, venkatesh=200, nagarjuna=500]
		Iterator itr = entrySet.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + " ------ " + m1.getValue());
			if (m1.getKey().equals("nagarjuna")) {
				m1.setValue(1000);
			}
		}
		System.out.println(m); // {balaiah=800, chiranjeevi=1000, venkatesh=200, nagarjuna=1000}

	}

}
