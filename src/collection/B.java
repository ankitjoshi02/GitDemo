package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class B {

	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put(1, "Ankit");
		h1.put(4,"Anil");
		h1.put(3, "harsh");
		System.out.println(h1);
		System.out.println(h1.size());
		h1.remove(3);
		System.out.println(h1);
		System.out.println(h1.size());

		System.out.println("------------------------------------------------");
		HashMap<Integer, String> h2=new HashMap<>();
		h2.put(1, "Ram");
		h2.put(2,"Laxman");
		h2.put(7, "Ravan");
		h2.put(0,"Sita");
		System.out.println(h2.containsKey(2));
		System.out.println(h2.containsValue("Ravan"));
		System.out.println(h2.get(1));
		System.out.println(h2.get(2));

		System.out.println("-----------------------------------------------------");

		Set s=h2.keySet();
		for(Object i:s) {
			System.out.println(i);

			System.out.println("--------------------------------------------------------");
			Collection v=h1.values();
			for(Object i1:v) {
				System.out.println(i1);
			}

			System.out.println("---------------------------------------------------");
			HashMap<String, Integer> h3=new HashMap<>();
			h3.put("Tuborg", 180);
			h3.put("Kf", 200);
			h3.put("Bullet", 160);
			h3.put("RL", 2600);
			System.out.println(h3);
			for(Map.Entry<String,Integer> i3:h3.entrySet()) {
				System.out.println(i3);
			}
		}

	}
}
