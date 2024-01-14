package Extra;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class C {

	static public void main(String[] args) {
		HashMap a=new HashMap();
		a.put(1, "Rs");
		a.put(2, "Rc");
		a.put(3, "Anti");
		a.put(4, "RL");
		System.out.println(a);
		System.out.println(a.containsKey(1));
		System.out.println(a.containsKey(7));
		System.out.println(a.containsValue("Rs"));
		System.out.println(a.containsValue("adfs"));
		System.out.println("---------------------------------------------------------");

		HashMap<Integer, String> b=new HashMap<>();
		b.put(2, "Whiskey");
		b.put(9, "rum");
		b.put(4, "Zeb");

		Set s=b.keySet();
		for(Object i:s) {
			System.out.println(i);
		}
		System.out.println("--------------------------------------------------------");
		Collection x=b.values();
		for(Object j:x) {
			System.out.println(j);
		}
	}

}
