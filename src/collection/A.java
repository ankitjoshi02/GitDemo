package collection;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Ankit");
		a1.add("Joshi");
		a1.add("Khairthal");
		System.out.println(a1);
		String s=a1.get(0);
		for(Object i:a1) {
			System.out.println(i);
		}
	}
}
