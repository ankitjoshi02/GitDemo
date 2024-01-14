package Selenium;

public class Student {
	int id;
	String name;
	int sal;
	void show() {
		System.out.println(id+" "+name+" "+sal);
	}
	void setData(int sid,String sname,int sl) {
		id=sid;
		name=sname;
		sal=sl;
	}
	Student(int sid,String sname,int sl){
		id=sid;
		name=sname;
		sal=sl;
	}
}
