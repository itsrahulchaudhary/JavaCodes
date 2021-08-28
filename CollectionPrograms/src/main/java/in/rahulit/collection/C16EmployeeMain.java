package in.rahulit.collection;

import java.util.TreeSet;

public class C16EmployeeMain {
	public static void main(String[] args) {

		C16Employee e1 = new C16Employee("nag", 100);
		C16Employee e2 = new C16Employee("balaiah", 200);
		C16Employee e3 = new C16Employee("chiru", 50);
		C16Employee e4 = new C16Employee("venki", 150);
		C16Employee e5 = new C16Employee("nag", 100);

		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t); // [chiru --- 50, nag --- 100, venki --- 150, balaiah --- 200]

		TreeSet t2 = new TreeSet(new MyComparator5());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		System.out.println(t2); // [balaiah --- 200, chiru --- 50, nag --- 100, venki --- 150]

	}
}
