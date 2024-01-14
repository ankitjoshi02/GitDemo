package Selenium;

public class StudentMain {
	
	public static void main(String[] args) {
		Student stu=new Student(101,"Ankit",15000);
		/*stu.id=101;
		stu.name="Amit";
		stu.sal=10000;
		*/
		stu.setData(101,"Ankit",15000);
		stu.show();
		}
	}

