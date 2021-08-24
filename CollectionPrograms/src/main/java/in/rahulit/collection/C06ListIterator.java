package in.rahulit.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class C06ListIterator {
	public static void main(String[] args) {
		LinkedList l = new LinkedList<>();
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		System.out.println(l); // [balakrishna, venki, chiru, nag]
		ListIterator itr = l.listIterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			if (s.equals("venki")) {
				itr.remove(); // [balakrishna, chiru, nag]
			} else if (s.equals("nag")) {
				itr.add("chaitu"); // [balakrishna, chiru, nag, chaitu]
			} else if (s.equals("chiru")) {
				itr.set("charan"); // [balakrishna, charan, nag, chaitu]
			}
		}
		System.out.println(l);
	}

}
