package Selenium;

public class Employee {
	String name;
	int sal;
	String job;
	int eid;
	void display() {
		System.out.println(name);
		System.out.println(sal);
		System.out.println(eid );
		System.out.println(job);
	}
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.name="Ankit";
		emp1.sal=15000;
		emp1.eid=101;
		emp1.job="Software Tester";
		
		emp1.display();
	}

}
