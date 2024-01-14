package Selenium;

public class BQR extends MNO implements XYZ,ABC  {
	
	public static void main(String[] args) {
		BQR q=new BQR();
		q.m1();
		q.m2();
		q.m3();
	}

	public void m1() {
		System.out.println("m1 form ABC");
		System.out.println(x);
	}

	public void m2() {
		System.out.println("m2 from XYZ");
		System.out.println(y);
	}



}
