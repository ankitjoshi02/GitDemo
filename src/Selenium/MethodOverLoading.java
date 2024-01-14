package Selenium;

public class MethodOverLoading {
	int x,y,z;
	double d;
	void sum() {
		x=10;
		y=10;
		System.out.println(x+y);
	}
	void sum(int a,int b) {
		x=a;
		y=b;
		System.out.println(x+y);
	}
	void sum(int c,double g) {
		x=c;
		d=g;
		System.out.println(x+d);
	}
	public static void main(String[] args) {
		MethodOverLoading mo=new MethodOverLoading();
		mo.sum();
		mo.sum(10, 10);
		mo.sum(10, 10.2);
		
	}

}
