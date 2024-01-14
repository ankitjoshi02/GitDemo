package Selenium;
class Bank{
	double roi() {
		return 0.0;
	}
}
class ICICI extends Bank{
	double roi() {
		return 10.5;
	}
}
class AXIS extends Bank{
	double roi() {
			return 11.5;
		}
	}

public class OverridingMain {

	public static void main(String[] args) {
		AXIS xobj= new AXIS();
		System.out.println(xobj.roi());
	}
}
