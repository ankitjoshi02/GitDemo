package Extra;

public class A {
	int i;
	static int j;
	{
		System.out.println("From the IIB of A");
	}
	A(int i){
		this.i=i;
		System.out.println("From A()");
	}
	public static int test() {
		System.out.println("From static test() of A");
		return 10;
	}
}
