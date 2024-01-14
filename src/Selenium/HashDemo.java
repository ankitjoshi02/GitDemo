package Selenium;

import java.util.HashSet;

public class HashDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add("Abcd");
		hs.add('a');
		hs.add(true);
		hs.add(100);
		hs.add(null);
		hs.add(100);
		System.out.println(hs);
		System.out.println(hs.size());
		hs.remove(100);
		System.out.println(hs);
		System.out.println(hs.size());
		for (Object x:hs) {
			System.out.println(x);
		}
	}

}
