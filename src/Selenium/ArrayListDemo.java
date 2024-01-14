package Selenium;

import java.util.ArrayList;
import java.util.List;
class EmploX{
	int x=0;
}
public class ArrayListDemo {

	public static void main(String[] args) {
		/*EmploX emp1=new EmploX();
		EmploX emp2=new EmploX();
		EmploX emp3=new EmploX();*/
		ArrayList mylist=new ArrayList();
		//ArrayList <Integer>mylist=new ArrayList<Integer>();
		//List mylist=new ArrayList();
		mylist.add(100);
		mylist.add(10.2);
		mylist.add("Abcd");
		mylist.add(true);
		mylist.add('a');
		mylist.add(null);
		mylist.add(null);
		/*mylist.add(emp1);
		mylist.add(emp2);
		mylist.add(emp3);*/
		
		int n=mylist.size();
		System.out.println(n);
		System.out.println(mylist);
		
		mylist.remove(0);
		int m=mylist.size();
		System.out.println("After removing number of elements"+m);
		System.out.println("after removing "+mylist);
		mylist.add(2, "Java");
		System.out.println("After adding from index "+mylist);
		Object z = mylist.get(0);
		System.out.println(z);
		
		for(Object x:mylist) {
			System.out.println(x);
		}
		mylist.clear();
		System.out.println("after clearing "+mylist);
	}
}
