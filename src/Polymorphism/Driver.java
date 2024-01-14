package Polymorphism;

public class Driver {

	public static void main(String[] args) {
		B obj1=new B();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		A obj2=obj1;
		System.out.println(obj2.a);
		System.out.println(obj2.b);
	}

}
