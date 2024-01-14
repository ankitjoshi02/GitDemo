package Selenium;

public class Animal {
	String color="White";
	void eat() {
		System.out.println("eating ......");
	}
}
class Dog extends Animal{
	String color="Black";
	void display() {
		System.out.println(super.color);
	}
	void eat() {
		super.eat();
	}
}
