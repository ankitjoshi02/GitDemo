package Selenium;

public class AccountMain {

	public static void main(String[] args) {
		Account obj=new Account();
		obj.setAccno(1234);
		obj.setName("Ankit");
		obj.setAmt(34);
		
		System.out.println(obj.getAccno());
		System.out.println(obj.getName());
		System.out.println(obj.getAmt());
	}

}
