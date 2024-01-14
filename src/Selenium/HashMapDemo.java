package Selenium;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap <Integer,String> hs=new <Integer,String>HashMap();
		hs.put(11, "Ankit");
		hs.put(12, "Sonal");
		hs.put(11, "Amit");
		hs.put(14, "Ankit");
		System.out.println(hs);
		System.out.println(hs.size());
		//hs.remove(11);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.get(12));
		System.out.println(hs.keySet());
		for(Object x:hs.keySet()) {
			System.out.println(hs.get(x));
		}
		hs.clear();
		System.out.println(hs);
	}
}