package Selenium;

import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		System.out.println("Program is started");
		/*Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		try {
		System.out.println(100/num);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("you have entered wrong input");
		}*/
		
	String s=null;
	try {
	System.out.println(s.length());
	}
	catch(Exception e) {
		System.out.println("Exception handled");
	}
	finally {
		System.out.println("finally block exceuted");
	}
	System.out.println("program is over");
	}

}
