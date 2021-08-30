package in.rahulit.collection;

import java.util.Hashtable;

import in.rahulit.util.Tempor;

public class C23Hashtable {
	public static void main(String[] args) {
		Hashtable  h = new Hashtable();
		h.put(new Tempor(5), "A");
		h.put(new Tempor(2), "B");
		h.put(new Tempor(6), "C");
		h.put(new Tempor(15), "D");
		h.put(new Tempor(23), "E");
		h.put(new Tempor(16), "F");
		//h.put("durga", null);  // NPE
		System.out.println(h); // {6=C, 16=F, 5=A, 15=D, 2=B, 23=E}


	}

}


 