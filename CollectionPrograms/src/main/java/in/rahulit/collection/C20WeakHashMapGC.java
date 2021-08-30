package in.rahulit.collection;

 
import java.util.WeakHashMap;

public class C20WeakHashMapGC {
	public static void main(String[] args) throws Exception {
		WeakHashMap m = new WeakHashMap();
		Temp1 t = new Temp1();
		m.put(t, "durga");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);

	}

}

class Temp1 {
	public String toString() {
		return "temp";
	}

	public void finalize() {
		System.out.println("Filnalize method called::");
	}
}
