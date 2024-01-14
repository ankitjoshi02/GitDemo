package Selenium;
class A{
	int a;
	void displayA() {
		System.out.println(a);
	}
}

class B extends A
{
	int b;
	void displayB() {
		System.out.println(b);
	}
}
class C extends B{
	int c;
	void diaplsyC() {
		System.out.println(c);
	}
}

public class Inharitance {

	public static void main(String[] args) {
		C cobj=new C();
		cobj.a=10;
		cobj.b=20;
		cobj.c=30;
		cobj.displayA();
		cobj.displayB();
		cobj.diaplsyC();
		
	}

}
