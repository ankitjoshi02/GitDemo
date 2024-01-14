package Selenium;

public class ConstructorOverloading {
	int x,y,z;
	double d;
	ConstructorOverloading(){
		x=10;
		y=20;
	}
	void display() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		ConstructorOverloading co=new ConstructorOverloading();
		co.display();
	}

}
