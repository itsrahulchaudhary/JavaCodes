package in.rahulit.util;

import java.util.Comparator;

public class MyComp implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		String s1= (String)obj1;
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}
