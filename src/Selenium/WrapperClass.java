package Selenium;

public class WrapperClass {

	public static void main(String[] args) {
		int i=10;
		double d=20.2;
		float f=30;
		byte b=40;
		long l=50;
		char c='c';
		boolean x=true;
		short s=60;
		
		Integer iobj=i;
		Double dobj=d;
		Float fobj=f;
		Byte bobj=b;
		Long lobj=l;
		Character cobj=c;
		Boolean xobj=x;
		Short sobj=s;

		
		System.out.println("Integer  "+iobj);
		System.out.println("Double"+dobj);
		System.out.println("Float "+fobj);
		System.out.println("Byte "+bobj);
		System.out.println("Long "+lobj);
		System.out.println("Char "+cobj);
		System.out.println("Boolean "+xobj);
		System.out.println("Short "+sobj);
		
		int integervalue=iobj;
		double doublevalue=dobj;
		float floatvalue=fobj;
		byte byetevalue=bobj;
		long lognvalue=lobj;
		char charvalue=cobj;
		boolean booleanvalue=xobj;
		short shortvalue=sobj;
		
		System.out.println("x");
		System.out.println("integervalue "+integervalue);
		System.out.println("doublevalue "+doublevalue);
		System.out.println("floatvalue "+floatvalue);
		System.out.println("byetevalue "+byetevalue);
		System.out.println("lognvalue "+lognvalue);
		System.out.println("charvalue "+charvalue);
		System.out.println("booleanvalue "+booleanvalue);
		System.out.println("shortvalue "+shortvalue);
	}

}
