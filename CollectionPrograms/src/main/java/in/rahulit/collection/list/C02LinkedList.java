package in.rahulit.collection.list;

import java.util.LinkedList;

public class C02LinkedList {
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.add("durga");
		ls.add(30);
		ls.add(null);
		ls.add("durga");
		System.out.println(ls); // [durga, 30, null, durga]
		ls.set(0, "software");
		System.out.println(ls); // [software, 30, null, durga]
		ls.add(0, "rahul");
		System.out.println(ls); // [rahul, software, 30, null, durga]
		ls.removeLast();
		System.out.println(ls); // [rahul, software, 30, null]
		ls.addFirst("cccc");
		System.out.println(ls); // [cccc, rahul, software, 30, null]
	}

}
