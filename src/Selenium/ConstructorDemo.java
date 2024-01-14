package Selenium;

public class ConstructorDemo {
	int x,y;
	String z;
	/*ConstructorDemo(){
		x=10;
		y=20;
		z="Welcome";
	}*/
	ConstructorDemo(int a,int b,String c) {
		x=a;
		y=b;
		z=c;
			
	}
	void Display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	public static void main(String[] args) {
		//ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cd=new ConstructorDemo(10,20,"Welcome");
		cd.Display();
	}
	}


