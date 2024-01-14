package Extra;

public class B {
	static int j;
	{
		System.out.println("from B()");
		System.out.println(j);
	}
	public static void main(String[] args) {
	System.out.println("from main() of B");
	A obj1=new A(5);
	j=A.test();
	B obj2=new B();
	System.out.println(j);
	System.out.println(obj1.i);

	}

}
