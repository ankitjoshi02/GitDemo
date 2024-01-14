package Polymorphism;

public class Driver2 {

	public static void main(String[] args) 
	{
		SuperClass obj1=new SubClass();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		obj1.test1();
		obj1.test2();
		
	}

}
