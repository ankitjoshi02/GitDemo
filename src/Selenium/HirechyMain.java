package Selenium;
class D{
	int x;
	void showD() {
		System.out.println(x);
	}
}
class E extends D{
	int y;
	void showE() {
		System.out.println(y);
	}
}
class F extends D{
	int z;
	void showF() {
		System.out.println(z);
	}
}
public class HirechyMain {

	public static void main(String[] args) {
		F fobj=new F();
		fobj.x=40;
		fobj.z=60;
			
		fobj.showD();
		fobj.showF();
		
		E eobj=new E();
		eobj.x=100;
		eobj.y=200;
	}
}
